package com.blz.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterisedPasswordTest {
    public String password;
    public boolean expectedResult;

    public ParameterisedPasswordTest(String password, boolean expectedResult) {
        this.password = password;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection expectedResult() {
        return Arrays.asList(new Object[][]{
                {"Riya@1234", true},
                {"riya@.com1M", true},
                {"Abc%123d", true},
                {"raj@123455", false},
                {"abc@blz", false},

        });
    }

    @Test
    public void givenEmailId_WithEmailId_ShouldPassedAllTest() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String actualResult = validator.validatePasswordWithRule(this.password);
        String expectedResult = "valid";
        Assert.assertEquals(expectedResult, actualResult);
    }

    // User register password in case of Empty value
    @Test
    public void whenGivenPassword_WithoutSignShouldReturnEmptyValue(){
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePasswordWithRule("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter the Password", userRegistrationException.message);
        }
    }

    // User register password in case of Null value
    @Test
    public void whenGivenPassword_StartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePasswordWithRule(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

}

