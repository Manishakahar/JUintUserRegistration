package com.blz.userregistration;

public class UserRegistration {

    String VALIDATE_NAME="^[A-Z]{1}[a-z]{2,}";
        public String validateFirstName (String firstName) {
            if (firstName.matches(VALIDATE_NAME)) {
                return "valid";
            }
            else {
                return "Invalid";
            }
        }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
    }
}
