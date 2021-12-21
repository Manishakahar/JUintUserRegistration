package com.blz.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterisedEmailTest {
    public String emailId;
    public boolean expectedResult;

    public ParameterisedEmailTest(String emailId, boolean expectedResult) {
        this.emailId = emailId;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
   public static Collection ExpectedResult() {
        return Arrays.asList(new Object[][]{
                {"abc.xyz@blz.com.in", true},
                {"abc.xyz@blz.com", true},
                {"abc.xyz@blzin.com", true},
                {"abc@blz.com", true},
                {"abc@xyz@gmail.com", false},
                {"abc@xyz@gmail123.com", false},
                {"abc@gmail.com", true},
                {"abc", false},
                {"abc@blz", false},

        });
    }

    @Test
    public void givenEmailId_whenCorrectEmailId_ShouldReturnPassedAllTest() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        String actualResult = userRegistration.validateEmailID.iValidator(this.emailId);
        String expectedResult = "valid";
        Assert.assertEquals(expectedResult, actualResult);
    }

    // User Register Email-id in case of Empty value
    @Test
    public void givenEmail_whenWithoutSignShouldReturnEmptyValue(){
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validateEmailID.iValidator("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Please enter the Email-id", userRegistrationException.message);
        }
    }

    // User register Email-id in case null value
    @Test
    public void givenEmail_whenStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validateEmailID.iValidator(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }
}

