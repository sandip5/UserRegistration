package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.checkFirstName("Sandip");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenShort_shouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.checkFirstName("Sa");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenNoUpperCase_shouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.checkFirstName("sandip");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenContainsNumeric_shouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.checkFirstName("Sandip5");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenContainsSpecialChar_shouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.checkFirstName("Sandip#");
        Assert.assertFalse(result);
    }
}
