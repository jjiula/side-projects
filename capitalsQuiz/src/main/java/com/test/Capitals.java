package com.test;

import java.sql.Array;
import java.util.*;

public class Capitals {

    public static void main(String[] args) {

        // initiates scanner
        Scanner scanner = new Scanner(System.in);

        // stores states & capitals
        String capitals[][] = {
                {"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"},
                {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"},
                {"Maryland", "Annapolis"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"},
                {"Montana", "Helena"},
                {"Nebraska", "Lincoln"},
                {"Nevada", "Carson City"},
                {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"},
                {"New Mexico", "Santa Fe"},
                {"New York", "Albany"},
                {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismark"},
                {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"},
                {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}
        };

        // established a place to hold the score and user inputted response
        int correctStates = 0;
        String userResponse = "";

        List<Integer> availableStateNumbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            availableStateNumbers.add(i);
        }

        // prompts question to user
        for (int j = 0; j < 50; j++) {
            int randomNumber = new Random().nextInt(availableStateNumbers.size());
            int stateNumber = availableStateNumbers.get(randomNumber);


            System.out.println("What is the capital of " + capitals[stateNumber][0] + "?");
            userResponse = scanner.nextLine();


            // checks user answer
            if (userResponse.equalsIgnoreCase(capitals[stateNumber][1])) {
                correctStates++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect :(");
                System.out.println("The capital of " + capitals[stateNumber][0] + " is " + capitals[stateNumber][1] + ".");
            }

            availableStateNumbers.remove(randomNumber);

            // returns user's current score
            System.out.println("Score: " + correctStates + "/" + (j+1));
            System.out.println("********************");
        }
        // returns message to user based on their final score
        if (correctStates == 50) {
            System.out.println("Perfect score! You are an expert!");
        } else if (correctStates >= 40 && correctStates < 50) {
            System.out.println("Great job! Only a few more to learn.");
        } else if (correctStates >= 30 && correctStates < 40) {
            System.out.println("Almost there. You have some more studying to do.");
        } else if (correctStates >= 20 && correctStates < 30) {
            System.out.println("Ouch! Review some more and try again later.");
        } else if (correctStates >= 10 && correctStates < 20) {
            System.out.println("Oh no! Try learning the states surrounding your home state and work your way out.");
        } else if (correctStates < 10) {
            System.out.println("You are not smarter than a 5th grader...");
        }
        System.out.println("Thanks for playing!");
    }
}
