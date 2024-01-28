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
            if (setteDiDenariInput != 1 && setteDiDenariInput !=2) {
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
        int player1PrimieraPoints = 0;
        int player1PrimieraCards = 0;
        int player2PrimieraPoints = 0;
        int player2PrimieraCards = 0;

        System.out.println("Seven (sette): ");
        int sevens1 = scanner.nextInt();
        int sevens2 = 4 - sevens1;
        player1PrimieraPoints += (sevens1 * 21);
        player1PrimieraCards += sevens1;
        player2PrimieraPoints += (sevens2 * 21);
        player2PrimieraCards += sevens2;

        System.out.println("Six (sei): ");
        int sixes1 = scanner.nextInt();
        int sixes2 = 4 - sixes1;
        if (player1PrimieraCards < 4) {
            player1PrimieraPoints += (sixes1 * 18);
            player1PrimieraCards += sixes1;
        }
        if (player2PrimieraCards < 4) {
            player2PrimieraPoints += (sixes2 * 18);
            player2PrimieraCards += sixes2;
        }

        System.out.println("Ace/One (asso): ");
        int aces1 = scanner.nextInt();
        int aces2 = 4 - aces1;
        if (player1PrimieraCards < 4) {
            player1PrimieraPoints += (aces1 * 16);
            player1PrimieraCards += aces1;
        }
        if (player2PrimieraCards < 4) {
            player2PrimieraPoints += (aces2 * 16);
            player2PrimieraCards += aces2;
        }


        if (player1PrimieraCards < 4 && player2PrimieraCards < 4) {
            System.out.println("Five (cinque): ");
            int fives1 = scanner.nextInt();
            int fives2 = 4 - fives1;
            if (player1PrimieraCards < 4) {
                player1PrimieraPoints += (fives1 * 15);
                player1PrimieraCards += fives1;
            }
            if (player2PrimieraCards < 4) {
                player2PrimieraPoints += (fives2 * 15);
                player2PrimieraCards += fives2;
            }

            System.out.println("Four (quattro): ");
            int fours1 = scanner.nextInt();
            int fours2 = 4 - fours1;
            if (player1PrimieraCards < 4) {
                player1PrimieraPoints += (fours1 * 14);
                player1PrimieraCards += fours1;
            }
            if (player2PrimieraCards < 4) {
                player2PrimieraPoints += (fours2 * 14);
                player2PrimieraCards += fours2;
            }

            System.out.println("Three (tre): ");
            int threes1 = scanner.nextInt();
            int threes2 = 4 - threes1;
            if (player1PrimieraCards < 4) {
                player1PrimieraPoints += (threes1 * 13);
                player1PrimieraCards += threes1;
            }
            if (player2PrimieraCards < 4) {
                player2PrimieraPoints += (threes2 * 13);
                player2PrimieraCards += threes2;
            }

            if (player1PrimieraCards < 4 && player2PrimieraCards < 4) {
                System.out.println("Two (due): ");
                int twos1 = scanner.nextInt();
                int twos2 = 4 - twos1;
                if (player1PrimieraCards < 4) {
                    player1PrimieraPoints += (twos1 * 12);
                    player1PrimieraCards += twos1;
                }
                if (player2PrimieraCards < 4) {
                    player2PrimieraPoints += (twos2 * 12);
                    player2PrimieraCards += twos2;
                }

                System.out.println("Face cards (King/Horse/Jack): ");
                int faceCards1 = scanner.nextInt();
                int faceCards2 = 4 - faceCards1;
                if (player1PrimieraCards < 4) {
                    player1PrimieraPoints += (faceCards1 * 10);
                    player1PrimieraCards += faceCards1;
                }
                if (player2PrimieraCards < 4) {
                    player2PrimieraPoints += (faceCards2 * 10);
                    player2PrimieraCards += faceCards2;
                }
            }
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
