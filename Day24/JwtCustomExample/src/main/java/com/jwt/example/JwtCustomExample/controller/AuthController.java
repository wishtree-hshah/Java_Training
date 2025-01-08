package com.jwt.example.JwtCustomExample.controller;

import com.jwt.example.JwtCustomExample.entity.JwtResponse;
import com.jwt.example.JwtCustomExample.util.JwtHelper;
import com.jwt.example.JwtCustomExample.entity.User;
import com.jwt.example.JwtCustomExample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

/**
 * The type Auth controller.
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtHelper jwtHelper;

    @Autowired
    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    /**
     * Instantiates a new Auth controller.
     *
     * @param passwordEncoder the password encoder
     */
    public AuthController(PasswordEncoder passwordEncoder){
        this.passwordEncoder = passwordEncoder;
    }

    /**
     * Login response entity.
     *
     * @param username the username
     * @param password the password
     * @return the response entity
     */
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username,password)
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtHelper.generateToken(username);

        return ResponseEntity.ok(new JwtResponse(token, username));
    }

    /**
     * Register response entity.
     *
     * @param user the user
     * @return the response entity
     */
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(passwordEncoder.encode(user.getPassword()));
        newUser.setRole("ROLE_".concat(user.getRole().toUpperCase()));
        userRepository.save(newUser);

        return ResponseEntity.ok("User registered successfully");
    }
}
