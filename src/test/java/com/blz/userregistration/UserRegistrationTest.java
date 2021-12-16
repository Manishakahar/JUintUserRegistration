package com.blz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    // User Register Fast Name
    @Test
    public void whenGivenFirstName_ShouldHaveMinimum3CharWithCamelCase() {
        UserRegistration validator = new UserRegistration();
        String firstName = validator.validateFirstName("Manisha");
        Assert.assertEquals("valid", firstName);
    }

    @Test
    public void whenGivenFirstName_WithSmallLetter() {
        UserRegistration validator = new UserRegistration();
        String firstName = validator.validateFirstName("manisha");
        Assert.assertEquals("Invalid", firstName);
    }

    @Test
    public void whenGivenFirstName_WithOtherLetterCapital() {
        UserRegistration validator = new UserRegistration();
        String firstName = validator.validateFirstName("mANisha");
        Assert.assertEquals("Invalid", firstName);
    }

    // User Register Last Name
    @Test
    public void whenGivenLastName_ShouldHaveMinimum3CharWithCamelCase() {
        UserRegistration validator = new UserRegistration();
        String lastName = validator.validateFirstName("Kahar");
        Assert.assertEquals("valid", lastName);
    }

    @Test
    public void whenGivenLastName_WithSmallLetter() {
        UserRegistration validator = new UserRegistration();
        String lastName = validator.validateLastName("kahar");
        Assert.assertEquals("Invalid", lastName);
    }

    @Test
    public void whenGivenLastName_WithOtherLetterCapital() {
        UserRegistration validator = new UserRegistration();
        String lastName = validator.validateFirstName("KAhar");
        Assert.assertEquals("Invalid", lastName);
    }

    // User Register Email-id
    @Test
    public void whenGivenEmail_Valid() {
        UserRegistration validator = new UserRegistration();
        String Email = validator.validateEmailID("abc.xyz@bl.co.in");
        Assert.assertEquals("valid", Email);
    }

    @Test
    public void whenGivenEmail_WithoutatSignShouldReturnInvalid() {
        UserRegistration validator = new UserRegistration();
        String Email = validator.validateEmailID("abc.xyz.bl.co.in");
        Assert.assertEquals("Invalid", Email);
    }

    @Test
    public void whenGivenEmail_StartWithDotShouldReturnInvalid() {
        UserRegistration validator = new UserRegistration();
        String Email = validator.validateEmailID(".1abc.xyz@bl.co.in");
        Assert.assertEquals("Invalid", Email);
    }

    // User Register Password
    @Test
    public void whenGivenPassword_Valid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePassword("Riya@123");
        Assert.assertEquals("valid", password);
    }

    @Test
    public void whenGivenPassword_LessThan8CharacterShouldReturnInValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePassword("Raj@123");
        Assert.assertEquals("Invalid", password);
    }

    @Test
    public void whenGivenPassword_WithoutUpperCaseShouldReturnInValid (){
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePassword("riya123");
        Assert.assertEquals("Invalid", password);
    }

    @Test
    public void whenGivenPassword_WithoutIntegerCaseShouldReturnInvalid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePassword("riya@hy");
        Assert.assertEquals("Invalid", password);
    }
    // User Register Phone Number

    @Test
    public void whenGivenPhoneNumber_Valid() {
        UserRegistration validator = new UserRegistration();
        String PhoneNo = validator.validatePhoneNumber("91 9919819801");
        Assert.assertEquals("valid", PhoneNo);
    }
    @Test
    public void whenGivenMobileNo_WithoutCountryCodeShouldReturnInvalid() {
        UserRegistration validator = new UserRegistration();
        String PhoneNo = validator.validatePhoneNumber("+ 9919819801");
        Assert.assertEquals("Invalid", PhoneNo);
    }

    @Test
    public void whenGivenMobileNo_WithoutSpaceShouldReturnInvalid() {
        UserRegistration validator = new UserRegistration();
        String PhoneNo = validator.validatePhoneNumber("+919919819801");
        Assert.assertEquals("Invalid", PhoneNo);
    }
}



