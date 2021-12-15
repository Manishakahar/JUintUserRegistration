package com.blz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
       // User Registration Fast Name
    @Test
    public void whenGivenFirstName_ShouldHaveMinimum3CharWithCamelCase(){
        UserRegistration validator=new UserRegistration();
        String firstName = validator.validateFirstName("Manisha");
        Assert.assertEquals("valid" , firstName);
    }

    @Test
    public void whenGivenFirstName_WithSmallLetter() {
        UserRegistration validator=new UserRegistration();
        String firstName = validator.validateFirstName("manisha");
        Assert.assertEquals("Invalid" , firstName);
    }

    @Test
    public void whenGivenFirstName_WithOtherLetterCapital() {
        UserRegistration validator=new UserRegistration();
        String firstName = validator.validateFirstName("mANisha");
        Assert.assertEquals("Invalid" , firstName);
    }

    // User Registration Last Name
    @Test
    public void whenGivenLastName_ShouldHaveMinimum3CharWithCamelCase() {
        UserRegistration validator=new UserRegistration();
        String lastName = validator.validateFirstName("Kahar");
        Assert.assertEquals("valid" , lastName);
    }

    @Test
    public void whenGivenLastName_WithSmallLetter() {
        UserRegistration validator=new UserRegistration();
        String lastName = validator.validateLastName("kahar");
        Assert.assertEquals("Invalid" , lastName);
    }

    @Test
    public void whenGivenLastName_WithOtherLetterCapital() {
        UserRegistration validator=new UserRegistration();
        String lastName = validator.validateFirstName("KAhar");
        Assert.assertEquals("Invalid" , lastName);
    }
}
