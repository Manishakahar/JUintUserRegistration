package com.blz.userregistration;

@FunctionalInterface
public interface IValidator {
    String iValidator(String value) throws UserRegistrationException;
}

