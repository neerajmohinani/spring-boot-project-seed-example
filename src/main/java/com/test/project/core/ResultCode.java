package com.test.project.core;

/**
 * Enumerated result code for https status codes 
 */
public enum ResultCode {
    SUCCESS(200),// Success
    FAIL(400),// failure
    UNAUTHORIZED(401),// unauthenticated
    NOT_FOUND(404),// interface does not exist
    INTERNAL_SERVER_ERROR(500);// internal server error

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
}
