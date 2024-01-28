package com.test;

import java.util.Scanner;

public class Crypt {

    public static void main(String[] args) {


        //introduce scanner
        Scanner scanner = new Scanner(System.in);

        // welcome the user
        System.out.println("*******************************************************");
        System.out.println("  ad8888888888ba\n" +
                " dP'         `\"8b,\n" +
                " 8  ,aaa,       \"Y888a     ,aaaa,     ,aaa,  ,aa,\n" +
                " 8  8' `8           \"88baadP\"\"\"\"YbaaadP\"\"\"YbdP\"\"Yb\n" +
                " 8  8   8              \"\"\"        \"\"\"      \"\"    8b\n" +
                " 8  8, ,8         ,aaaaaaaaaaaaaaaaaaaaaaaaddddd88P\n" +
                " 8  `\"\"\"'       ,d8\"\"\n" +
                " Yb,         ,ad8\"            \n" +
                "  \"Y8888888888P\"");
        System.out.println("*******************************************************");

        // ask if they want to encrypt a password or decrypt
        System.out.println("Please enter [e] to encrypt or [d] to decrypt: ");
        String encryptOrDecrypt = scanner.next();

        while (!(encryptOrDecrypt.equalsIgnoreCase("e") || encryptOrDecrypt.equalsIgnoreCase("d"))) {
            System.out.println("Invalid response. Please enter [e] to encrypt or [d] to decrypt: ");
            encryptOrDecrypt = scanner.next();
        }

        if (encryptOrDecrypt.equalsIgnoreCase("e")) {
            // ask user to set a key
            int keyNumber = 1;
            do {
                System.out.println("Please enter a number you would like to use as your key:");
                keyNumber = scanner.nextInt();

                if (keyNumber < 1 || keyNumber > 50) {
                    System.out.println("Please enter a number between 1 and 50.");
                }
            } while (keyNumber < 1 || keyNumber > 50);


            // ask for password to encrypt
            System.out.println("Please enter the password you would like to encrypt (no spaces):");
            String password = scanner.next();

            // encrypt password
            char[] chars = password.toCharArray();
            for (char c : chars) {
                c += keyNumber;
                System.out.print(c);
            }
            // let them know the encrypted password
            System.out.println(" is your encrypted password.");

        } else if (encryptOrDecrypt.equalsIgnoreCase("d")) {
            // ask for their key
            int keyNumber = 1;
            do {
                System.out.println("Please enter your key: ");
                keyNumber = scanner.nextInt();

                if (keyNumber < 1 || keyNumber > 50) {
                    System.out.println("Please enter a number between 1 and 50.");
                }
            } while (keyNumber < 1 || keyNumber > 50);
            //ask user for code to decrypt
            System.out.println("Please enter the password you would like to decrypt:");
            String encryptedPassword = scanner.next();

            // decrypt password
            char[] chars = encryptedPassword.toCharArray();
            for (char c : chars) {
                c -= keyNumber;
                System.out.print(c);
            }
            // let them know the decrypted password
            System.out.println(" is your decrypted password.");
        }
    }
}