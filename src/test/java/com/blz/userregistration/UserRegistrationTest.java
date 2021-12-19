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
        Assert.assertEquals("happy", firstName);
    }

    @Test
    public void whenGivenFirstName_WithSmallLetter() {
        UserRegistration validator = new UserRegistration();
        String firstName = validator.validateFirstName("manisha");
        Assert.assertEquals("sad", firstName);
    }

    @Test
    public void whenGivenFirstName_WithOtherLetterCapital() {
        UserRegistration validator = new UserRegistration();
        String firstName = validator.validateFirstName("mANisha");
        Assert.assertEquals("sad", firstName);
    }

    // User Register Last Name
    @Test
    public void whenGivenLastName_ShouldHaveMinimum3CharWithCamelCase() {
        UserRegistration validator = new UserRegistration();
        String lastName = validator.validateFirstName("Kahar");
        Assert.assertEquals("happy", lastName);
    }

    @Test
    public void whenGivenLastName_WithSmallLetter() {
        UserRegistration validator = new UserRegistration();
        String lastName = validator.validateLastName("kahar");
        Assert.assertEquals("sad", lastName);
    }

    @Test
    public void whenGivenLastName_WithOtherLetterCapital() {
        UserRegistration validator = new UserRegistration();
        String lastName = validator.validateFirstName("KAhar");
        Assert.assertEquals("sad", lastName);
    }

    // User Register Email-id
    @Test
    public void whenGivenEmail_Valid() {
        UserRegistration validator = new UserRegistration();
        String Email = validator.validateEmailID("abc.xyz@bl.co.in");
        Assert.assertEquals("happy", Email);
    }

    @Test
    public void whenGivenEmail_WithoutSignShouldReturnInvalid() {
        UserRegistration validator = new UserRegistration();
        String Email = validator.validateEmailID("abc.xyz.bl.co.in");
        Assert.assertEquals("sad", Email);
    }

    @Test
    public void whenGivenEmail_StartWithDotShouldReturnInvalid() {
        UserRegistration validator = new UserRegistration();
        String Email = validator.validateEmailID(".1abc.xyz@bl.co.in");
        Assert.assertEquals("sad", Email);
    }

    // User Register Phone Number
    @Test
    public void whenGivenPhoneNumber_Valid() {
        UserRegistration validator = new UserRegistration();
        String PhoneNo = validator.validatePhoneNumber("91 9919819801");
        Assert.assertEquals("happy", PhoneNo);
    }

    @Test
    public void whenGivenMobileNo_WithoutCountryCodeShouldReturnInvalid() {
        UserRegistration validator = new UserRegistration();
        String PhoneNo = validator.validatePhoneNumber("+ 9919819801");
        Assert.assertEquals("sad", PhoneNo);
    }

    @Test
    public void whenGivenMobileNo_WithoutSpaceShouldReturnInvalid() {
        UserRegistration validator = new UserRegistration();
        String PhoneNo = validator.validatePhoneNumber("+919919819801");
        Assert.assertEquals("sad", PhoneNo);
    }

    // User Register Password
    @Test
    public void whenGivenPassword_Valid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule1("Riya@123");
        Assert.assertEquals("happy", password);
    }

    @Test
    public void whenGivenPassword_LessThan8CharacterShouldReturnInValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule1("Raj@123");
        Assert.assertEquals("sad", password);
    }

    @Test
    public void whenGivenPassword_WithoutIntegerCaseShouldReturnInvalid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule1("riya@hy");
        Assert.assertEquals("sad", password);
    }

    // User Register the Upper case password
    @Test
    public void whenGivenPassword_UpperCaseShouldReturnValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule2("rIya@123");
        Assert.assertEquals("happy", password);
    }

    @Test
    public void whenGivenPassword_UpperCaseLessThan8CharacterShouldReturnInValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule2("Raj@123");
        Assert.assertEquals("sad", password);
    }

    @Test
    public void whenGivenPassword_WithoutUpperCaseShouldReturnInValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule2("riya123");
        Assert.assertEquals("sad", password);
    }

    @Test
    public void whenGivenPassword_LastNumericNumberShouldReturnValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule3("Riya@123");
        Assert.assertEquals("happy", password);
    }

    @Test
    public void whenGivenPassword_SpecialCharacterShouldReturnValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule4("Riya#123");
        Assert.assertEquals("happy", password);
    }
    @Test
    public void whenGivenPassword_WithoutSpecialCharacterShouldReturnIValid() {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule4("rIya123");
        Assert.assertEquals("sad", password);
    }

}



