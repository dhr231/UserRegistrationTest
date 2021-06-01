package com.bridgelabz.assignment;
import java.util.regex.*;
import java.util.Scanner;
public class userRegistration {
    public boolean validateFirstName(String firstName) throws exceptions {
//        Pattern regex=Pattern.compile("^[A-Z][a-z]{3,}");
//        return regex.matcher(firstName).matches();
        try {
            if (firstName == null) {
                throw new exceptions(exceptions.exception.NULL_INPUT, "NULL values not allowed");
            }
            if (firstName.length() == 0) {
                throw new exceptions(exceptions.exception.EMPTY_INPUT, "Do not leave First Name empty");
            }
            if (firstName.length() < 3) {
                throw new exceptions(exceptions.exception.EMPTY_INPUT, "First Name length should be more than 3");
            }
            Pattern regex = Pattern.compile("^[A-Z][a-z]{3,}");
            if (regex.matcher(firstName).matches()) {
                return true;
            } else {
                throw new exceptions(exceptions.exception.INVALID_INPUT, "Please provide valid input");
            }

        } catch (exceptions e) {
            e.printStackTrace();
            return false;
        }


    }

    public boolean validateLastName(String lastName) {
        try {
            if (lastName == null) {
                throw new exceptions(exceptions.exception.NULL_INPUT, "NULL values not allowed");
            }
            if (lastName.length() == 0) {
                throw new exceptions(exceptions.exception.EMPTY_INPUT, "Do not leave Last Name empty");
            }
            if (lastName.length() < 3) {
                throw new exceptions(exceptions.exception.SHORT_INPUT, "Last Name length should be more than 3");
            }
            Pattern regex = Pattern.compile("^[A-Z][a-z]{3,}");
            if (regex.matcher(lastName).matches()) {
                return true;
            } else {
                throw new exceptions(exceptions.exception.INVALID_INPUT, "Please provide valid input");
            }

        } catch (exceptions e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean validateEmail(String email) throws exceptions{
        String regex = " ^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$ ";
//        boolean b=
//        return b;
        try {
            if (Pattern.compile(regex).matcher(email).matches()) {
                return true;
            } else {
                throw new exceptions(exceptions.exception.INVALID_INPUT, "Please input valid email id");
            }
        } catch (exceptions e) {
            e.printStackTrace();
            return false;

        }
    }

   public boolean validatePhone(String phoneNo) throws exceptions {
        String regex = "\\d{2} \\d{10}";
//        boolean b=Pattern.compile(regex).matcher(phoneNo).matches();
//        return b;
        try {
            if (Pattern.compile(regex).matcher(phoneNo).matches()) {
                return true;
            } else {
                throw new exceptions(exceptions.exception.INVALID_INPUT, "Please input valid phone number");
            }
        } catch (exceptions e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean validatePassword(String password) throws exceptions {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        try {
            if (password.length() < 8) {
                throw new exceptions(exceptions.exception.SHORT_INPUT, "Password should be more than 8 characters");
                if (Pattern.compile(regex).matcher(password).matches()) {
                    return true;
                } else {
                    throw new exceptions(exceptions.exception.INVALID_INPUT, "Please input valid password");
                }
            }
        }
        catch (exceptions e) {
            e.printStackTrace();
            return false;
        }
    }
}
