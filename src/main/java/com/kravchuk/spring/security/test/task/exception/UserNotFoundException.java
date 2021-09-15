package com.kravchuk.spring.security.test.task.exception;

import org.springframework.security.authentication.BadCredentialsException;

public class UserNotFoundException extends BadCredentialsException {

    public UserNotFoundException() {
        super("This is a custom exception with a custom exception message!");
    }
}
