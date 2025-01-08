package com.jwt.example.JwtCustomExample.filter;

import com.jwt.example.JwtCustomExample.util.JwtHelper;
import com.jwt.example.JwtCustomExample.service.CustomUserDetailsService;
import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Jwt request filter.
 */
@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    @Autowired
    private JwtHelper jwtHelper;

    @Autowired
    private CustomUserDetailsService customUserDetailsService;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final String header = request.getHeader("Authorization");
        String username = null;
        String token = null;

        // Check if the request contains the Authorization header with Bearer token
        if (header != null && header.startsWith("Bearer ")) {
            token = header.substring(7);  // Extract token from the header
            username = jwtHelper.extractUsername(token);  // Extract the username from the token
        }

        // If username exists and no authentication is already present
        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            // Validate the token
            if (jwtHelper.validateToken(token, username)) {
                // Extract claims from the token (this includes the roles)
                Claims claims = jwtHelper.extractClaims(token);

                // Extract roles from the claims and map to GrantedAuthority
                List<GrantedAuthority> authorities = (List<GrantedAuthority>) claims.get("roles", List.class).stream()
                        .map(role -> new SimpleGrantedAuthority((String) role))  // No need for "ROLE_" prefix if added during token creation
                        .collect(Collectors.toList());

                // Create authentication token with username and authorities
                UsernamePasswordAuthenticationToken authentication =
                        new UsernamePasswordAuthenticationToken(username, null, authorities);

                // Set authentication details for the current request
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                // Set authentication in the SecurityContext
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }

        // Continue with the filter chain
        filterChain.doFilter(request, response);
    }

}
