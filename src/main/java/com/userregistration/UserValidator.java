package com.userregistration;

import java.util.regex.Pattern;

public class UserValidator {
    public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
    public boolean checkFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
}
