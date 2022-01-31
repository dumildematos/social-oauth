package com.auth.socialoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class SocialOauthApplication {

    @GetMapping
    public String welcome(){
        return "Welcome from Google";
    }

    @GetMapping("/user")
    public Principal user(Principal principal) {
        System.out.println("Username" + principal.getName());
        return principal;
    }

    public static void main(String[] args) {
        SpringApplication.run(SocialOauthApplication.class, args);
    }

}
