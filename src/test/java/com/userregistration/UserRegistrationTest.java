package com.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
    private final String email;
    private final Boolean expectedResult;
    private UserValidator validator;

    @Before
    public void initialize() {
        validator = new UserValidator();
    }

    public UserRegistrationTest(String email, Boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }

    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        Assert.assertTrue(validator.checkFirstName("Sandip"));
    }

    @Test
    public void givenFirstName_whenShort_shouldReturnFalse() {;
        Assert.assertFalse(validator.checkFirstName("Sa"));
    }

    @Test
    public void givenFirstName_whenNoUpperCase_shouldReturnFalse() {
        Assert.assertFalse(validator.checkFirstName("sandip"));
    }

    @Test
    public void givenFirstName_whenContainsNumeric_shouldReturnFalse() {
        Assert.assertFalse(validator.checkFirstName("Sandip5"));
    }

    @Test
    public void givenFirstName_whenContainsSpecialChar_shouldReturnFalse() {
        Assert.assertFalse(validator.checkFirstName("Sandip#"));
    }
    @Test
    public void givenLastName_whenProper_shouldReturnTrue() {
        Assert.assertTrue(validator.checkLastName("Singh"));
    }

    @Test
    public void givenLastName_whenShort_shouldReturnFalse() {
        Assert.assertFalse(validator.checkLastName("Si"));
    }

    @Test
    public void givenLastName_whenNoUpperCase_shouldReturnFalse() {
        Assert.assertFalse(validator.checkLastName("singh"));
    }

    @Test
    public void givenLastName_whenContainsNumeric_shouldReturnFalse() {
        Assert.assertFalse(validator.checkLastName("Singh5"));
    }

    @Test
    public void givenLastName_whenContainsSpecialChar_shouldReturnFalse() {
        Assert.assertFalse(validator.checkLastName("Singh#"));
    }

    @Parameterized.Parameters
    public static Collection email_with_expectedResult() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc+100@gmail.com", true},
                {"abc@gmail.com.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc123@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false},
        });
    }

    @Test
    public void givenEmailId_shouldReturnExpectedResult() {
        System.out.println("email id is : " + email);
        Assert.assertEquals(expectedResult, validator.checkEmailId(email));
    }
    @Test
    public void givenMobileNumber_whenProper_shouldReturnTrue() {
        Assert.assertTrue(validator.checkMobileNumber("91 1234567890"));
    }

    @Test
    public void givenMobileNumber_whenNoSpace_shouldReturnFalse() {
        Assert.assertFalse(validator.checkMobileNumber("911234567890"));
    }

    @Test
    public void givenMobileNumber_whenContainCharacter_shouldReturnFalse() {
        Assert.assertFalse(validator.checkMobileNumber("91 12a457890"));
    }

    @Test
    public void givenMobileNumber_whenContainSpecialCharacter_shouldReturnFalse() {
        Assert.assertFalse(validator.checkMobileNumber("91 1&34567890"));
    }
    @Test
    public void givenPassword_whenLong_shouldReturnTrue() {
        Assert.assertTrue(validator.checkPassword("Aa!a9dhBj7cb"));
    }

    @Test
    public void givenPassword_whenShort_shouldReturnFalse() {
        Assert.assertFalse(validator.checkPassword("jn2J@4"));
    }

    @Test
    public void givenPassword_whenAtleastOneUppercase_shouldReturnTrue() {
        Assert.assertTrue(validator.checkPassword("saa^RjmHn6rf"));
    }

    @Test
    public void givenPassword_whenNoUppercase_shouldReturnFalse() {
        Assert.assertFalse(validator.checkPassword("jn#hufgik4"));
    }

    @Test
    public void givenPassword_whenAtleastOneNumericValue_shouldReturnTrue() {
        Assert.assertTrue(validator.checkPassword("khws3sV!G7Fc"));
    }

    @Test
    public void givenPassword_whenNoNumericValue_shouldReturnFalse() {
        Assert.assertFalse(validator.checkPassword("khws%sVUJGFc"));
    }

    @Test
    public void givenPassword_whenAtleastOneSpecialCharacter_shouldReturnTrue() {
        Assert.assertTrue(validator.checkPassword("Lg5@jgc68UG6"));
    }

    @Test
    public void givenPassword_whenNoSpecialCharacter_shouldReturnFalse() {
        Assert.assertFalse(validator.checkPassword("Lg5jgc68UG6"));
    }
}
