package com.userregistration;

import java.util.regex.Pattern;

public class UserValidator {
    public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
    public static final String EMAIL_PATTERN = "^[a-z]{1,}([.]?[-]?[+]?[a-z0-9]{1,})?[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,4}([.]?[a-z]{2,4})?$";
    public static final String MOBILE_NUMBER_PATTERN = "^[0-9]{1,3}[ ][0-9]{10}$";
    public static final String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[^0-9a-zA-Z])(?=.*[0-9]).{8,}";

    /**
     *Method For Validating First Name
     * @param firstName
     * @return
     */
    public boolean checkFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }

    /**
     *Method For Validating Last Name
     * @param lastName
     * @return
     */
    public boolean checkLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    /**
     *Method For Validating Email Id
     * @param emailId
     * @return
     */
    public boolean checkEmailId(String emailId) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(emailId).matches();
    }

    /**
     *Method For Validating Mobile Number
     * @param mobileNumber
     * @return
     */
    public boolean checkMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(mobileNumber).matches();
    }

    /**
     *Method For Validating Password
     * @param password
     * @return
     */
    public boolean checkPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }

}
