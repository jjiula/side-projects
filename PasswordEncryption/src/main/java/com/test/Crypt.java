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

        if (encryptOrDecrypt.equalsIgnoreCase("e")) {
            // ask user to set a key
            System.out.println("Please enter a number you would like to use as your key:");
            int keyNumber = scanner.nextInt();

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
            System.out.println("Please enter your key: ");
            int keyNumber = scanner.nextInt();
            //ask user for code to decrypt
            System.out.println("Please enter the password you would like to decrypt (no spaces):");
            String encryptedPassword = scanner.next();

            // decrypt password
            char[] chars = encryptedPassword.toCharArray();
            for (char c : chars) {
                c -= keyNumber;
                System.out.print(c);
            }
            // let them know the decrypted password
            System.out.println(" is your decrypted password.");
        } else {
            System.out.println("Invalid response. Please enter a valid response (e/d)");
        }

    }
}
