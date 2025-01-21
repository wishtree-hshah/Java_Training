package com.user.service.entities;

import org.springframework.http.HttpStatus;

public class ApiResponse {
    private String message;
    private long timestamp;
    private HttpStatus status;

    public ApiResponse() {
    }

    public ApiResponse(String message, long timestamp, HttpStatus status) {
        this.message = message;
        this.timestamp = timestamp;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
