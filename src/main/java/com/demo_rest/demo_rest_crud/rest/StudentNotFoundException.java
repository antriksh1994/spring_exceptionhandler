package com.demo_rest.demo_rest_crud.rest;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
    //   not used
    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    //   not used
    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }
}
