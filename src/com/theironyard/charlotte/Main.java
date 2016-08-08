package com.theironyard.charlotte;

import java.util.Scanner;

public class Main {

    String name;
    int option;
    int amount;

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the ATM! What is your name?");
        //simple text printed to screen. asks for name.
        Scanner scanner = new Scanner(System.in); // what does system.in do?
        //declares scanner. Defines scanner as new scanner.
        String name = scanner.nextLine();

        if (name != null && !name.equals("")) {
            System.out.println("Thanks!");

        } else throw new Exception("Cannot proceed without name");
        {

            System.out.println("What would you like to do? [1 Check my balance/ 2. Withdraw Funds/3. Cancel] ");
            Integer option = scanner.nextInt();
            // good. the above works.
            if (option.equals(1)) {
                System.out.println("Your balance is $100");
            }//yay! This works too!

            // good. the above works.
            if (option.equals(3)) {
                System.out.println("Thank you and please come again.");
            }
//awesomesauce!!!
            if (option.equals(2)) {
                System.out.println("How much would you like to withdraw?");
            }
        }
            Integer amount = scanner.nextInt();
            if (amount > 100) throw new Exception ("Insufficient funds");
            if (amount <= 100) {
                System.out.println("Please take your money");
// this works. One thought. Even if after I type option, 3, if i print something else,
                //the screen will print, please take your money. ...
                //and if i reformat the classes, it will malfuntion. (try it to see)
            }
            System.out.println("You have $" + (100 - amount) + " remaining in your account.");
        }


        }


        // this is a test for git






