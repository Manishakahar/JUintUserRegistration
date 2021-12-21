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
    public void givenPassword_whenPasswordCorrect_ShouldReturnPassedAllTest() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        String actualResult =userRegistration .validatePasswordWithRule.iValidator(this.password);
        String expectedResult = "valid";
        Assert.assertEquals(expectedResult, actualResult);
    }

    // User register password in case of Empty value
    @Test
    public void givenPassword_whenWithoutSignShouldReturnEmptyValue(){
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validatePasswordWithRule.iValidator("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter the Password", userRegistrationException.message);
        }
    }

    // User register password in case of Null value
    @Test
    public void givenPassword_whenStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validatePasswordWithRule.iValidator(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }
}

