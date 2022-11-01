package com.dashboard.backend.dashboard.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GlobalExceptions {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> processErrorResourceNotFound(ResourceNotFoundException resNotFoundEx){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error: "+ resNotFoundEx.getMessage());
    }
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<String> processErrorBadRequest(BadRequestException badReqEx){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: "+ badReqEx.getMessage());
    }
}
