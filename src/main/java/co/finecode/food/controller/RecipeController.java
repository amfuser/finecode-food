package co.finecode.food.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

@Controller
public class RecipeController {

    @GetMapping("/recipe")
    @PreAuthorize("hasAuthority('SCOPE_profile')")
    ModelAndView recipe(OAuth2AuthenticationToken authentication) {
        return new ModelAndView("recipe", Collections.singletonMap("details", authentication.getPrincipal().getAttributes()));
    }
}
