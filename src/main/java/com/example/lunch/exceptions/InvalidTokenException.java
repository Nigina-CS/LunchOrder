package com.example.lunch.exceptions;


import com.example.lunch.enums.HttpStatus;

public class InvalidTokenException extends RuntimeException {
    private final HttpStatus status;

    public InvalidTokenException(String message) {
        this(message, HttpStatus.INVALID_TOKEN);
    }

    public InvalidTokenException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
