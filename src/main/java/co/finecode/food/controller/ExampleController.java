package co.finecode.food.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

@Controller
public class ExampleController {
    /**
     * This example controller has endpoints for displaying the user profile info on {code}/{code} and "you have been
     * logged out page" on {code}/post-logout{code}.
     */

    @GetMapping("/")
    String home() {
        return "home";
    }

    @GetMapping("/profile")
    @PreAuthorize("hasAuthority('SCOPE_profile')")
    ModelAndView userDetails(OAuth2AuthenticationToken authentication) {
        return new ModelAndView("userProfile", Collections.singletonMap("details", authentication.getPrincipal().getAttributes()));
    }

    @GetMapping("/hello")
    @PreAuthorize("hasAuthority('SCOPE_profile')")
    String sayHello(@AuthenticationPrincipal Jwt jwt) {
        return String.format("Hello, %s!", jwt.getSubject());
    }
}
