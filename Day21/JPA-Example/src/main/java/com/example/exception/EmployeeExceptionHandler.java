package com.example.exception;

import com.example.dto.EmployeeErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * The type Employee exception handler.
 */
@ControllerAdvice
public class EmployeeExceptionHandler {
    /**
     * Handle exception response entity.
     *
     * @param employeeNotFoundException the employee not found exception
     * @return the response entity
     */
    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeNotFoundException employeeNotFoundException){
        EmployeeErrorResponse employeeErrorResponse = new EmployeeErrorResponse();
        employeeErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        employeeErrorResponse.setMessage(String.valueOf(employeeNotFoundException.getMessage()));
        employeeErrorResponse.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(employeeErrorResponse,HttpStatus.NOT_FOUND);
    }
}
