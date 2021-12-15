package com.blz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

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
}
