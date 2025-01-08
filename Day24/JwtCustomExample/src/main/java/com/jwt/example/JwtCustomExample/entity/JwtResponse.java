package com.jwt.example.JwtCustomExample.entity;

/**
 * The type Jwt response.
 */
public class JwtResponse {
    private String token;
    private String username;

    /**
     * Instantiates a new Jwt response.
     *
     * @param token    the token
     * @param username the username
     */
    public JwtResponse(String token, String username) {
        this.token = token;
        this.username = username;
    }

    /**
     * Instantiates a new Jwt response.
     */
    public JwtResponse() {
    }

    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets token.
     *
     * @param token the token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }
}