package com.test.project.service;

/**
 * Service (service) Exceptions such as "account or password is incorrect", the exceptions for only INFO level of logging @see WebMvcConfigurer
 */
public class ServiceException extends RuntimeException {
  

	public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
