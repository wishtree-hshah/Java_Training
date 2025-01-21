package com.oauth.controller;

import com.oauth.config.JwtUtil;
import com.oauth.entity.User;
import com.oauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register/oauth2")
    public ResponseEntity<String> registerUser(@AuthenticationPrincipal OAuth2User oauthUser, @RequestParam String role) {
        String email = oauthUser.getAttribute("url");
        String name = oauthUser.getAttribute("login");


        if (userRepository.findByEmail(email).isPresent()) {
            return ResponseEntity.badRequest().body("User already registered.");
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setRole(role);
        userRepository.save(user);

        String token = jwtUtil.generateToken(user.getEmail(), user.getRole());

        return ResponseEntity.ok(token);
    }

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestParam String email) {
        Optional<User> userOptional = userRepository.findByEmail(email);

        if (userOptional.isEmpty()) {
            return ResponseEntity.badRequest().body("User not registered.");
        }

        User user = userOptional.get();
        String token = jwtUtil.generateToken(user.getEmail(), user.getRole()); // Pass email and role separately
        System.out.println(token);
        return ResponseEntity.ok(token);
    }


}
