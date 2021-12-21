package com.blz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    // User Register Fast Name is Valid
    @Test
    public void GivenFirstNameCase1_WhenHaveMinimum3CharWithCamelCaseShouldReturnValidName() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        String firstName = userRegistration.validateFirstName.iValidator("Manisha");
        Assert.assertEquals("valid", firstName);
    }

    // User Register Fast Name is Invalid
    @Test
    public void GivenFirstNameCase2_WhenSmallLetterCaseShouldReturnInvalidName() {
        try {
            UserRegistration useRegistration = new UserRegistration();
            useRegistration.validateFirstName.iValidator("manisha");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter valid first name", userRegistrationException.message);
        }
    }

    //  User Register Fast Name is Empty
    @Test
    public void GivenFirstNameCase3_WhenInCseOfEmptyShouldReturnEmptyValue() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validateFirstName.iValidator("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter the First name", userRegistrationException.message);
        }
    }

    // User Register Fast Name is Null
    @Test
    public void GivenFirstNameCase4_WhenInCaseOfNullShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validateFirstName.iValidator(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    // User Register Last Name is valid
    @Test
    public void GivenLastNameCase1_WhenHaveMinimum3CharWithCamelCaseShouldReturnValidName() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        String lastName = userRegistration.validateLastName.iValidator("Kahar");
        Assert.assertEquals("valid", lastName);
    }

    // User register Last Name is Invalid
    @Test
    public void GivenLastNameCase2_WhenSmallLetterCaseShouldReturnInvalidName() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.iValidator("Kahar");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter valid last name", userRegistrationException.message);
        }
    }

    //  User Register Last Name in case  Empty
    @Test
    public void GivenLastNameCase3_WhenInCseOfEmptyShouldReturnEmptyValue() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validateLastName.iValidator("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter the Last name", userRegistrationException.message);
        }
    }

    //User Register Last Name in case  Null
    @Test
    public void GivenLastNameCase4_WhenInCaseOfNullShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validateLastName.iValidator(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    // User Register Phone Number is valid
    @Test
    public void givenPhoneNumber_whenPhoneNumberCorrectShouldReturnValid() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        String PhoneNo = userRegistration.validatePhoneNumber.iValidator("91 9919819801");
        Assert.assertEquals("valid", PhoneNo);
    }

    // User Register Phone Number is Invalid
    @Test
    public void givenPhoneNumberCase2_whenLessMobileNoShouldReturnInvalid() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validatePhoneNumber.iValidator("91 98765423");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter valid PhoneNo", userRegistrationException.message);
        }
    }

    // User Register Phone Number in case of Empty
    @Test
    public void givenPhoneNumberCase3_whenWithoutSpaceShouldReturnEmptyValue() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validatePhoneNumber.iValidator("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter the PhoneNo", userRegistrationException.message);
        }
    }

    // User Register Phone Number in case  Null Value
    @Test
    public void givenPhoneNumberCase4_whenStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validatePhoneNumber.iValidator(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }
}



