package com.test;

import java.util.Scanner;

public class ScopaScoringCLI {

    public static void main(String[] args) {

        // initiate scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Scopa Score Counter!");

        int player1Score = 0;
        int player2Score = 0;

        do {
            System.out.println("**********Let's play!**********");
            System.out.println("Please enter the number of cards each player/team has.");
            //enter card counter
            int player1CardCounter = 0;
            do {
                System.out.println("Player/Team 1: ");
                player1CardCounter = scanner.nextInt();
                if (player1CardCounter > 40 || player1CardCounter < 0) {
                    System.out.println("Invalid number of cards. Must be between 0 and 40.");
                }
            } while (player1CardCounter > 40 || player1CardCounter < 0);
            int player2CardCounter = 40 - player1CardCounter;

            System.out.println("Player/Team 1: " + player1CardCounter + " cards");
            System.out.println("Player/Team 2: " + player2CardCounter + " cards");

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
            System.out.println("***Score***");
            System.out.println("Player/Team 1 Score: " + player1Score);
            System.out.println("Player/Team 2 Score: " + player2Score);
            System.out.println("***************************");


            //enter coin count
            System.out.println("Please enter the number of coins each player/team has.");
            int player1CoinCount = 0;
            do {
                System.out.println("Player/Team 1:");
                player1CoinCount = scanner.nextInt();
                if (player1CoinCount > 10 || player1CoinCount < 0) {
                    System.out.println("Invalid number of coins. Must be between 0-10.");
                }
            } while (player1CoinCount > 10 || player1CoinCount < 0);
            int player2CoinCount = 10 - player1CoinCount;

            System.out.println("Player/Team 1: " + player1CoinCount + " coins");
            System.out.println("Player/Team 2: " + player2CoinCount + " coins");

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
            System.out.println("***Score***");
            System.out.println("Player/Team 1 Score: " + player1Score);
            System.out.println("Player/Team 2 Score: " + player2Score);
            System.out.println("***************************");

            //enter sette di denari
            int setteDiDenariInput = 0;
            do {
                System.out.println("Which player/team received the Sette di Denari (Seven of Coins) card [1 or 2]?");
                setteDiDenariInput = scanner.nextInt();
                // ensure there is a valid input
                if (setteDiDenariInput != 1 && setteDiDenariInput != 2) {
                    System.out.println("Please enter a valid team/player number.");
                }
            } while (setteDiDenariInput != 1 && setteDiDenariInput != 2);

            // if player 1, give player 1 a point
            if (setteDiDenariInput == 1) {
                System.out.println("Player/Team 1 gets the Sette di Denari point for this round.");
                player1Score++;

                // if player 2, give player 2 a point
            } else if (setteDiDenariInput == 2) {
                System.out.println("Player/Team 2 gets the Sette di Denari point for this round.");
                player2Score++;
            }

            System.out.println("***Score***");
            System.out.println("Player/Team 1 Score: " + player1Score);
            System.out.println("Player/Team 2 Score: " + player2Score);
            System.out.println("***************************");

            // how many scopas did you receive
            System.out.println("Please enter the number of scopas each player/team earned.");
            // receive one point per scopa
            System.out.println("Player/Team 1:");
            int player1Scopas = scanner.nextInt();
            player1Score += player1Scopas;

            System.out.println("Player/Team 2:");
            int player2Scopas = scanner.nextInt();
            player2Score += player2Scopas;

            System.out.println("***Score***");
            System.out.println("Player/Team 1 Score: " + player1Score);
            System.out.println("Player/Team 2 Score: " + player2Score);
            System.out.println("***************************");

            //calculate Primiera points
            System.out.println("The prime for each team is determined by selecting the teams best card in each of the four suits, and totaling those four cards point values.");
            System.out.println("Please enter the number of best cards for each suit for Player 1 below.");
            final int SEVENS_SCORE = 21;
            final int SIXES_SCORE = 18;
            final int ACES_SCORE = 16;
            final int FIVES_SCORE = 15;
            final int FOURS_SCORE = 14;
            final int THREES_SCORE = 13;
            final int TWOS_SCORE = 12;
            final int FACE_CARDS_SCORE = 10;

            int player1PrimieraPoints = 0;
            int player1PrimieraCards = 0;
            int player2PrimieraPoints = 0;
            int player2PrimieraCards = 0;

            System.out.println("Seven (sette): ");
            int sevens1 = scanner.nextInt();
            int sevens2 = 4 - sevens1;
            player1PrimieraPoints += (sevens1 * SEVENS_SCORE);
            player1PrimieraCards += sevens1;
            player2PrimieraPoints += (sevens2 * SEVENS_SCORE);
            player2PrimieraCards += sevens2;

            player1PrimieraCards = Math.min(player1PrimieraCards,4);
            player2PrimieraCards = Math.min(player2PrimieraCards,4);

            if (player1PrimieraCards < 4) {
                System.out.println("Six (sei): ");
                int sixes1 = scanner.nextInt();
                int sixes2 = 4 - sixes1;
                int player1RemainingSlots = 4 - player1PrimieraCards;
                int player2RemainingSlots = 4 - player2PrimieraCards;
                int player1SixesToAdd = Math.min(sixes1, player1RemainingSlots);
                int player2SixesToAdd = Math.min(sixes2, player2RemainingSlots);
                player1PrimieraPoints += (player1SixesToAdd * SIXES_SCORE);
                player1PrimieraCards += player1SixesToAdd;
                player2PrimieraPoints += (player2SixesToAdd * SIXES_SCORE);
                player2PrimieraCards += player2SixesToAdd;
            }

            if (player1PrimieraCards < 4 && player2PrimieraCards < 4) {
                System.out.println("Ace/One (asso): ");
                int aces1 = scanner.nextInt();
                int aces2 = 4 - aces1;
                int player1RemainingSlots = 4 - player1PrimieraCards;
                int player2RemainingSlots = 4 - player2PrimieraCards;
                int player1AcesToAdd = Math.min(aces1, player1RemainingSlots);
                int player2AcesToAdd = Math.min(aces2, player2RemainingSlots);
                player1PrimieraPoints += (player1AcesToAdd * ACES_SCORE);
                player1PrimieraCards += player1AcesToAdd;
                player2PrimieraPoints += (player2AcesToAdd * ACES_SCORE);
                player2PrimieraCards += player2AcesToAdd;
            }


            if (player1PrimieraCards < 4 && player2PrimieraCards < 4) {
                System.out.println("Five (cinque): ");
                int fives1 = scanner.nextInt();
                int fives2 = 4 - fives1;
                int player1RemainingSlots = 4 - player1PrimieraCards;
                int player2RemainingSlots = 4 - player2PrimieraCards;
                int player1FivesToAdd = Math.min(fives1, player1RemainingSlots);
                int player2FivesToAdd = Math.min(fives2, player2RemainingSlots);
                player1PrimieraPoints += (player1FivesToAdd * FIVES_SCORE);
                player1PrimieraCards += player1FivesToAdd;
                player2PrimieraPoints += (player2FivesToAdd * FIVES_SCORE);
                player2PrimieraCards += player2FivesToAdd;
            }

            if (player1PrimieraCards < 4 && player2PrimieraCards < 4) {
                System.out.println("Four (quattro): ");
                int fours1 = scanner.nextInt();
                int fours2 = 4 - fours1;
                int player1RemainingSlots = 4 - player1PrimieraCards;
                int player2RemainingSlots = 4 - player2PrimieraCards;
                int player1FoursToAdd = Math.min(fours1, player1RemainingSlots);
                int player2FoursToAdd = Math.min(fours2, player2RemainingSlots);
                player1PrimieraPoints += (player1FoursToAdd * FOURS_SCORE);
                player1PrimieraCards += player1FoursToAdd;
                player2PrimieraPoints += (player2FoursToAdd * FOURS_SCORE);
                player2PrimieraCards += player2FoursToAdd;
            }

            if (player1PrimieraCards < 4 && player2PrimieraCards < 4) {
                System.out.println("Three (tre): ");
                int threes1 = scanner.nextInt();
                int threes2 = 4 - threes1;
                int player1RemainingSlots = 4 - player1PrimieraCards;
                int player2RemainingSlots = 4 - player2PrimieraCards;
                int player1ThreesToAdd = Math.min(threes1, player1RemainingSlots);
                int player2ThreesToAdd = Math.min(threes2, player2RemainingSlots);
                player1PrimieraPoints += (player1ThreesToAdd * THREES_SCORE);
                player1PrimieraCards += player1ThreesToAdd;
                player2PrimieraPoints += (player2ThreesToAdd * THREES_SCORE);
                player2PrimieraCards += player2ThreesToAdd;
            }

                if (player1PrimieraCards < 4 && player2PrimieraCards < 4) {
                    System.out.println("Two (due): ");
                    int twos1 = scanner.nextInt();
                    int twos2 = 4 - twos1;
                    int player1RemainingSlots = 4 - player1PrimieraCards;
                    int player2RemainingSlots = 4 - player2PrimieraCards;
                    int player1TwosToAdd = Math.min(twos1, player1RemainingSlots);
                    int player2TwosToAdd = Math.min(twos2, player2RemainingSlots);
                    player1PrimieraPoints += (player1TwosToAdd * TWOS_SCORE);
                    player1PrimieraCards += player1TwosToAdd;
                    player2PrimieraPoints += (player2TwosToAdd * TWOS_SCORE);
                    player2PrimieraCards += player2TwosToAdd;
                }

            if (player1PrimieraCards < 4 && player2PrimieraCards < 4) {
                System.out.println("Face cards (King/Horse/Jack): ");
                int faceCards1 = scanner.nextInt();
                int faceCards2 = 4 - faceCards1;
                int player1RemainingSlots = 4 - player1PrimieraCards;
                int player2RemainingSlots = 4 - player2PrimieraCards;
                int player1FaceCardsToAdd = Math.min(faceCards1, player1RemainingSlots);
                int player2FaceCardsToAdd = Math.min(faceCards2, player2RemainingSlots);
                player1PrimieraPoints += (player1FaceCardsToAdd * FACE_CARDS_SCORE);
                player1PrimieraCards += player1FaceCardsToAdd;
                player2PrimieraPoints += (player2FaceCardsToAdd * FACE_CARDS_SCORE);
                player2PrimieraCards += player2FaceCardsToAdd;
            }

            System.out.println("Player/Team 1 Primiera Points: " + player1PrimieraPoints);
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
                    System.out.println("Thanks for playing!");
                } else if (player2Score > player1Score) {
                    System.out.println("Player/Team 2 Wins!");
                    System.out.println("Player/Team 1 Score: " + player1Score);
                    System.out.println("Player/Team 2 Score: " + player2Score);
                    System.out.println("Thanks for playing!");
                }

                // if tied play another round
                // if both scores are less than 11 begin another round
            } else if (player1Score == player2Score || player1Score < 11 && player2Score < 11) {
                System.out.println("Time for another round!");
                System.out.println("Player/Team 1 Score: " + player1Score);
                System.out.println("Player/Team 2 Score: " + player2Score);
            }
        } while (player1Score < 11 && player2Score < 11);
    }
}
