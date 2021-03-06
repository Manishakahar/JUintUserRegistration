package com.blz.userregistration;

public class UserRegistration implements IValidator {
    public String VALIDATE_NAME = "^[A-Z]{1}[a-z]{2,}$";
    public String VALIDATE_EMAIL = "^[a-z0-9]{3,20}([_+.-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$";
    public String VALIDATE_PHONE_NUMBER = "^[1-9]{2}( )[0-9]{10}$";
    public String VALIDATE_PASSWORD_WITH_RULE = "^([a-zA-Z0-9])?.{8,}$";

    // First Name
    public IValidator validateFirstName = (firstName) -> {
        try {
            if (firstName.length() == 0) {
                throw new UserRegistrationException("Please enter the First name", UserRegistrationException.ExceptionType.EMPTY);
            }
            if (firstName.matches(VALIDATE_NAME)) {
                return "valid";
            } else {
                throw new UserRegistrationException("Please enter valid first name", UserRegistrationException.ExceptionType.INVALID);
            }
        } catch (NullPointerException exception) {
            throw new NullPointerException(exception.getMessage());
        }
    };

    // Last Name
    public IValidator validateLastName = (lastName) -> {
        try {
            if (lastName.length() == 0) {
                throw new UserRegistrationException("Please enter the Last name", UserRegistrationException.ExceptionType.EMPTY);
            }
            if (lastName.matches(VALIDATE_NAME)) {
                return "valid";
            } else {
                throw new UserRegistrationException("Please enter valid last name", UserRegistrationException.ExceptionType.INVALID);
            }
        } catch (NullPointerException exception) {
            throw new NullPointerException(exception.getMessage());
        }
    };

    // Email-Id
    public IValidator validateEmailID = (Email) -> {
        try {
            if (Email.length() == 0) {
                throw new UserRegistrationException("Please enter the Email-id", UserRegistrationException.ExceptionType.EMPTY);
            }
            if (Email.matches(VALIDATE_EMAIL)) {
                return "valid";
            } else {
                throw new UserRegistrationException("Please enter valid Email-id", UserRegistrationException.ExceptionType.INVALID);
            }
        } catch (NullPointerException exception) {
            throw new NullPointerException(exception.getMessage());
        }
    };
    public IValidator validatePasswordWithRule = (Password) -> {
        try {
            if (Password.length() == 0) {
                throw new UserRegistrationException("Please enter the Password", UserRegistrationException.ExceptionType.EMPTY);
            }
            if (Password.matches(VALIDATE_PASSWORD_WITH_RULE)) {
                return "valid";
            } else {
                throw new UserRegistrationException("Please enter valid Password", UserRegistrationException.ExceptionType.INVALID);
            }
        } catch (NullPointerException exception) {
            throw new NullPointerException(exception.getMessage());
        }
    };

    public IValidator validatePhoneNumber = (PhoneNo) -> {
        try {
            if (PhoneNo.length() == 0) {
                throw new UserRegistrationException("Please enter the PhoneNo", UserRegistrationException.ExceptionType.EMPTY);
            }
            if (PhoneNo.matches(VALIDATE_PHONE_NUMBER)) {
                return "valid";
            } else {
                throw new UserRegistrationException("Please enter valid PhoneNo", UserRegistrationException.ExceptionType.INVALID);
            }
        } catch (NullPointerException exception) {
            throw new NullPointerException(exception.getMessage());
        }
    };

    @Override
    public String iValidator(String value) throws UserRegistrationException {
        return null;
    }
}

