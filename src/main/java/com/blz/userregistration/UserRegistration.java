package com.blz.userregistration;

public class UserRegistration {

    String VALIDATE_NAME= "^[A-Z]{1}[a-z]{2,}$";
    String VALIDATE_EMAIL= "^[a-z0-9]{3,20}([_+.-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$";

        public String validateFirstName (String firstName) {
            if (firstName.matches(VALIDATE_NAME)) {
                return "valid";
            }
            else {
                return "Invalid";
            }
        }

    public String validateLastName (String lastName) {
        if (lastName.matches(VALIDATE_NAME)) {
            return "valid";
        } else {
            return "Invalid";
        }
    }

      public String validateEmailID (String Email){
            if (Email.matches(VALIDATE_EMAIL)) {
                return "valid";
            } else {
                return "Invalid";
            }
        }

    public static void main(String[] args) {

            System.out.println("Welcome to User Registration");
    }
}

