package com.example.CustomDatabaseAuthentication.controller;

import com.example.CustomDatabaseAuthentication.entity.User;
import com.example.CustomDatabaseAuthentication.service.UserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * The type User controller.
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    /**
     * Instantiates a new User controller.
     *
     * @param userService the user service
     */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Register response entity.
     *
     * @param user     the user
     * @param response the response
     * @return the response entity
     */
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user, HttpServletResponse response) {
        User registeredUser = userService.registerUser(user);

        Cookie cookie = new Cookie("username", registeredUser.getUsername());
        cookie.setHttpOnly(true);
        cookie.setMaxAge(7 * 24 * 60 * 60); // 7 days
        response.addCookie(cookie);

        return ResponseEntity.ok(registeredUser);
    }

    /**
     * Login response entity.
     *
     * @param user     the user
     * @param response the response
     * @return the response entity
     */
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user, HttpServletResponse response) {
        Optional<User> existingUser = userService.findByUsername(user.getUsername());
        if (existingUser.isPresent() && userService.validatePassword(user.getPassword(), existingUser.get().getPassword())) {

            Cookie cookie = new Cookie("username", existingUser.get().getUsername());
            cookie.setHttpOnly(true);
            cookie.setMaxAge(7 * 24 * 60 * 60);
            response.addCookie(cookie);

            return ResponseEntity.ok("Login successful");
        }
        return ResponseEntity.status(401).body("Invalid credentials");
    }
}
