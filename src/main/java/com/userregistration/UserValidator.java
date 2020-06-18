package com.userregistration;

import java.util.regex.Pattern;

public class UserValidator {
    public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})?$";

    public boolean checkFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    public boolean checkLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
    public boolean checkEmailId(String emailId) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(emailId).matches();
    }

}
