package com.test;

import java.util.Scanner;

public class ScopaScoringCLI {

    public static void main(String[] args) {

        // initiate scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Scopa Score Counter!");

        int player1Score = 0;
        int player2Score = 0;

        System.out.println("Please enter the number of cards each player/team has.");
        //enter card counter
        System.out.println("Player/Team 1:");
        int player1CardCounter = scanner.nextInt();

        System.out.println("Player/Team 2:");
        int player2CardCounter = scanner.nextInt();

        // if card count = 20 no one gets a point
        if (player1CardCounter == player2CardCounter) {
            System.out.println("No one gets a point for cards this round.");

            // if card count > 20 that player gets a point
        } else if (player1CardCounter > player2CardCounter) {
            System.out.println("Player/Team 1 gets the card point for this round.");
            player1Score++;

            // if card count < 20 the other player gets a point
        } else if (player2CardCounter > player1CardCounter) {
            System.out.println("Player/Team 2 gets the card point for this round.");
            player2Score++;
        }
        System.out.println("Player/Team 1 Score: " + player1Score);
        System.out.println("Player/Team 2 Score: " + player2Score);


        //enter coin count
        System.out.println("Please enter the number of coins each player/team has.");
        System.out.println("Player/Team 1:");
        int player1CoinCount = scanner.nextInt();
        System.out.println("Player/Team 2:");
        int player2CoinCount = scanner.nextInt();


        // if coin count = 5 no one gets a point
        if (player1CoinCount == player2CoinCount) {
            System.out.println("No one gets a point for coins this round.");

        // if coin count > 5 that player gets a point
        } else if (player1CoinCount > player2CoinCount) {
            System.out.println("Player/Team 1 gets the coin point for this round.");
            player1Score++;

        // if coin count < 5 the other player gets a point
        } else if (player2CoinCount > player1CoinCount) {
            System.out.println("Player/Team 2 gets the coin point for this round.");
            player2Score++;
        }
        System.out.println("Player/Team 1 Score: " + player1Score);
        System.out.println("Player/Team 2 Score: " + player2Score);


        System.out.println("Which player/team received the Sette di Denari (Seven of Coins) card [1 or 2]?");
        //enter sette bello
        int setteBelloInput = scanner.nextInt();

        // if player 1, give player 1 a point
        if (setteBelloInput == 1) {
            player1Score++;

        // if player 2, give player 2 a point
        } else if (setteBelloInput == 2) {
            player2Score++;

        // ensure there is a valid input
        } else {
            System.out.println("Please enter a valid team/player number.");
        }
        System.out.println("Player/Team 1 Score: " + player1Score);
        System.out.println("Player/Team 2 Score: " + player2Score);

        // how many scopas did you receive
        System.out.println("Please enter the number of scopas each player/team earned.");
        // receive one point per scopa
        System.out.println("Player/Team 1:");
        int player1Scopas = scanner.nextInt();
        player1Score += player1Scopas;

        System.out.println("Player/Team 2:");
        int player2Scopas = scanner.nextInt();
        player2Score += player2Scopas;
        System.out.println("Player/Team 1 Score: " + player1Score);
        System.out.println("Player/Team 2 Score: " + player2Score);

        //calculate Primiera points
        System.out.println("The prime for each team is determined by selecting the teams best card in each of the four suits, and totaling those four cards point values.");
        System.out.println("Please enter the number of best cards for each suit below.");
        // fix this code
        int player1PrimieraPoints = 0;

        System.out.println("Seven (sette): ");
        int sevens1 = scanner.nextInt();
        player1PrimieraPoints += (sevens1 * 21);

        System.out.println("Six (sei): ");
        int sixes1 = scanner.nextInt();
        player1PrimieraPoints += (sixes1 * 18);

        System.out.println("Five (cinque): ");
        int fives1 = scanner.nextInt();
        player1PrimieraPoints += (fives1 * 15);

        System.out.println("Four (quattro): ");
        int fours1 = scanner.nextInt();
        player1PrimieraPoints += (fours1 * 14);

        System.out.println("Three (tre): ");
        int threes1 = scanner.nextInt();
        player1PrimieraPoints += (threes1 * 13);

        System.out.println("Two (due): ");
        int twos1 = scanner.nextInt();
        player1PrimieraPoints += (twos1 * 12);

        System.out.println("Ace/One (asso): ");
        int aces1 = scanner.nextInt();
        player1PrimieraPoints += (aces1 * 16);

        System.out.println("Face cards (King/Horse/Jack): ");
        int faceCards1 = scanner.nextInt();
        player1PrimieraPoints += (faceCards1 * 10);

        System.out.println("Player/Team 1 Primiera Points: " + player1PrimieraPoints);


        System.out.println("How many of each card did player/team 2 receive?");
        int player2PrimieraPoints = 0;

        System.out.println("Seven (sette): ");
        int sevens2 = scanner.nextInt();
        player2PrimieraPoints += (sevens2 * 21);

        System.out.println("Six (sei): ");
        int sixes2 = scanner.nextInt();
        player2PrimieraPoints += (sixes2 * 18);

        System.out.println("Five (cinque): ");
        int fives2 = scanner.nextInt();
        player2PrimieraPoints += (fives2 * 15);

        System.out.println("Four (quattro): ");
        int fours2 = scanner.nextInt();
        player2PrimieraPoints += (fours2 * 14);

        System.out.println("Three (tre): ");
        int threes2 = scanner.nextInt();
        player2PrimieraPoints += (threes2 * 13);

        System.out.println("Two (due): ");
        int twos2 = scanner.nextInt();
        player2PrimieraPoints += (twos2 * 12);

        System.out.println("Ace/One (asso): ");
        int aces2 = scanner.nextInt();
        player2PrimieraPoints += (aces2 * 16);

        System.out.println("Face cards (King/Horseman/Jack): ");
        int faceCards2 = scanner.nextInt();
        player2PrimieraPoints += (faceCards2 * 10);

        System.out.println("Player/Team 2 Primiera Points: " + player2PrimieraPoints);

        // if Primiera count is the same, no one gets a point
        if (player1PrimieraPoints == player2PrimieraPoints) {
            System.out.println("No one gets a Primiera point for this round.");

            // if player 1 Primiera score > player 2, player 1 gets a point
        } else if (player1PrimieraPoints > player2PrimieraPoints) {
            System.out.println("Player/Team 1 gets the Primiera point for this round.");
            player1Score++;

            // if player 2 Primiera score > player 1, player 2 gets a point
        } else if (player2PrimieraPoints > player1PrimieraPoints) {
            System.out.println("Player/Team 2 gets the Primiera point for this round.");
            player2Score++;
        }
        System.out.println("Player/Team 1 Score: " + player1Score);
        System.out.println("Player/Team 2 Score: " + player2Score);


        System.out.println("***Total Score***");

        //declare winner if one player/team >= 11
        if (player1Score > player2Score && player1Score >= 11) {
            System.out.println("Player/Team 1 Wins!");
            System.out.println("Player/Team 1 Score: " + player1Score);
            System.out.println("Player/Team 2 Score: " + player2Score);
        } else if (player2Score > player1Score && player2Score >= 11) {
            System.out.println("Player/Team 2 Wins!");
            System.out.println("Player/Team 1 Score: " + player1Score);
            System.out.println("Player/Team 2 Score: " + player2Score);

            // if both players are >= 11, choose the higher number
        } else if (player1Score >= 11 && player2Score >= 11) {
            if (player1Score > player2Score) {
                System.out.println("Player/Team 1 Wins!");
                System.out.println("Player/Team 1 Score: " + player1Score);
                System.out.println("Player/Team 2 Score: " + player2Score);
            } else if (player2Score > player1Score) {
                System.out.println("Player/Team 2 Wins!");
                System.out.println("Player/Team 1 Score: " + player1Score);
                System.out.println("Player/Team 2 Score: " + player2Score);
            }

            // if tied play another round
            // if both scores are less than 11 begin another round
        } else if (player1Score == player2Score || player1Score < 11 && player2Score < 11) {
            System.out.println("Time for another round!");
            System.out.println("Player/Team 1 Score: " + player1Score);
            System.out.println("Player/Team 2 Score: " + player2Score);
            {

            }
        }

    }
}
