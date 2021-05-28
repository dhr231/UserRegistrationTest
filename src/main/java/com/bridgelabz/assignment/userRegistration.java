package com.bridgelabz.assignment;
import java.util.regex.*;
import java.util.Scanner;
public class userRegistration {
    boolean validateFirstName(String firstName){
        Pattern regex=Pattern.compile("^[A-Z][a-z]{3,}");
        return regex.matcher(firstName).matches();

    }

    boolean validateLastName(String lastName){
        Pattern regex=Pattern.compile("^[A-Z][a-z]{3,}");
        return regex.matcher(lastName).matches();
    }

    boolean validateEmail(String email){
        String regex=" ^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$ " ;
        boolean b=Pattern.compile(regex).matcher(email).matches();
        return b;
    }

    boolean validatePhone(String phoneNo){
        String regex= "\\d{2} \\d{10}";
        boolean b=Pattern.compile(regex).matcher(phoneNo).matches();
        return b;
    }

    boolean validatePassword(String password){
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        boolean b=Pattern.compile(regex).matcher(password).matches();
        return b;
    }

    public static void main(String[] args) {
        System.out.println("User Registration");
        System.out.println("Enter Details");
        Scanner scanner = new Scanner(System.in);

        userRegistration registrationForm = new userRegistration();
        String firstName;
        String lastName;
        String mobileNo;
        String emailId;
        String password;
        do {
            System.out.println("Enter First Name");
            firstName = scanner.nextLine();
            System.out.println(registrationForm.validateFirstName(firstName));
        } while (!registrationForm.validateFirstName(firstName));

        do {
            System.out.println("Enter Last Name");
            lastName = scanner.nextLine();
            System.out.println(registrationForm.validateLastName(lastName));
        } while (!registrationForm.validateLastName(lastName));

        do {
            System.out.println("Enter Mobile No :");
            mobileNo = scanner.nextLine();
            System.out.println(registrationForm.validatePhone(mobileNo));
        } while (!registrationForm.validatePhone(mobileNo));

        do {
            System.out.println("Enter email Id");
            emailId = scanner.nextLine();
            System.out.println(registrationForm.validateEmail(emailId));
        } while (!registrationForm.validateEmail(emailId));

        do {
            System.out.println("Enter Password");
            password = scanner.nextLine();
            System.out.println(registrationForm.validatePassword(password));
        } while (!registrationForm.validatePassword(password));
        System.out.println("User has been registered");

    }
}