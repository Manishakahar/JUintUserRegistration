package com.blz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    // User Register Fast Name is Valid
    @Test
    public void whenGivenFirstName_ShouldHaveMinimum3CharWithCamelCase() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String firstName = validator.validateFirstName("Manisha");
        Assert.assertEquals("valid", firstName);
    }

    // User Register Fast Name is Invalid
    @Test
    public void whenGivenFirstName_WithInvalidName() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateFirstName("manisha");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter valid first name", userRegistrationException.message);
        }
    }

    //  User Register Fast Name is Empty
    @Test
    public void whenGivenFirstName_WithEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateFirstName("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter the First name", userRegistrationException.message);
        }
    }

    // User Register Fast Name is Null
    @Test
    public void whenGivenFirstName_WithNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateFirstName(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }


    // User Register Last Name is valid
    @Test
    public void whenGivenLastName_ShouldHaveMinimum3CharWithCamelCase() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String lastName = validator.validateLastName("Kahar");
        Assert.assertEquals("valid", lastName);
    }

    // User register Last Name is Invalid
    @Test
    public void whenGivenLastName_WithSmallLetter() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateLastName("Kahar");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter valid last name", userRegistrationException.message);
        }
    }

    //  User Register Last Name in case  Empty
    @Test
    public void whenGivenLastName_WithEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateLastName("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter the Last name", userRegistrationException.message);
        }
    }

    //User Register Last Name in case  Null
    @Test
    public void whenGivenLastName_WithNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateLastName(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }


    // User Register Email-id is  valid
    @Test
    public void whenGivenEmail_Valid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String Email = validator.validateEmailID("abc.xyz@blz.com");
        Assert.assertEquals("valid", Email);
    }

    //  User Register Email-id is Invalid
    @Test
    public void whenGivenEmail_WithoutSignShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateEmailID("abc.xyz.bl.co.in");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter valid Email-id", userRegistrationException.message);
        }
    }

    // User Register Phone Number is valid
    @Test
    public void whenGivenPhoneNumber_Valid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String PhoneNo = validator.validatePhoneNumber("91 9919819801");
        Assert.assertEquals("valid", PhoneNo);
    }

    // User Register Phone Number is Invalid
    @Test
    public void whenGivenMobileNo_WithoutCountryCodeShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePhoneNumber("91 98765423");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter valid PhoneNo", userRegistrationException.message);
        }
    }

    // User Register Phone Number in case of Empty
    @Test
    public void whenGivenMobileNo_WithoutSpaceShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePhoneNumber("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter the PhoneNo", userRegistrationException.message);
        }
    }

    // User Register Phone Number in case  Null Value
    @Test
    public void whenGivenMobilNo_StartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePhoneNumber(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }


    // User Register Password is valid
    @Test
    public void whenGivenPassword_Valid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule("Riya@123");
        Assert.assertEquals("valid", password);
    }

    // User Register Password is Invalid
    @Test
    public void whenGivenPassword_WithoutIntegerCaseShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePasswordWithRule("abc.xyz.bl.co.in");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter valid password", userRegistrationException.message);
        }
    }
}



