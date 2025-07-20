package com.cognizant.spring_learn.controller;

import java.security.Key;
import java.util.Base64;
import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AuthenticationController {

    private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256); // Secret key

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return ResponseEntity.status(401).body("Missing or invalid Authorization header.");
        }

        String base64Credentials = authHeader.substring("Basic ".length()).trim();
        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(decodedBytes);
        String[] userDetails = credentials.split(":", 2);

        if (userDetails.length != 2 || !isValidUser(userDetails[0], userDetails[1])) {
            return ResponseEntity.status(401).body("Invalid credentials.");
        }

        // Generate JWT
        String jwt = Jwts.builder()
                .setSubject(userDetails[0])
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 1000)) // expires in 1 hour
                .signWith(key)
                .compact();

        return ResponseEntity.ok().body("{\"token\":\"" + jwt + "\"}");
    }

    private boolean isValidUser(String username, String password) {
        return "user".equals(username) && "pwd".equals(password); // Hardcoded for practice
    }
}
