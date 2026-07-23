package spring_learn.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import spring_learn.service.JwtService;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtService jwtService;


    @GetMapping("/authenticate")
    public Map<String,String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        String usernamePassword =
                authHeader.substring("Basic ".length());

        String decoded =
                new String(java.util.Base64.getDecoder()
                .decode(usernamePassword));

        String username =
                decoded.split(":")[0];


        String token = jwtService.generateToken(username);

        Map<String,String> response = new HashMap<>();
        response.put("token", token);

        return response;
    }
}