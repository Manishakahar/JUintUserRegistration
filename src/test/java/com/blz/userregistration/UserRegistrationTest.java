package com.blz.userregistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    @Before
    public void setUp() {
        System.out.println("User Registration");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("User Registration completed");
    }

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

    // User Register Password
    @Test
    public void whenGivenPassword_Valid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule1("Riya@123");
        Assert.assertEquals("valid", password);
    }

    @Test
    public void whenGivenPassword_LessThan8CharacterShouldReturnInValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule1("Raj@123");
        Assert.assertEquals("Invalid", password);
    }

    @Test
    public void whenGivenPassword_WithoutIntegerCaseShouldReturnInvalid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule1("riya@hy");
        Assert.assertEquals("Invalid", password);
    }

    // User Register the Upper case password
    @Test
    public void whenGivenPassword_UpperCaseShouldReturnValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule2("rIya@123");
        Assert.assertEquals("valid", password);
    }

    @Test
    public void whenGivenPassword_UpperCaseLessThan8CharacterShouldReturnInValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule2("Raj@123");
        Assert.assertEquals("Invalid", password);
    }

    @Test
    public void whenGivenPassword_WithoutUpperCaseShouldReturnInValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule2("riya123");
        Assert.assertEquals("Invalid", password);
    }

    @Test
    public void whenGivenPassword_LastNumericNumberShouldReturnValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule3("Riya@123");
        Assert.assertEquals("valid", password);
    }

    @Test
    public void whenGivenPassword_SpecialCharacterShouldReturnValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule4("Riya#123");
        Assert.assertEquals("valid", password);
    }
    @Test
    public void whenGivenPassword_WithoutSpecialCharacterShouldReturnIValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule4("rIya123");
        Assert.assertEquals("Invalid", password);
    }

}



