package com.blz.userregistration;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterisedPasswordTest {
    private String password;
    private boolean expectedResult;

    public ParameterisedPasswordTest(String password, boolean expectedResult) {
        this.password = password;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection expectedResult(){
        return Arrays.asList(new Object[][]{
                {"Riya@123", true},
                {"riya@.comM", true},
                {"Raj%123.com", false},
                {"riya@123455", false},
                {"raj@blz", false},
        });
        }
    @Test
    public void givenPasswords_whenPasswordCorrect_shouldPassAllTestCase() {
        UserRegistration validation = new UserRegistration();
        String actualResult=(validation.validatePasswordWithRule4(this.password));
        String expectedResult="valid";
        Assert.assertEquals(expectedResult,actualResult);
    }
}