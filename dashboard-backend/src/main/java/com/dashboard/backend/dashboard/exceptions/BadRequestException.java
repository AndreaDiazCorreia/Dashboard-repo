package com.dashboard.backend.dashboard.exceptions;

public class BadRequestException extends Exception {
    public BadRequestException(String message){
        super(message);
    }
}
