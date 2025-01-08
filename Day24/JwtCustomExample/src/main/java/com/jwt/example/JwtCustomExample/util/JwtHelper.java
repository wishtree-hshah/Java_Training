package com.jwt.example.JwtCustomExample.util;

import com.jwt.example.JwtCustomExample.entity.User;
import com.jwt.example.JwtCustomExample.repository.UserRepository;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The type Jwt helper.
 */
@Component
public class JwtHelper {

    @Autowired
    private UserRepository userRepository;

    private String secret = "jdkfjsldsdkdlddksclsfmkdhskdjhgfjskfvhjbdgskjsdngjksdkjbfjflklmdksdmkjlkejfekdlkdsdkfjssk";  // Use a more secure key in production
    /**
     * The constant JWT_TOKEN_VALIDITY.
     */
    public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;  // 5 hours

    /**
     * Generate token string.
     *
     * @param username the username
     * @return the string
     */
    public String generateToken(String username) {
        User user = userRepository.findByUsername(username);
        String role = user.getRole();  // Assuming getRole() returns a single role as a string

        // Adding the role to the token as a list
        return Jwts.builder()
                .setSubject(username)
                .claim("roles", Collections.singletonList(role))  // Wrap the role in a list
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }


    /**
     * Extract claims claims.
     *
     * @param token the token
     * @return the claims
     */
    public Claims extractClaims(String token) {
        try {
            return Jwts.parser()
                    .setSigningKey(secret)
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            throw new RuntimeException("Invalid JWT token", e);
        }
    }


    /**
     * Extract username string.
     *
     * @param token the token
     * @return the string
     */
    public String extractUsername(String token) {
        return extractClaims(token).getSubject();
    }

    /**
     * Is token expired boolean.
     *
     * @param token the token
     * @return the boolean
     */
    public boolean isTokenExpired(String token) {
        return extractClaims(token).getExpiration().before(new Date());
    }

    /**
     * Validate token boolean.
     *
     * @param token    the token
     * @param username the username
     * @return the boolean
     */
    public boolean validateToken(String token, String username) {
        return (username.equals(extractUsername(token)) && !isTokenExpired(token));
    }
}
