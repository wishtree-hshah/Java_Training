package com.user.service.exceptions;

import com.user.service.entities.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ApiResponse> handleUserNotFoundException(UserNotFoundException userNotFoundException){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage(userNotFoundException.getMessage());
        apiResponse.setTimestamp(System.currentTimeMillis());
        apiResponse.setStatus(HttpStatus.valueOf(HttpStatus.NOT_FOUND.value()));

        return new ResponseEntity<>(apiResponse,HttpStatus.NOT_FOUND);
    }
}
