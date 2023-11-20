package co.finecode.food.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

@Controller
public class FoodItemController {

    @GetMapping("/fooditem")
    @PreAuthorize("hasAuthority('SCOPE_profile')")
    ModelAndView userDetails(OAuth2AuthenticationToken authentication) {
        return new ModelAndView("userProfile", Collections.singletonMap("details", authentication.getPrincipal().getAttributes()));
    }
}
