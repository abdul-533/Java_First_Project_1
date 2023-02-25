package Project1;

import java.util.Scanner;

public class _01_Project {
    public static void main(String[] args) {

        /** Define Scanner class... */
        Scanner input = new Scanner(System.in);

        String userInput = "";
        while (!userInput.equalsIgnoreCase("y")) {
            /** Ask the user to enter their name and convert the first letter of the entered name to uppercase... */
            System.out.println("Welcome, please enter your name: ");
            String name = input.nextLine();
            String firstLetter = "" + name.charAt(0);    //String firstLetter = String.valueOf(name.charAt(0));
            String nameS = name.substring(1);
            name = (firstLetter.toUpperCase() + nameS.toLowerCase());

            /** Printing the user's name on the screen, " Welcome to Ahmet, can you enter your last name?" Let's ask...*/
            System.out.println(name + "Welcome, can you please enter your last name? ");
            String surname = input.nextLine();
            String firstSurnameLetter = "" + surname.charAt(0);
            String surnameS = surname.substring(1);
            surname = firstSurnameLetter.toUpperCase() + surnameS.toLowerCase();


            /** Let's print the user's name and surname with the first letter capitalized and the others small... */
            System.out.println(name + " " + surname);

            System.out.println(name + " " + surname + " If your name is correct, press the 'Y' key to continue: ");
            userInput = input.nextLine();

            /** If the name and surname displayed on the screen is correct, let's create a loop by pressing the "Y" key to continue...
             Let's continue the loop until the user presses the "Y" key again... */

            while (!userInput.equalsIgnoreCase("y")) {

                if (!userInput.equalsIgnoreCase("y")) {
                    System.out.println("You didn't make the right choice...Please try again later: ");
                }
                System.out.println(name + " " + surname + " If your name is correct, press the 'Y' key to continue: ");
                userInput = input.nextLine();


            }
        }

        /** When the user presses the "Y" key, let's give a warning "Your Name and Surname have been successfully registered in the system..." */
        System.out.println("Your Name and Surname have been successfully registered in the system.");


        /** Let's continue with the username setting ->" Please set your username...:" */
        System.out.println("Please set your username: ");
        String username = input.nextLine();

        /** Let's continue with password setting...->" Please set your password...:" */
        System.out.println("Please set your password:");
        String password = input.nextLine();

        /** Password must be re-entered -> " Re-enter your password...:" */
        System.out.println("For your security, re-enter the password: ");
        String password2 = input.nextLine();

        /** The two passwords entered must be the same.
         If the passwords are the same, let's give a warning "Congratulations... "+ username + " you have registered to the system..." */
        if (!(password.equalsIgnoreCase(password2))) {
            System.out.println("You entered an incorrect or incorrect password, please try again later: ");
        } else {
            System.out.println("Congratulations..." + username + " You have registered to the system with your username.");
        }
    }
}

