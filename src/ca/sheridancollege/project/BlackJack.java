/**
 *@author Taha Yousuf, Harjot Kaur, Harpreet Kaur
 *@version 1
 */
package ca.sheridancollege.project;

import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {
        
        //Starting new Game
        NewGame game = new NewGame("Blackjack");
        System.out.println("Welcome to "+ game.getGameName());
        System.out.println("***************************************");
        //Getting player
        Scanner keysIn = new Scanner(System.in);
        System.out.println("What is your name?");
        String playerName = keysIn.next();
        Player one = new Player(playerName);
        
        //Creating deck
        GroupOfCards deck = new GroupOfCards();
        deck.generateDeck();
        deck.shuffle();
        //System.out.println(deck);
        
        //Creating Player and Dealer Deck
        PlayerHand playerHand = new PlayerHand();
        PlayerHand dealerHand = new PlayerHand();
        
        //Amount of Bet for Player
        double playerMoney = 100.00;
        
        //Game loop
        while(playerMoney > 0){
            //Taking the players bet
            System.out.println("Hello " +one.getPlayerID() + ". You have $" + playerMoney + ", how much would you like to bet?");
            double playerBet = keysIn.nextDouble();
            while (playerBet > playerMoney){
                System.out.println("You don't have enough money to bet that much.");
                System.out.println("Please place another bet.");
                playerBet = keysIn.nextDouble();
            }
            boolean endRound = false;
            //Start Dealing
            //Player gets two cards
            playerHand.draw(deck);
            playerHand.draw(deck);
            
            //Dealer gets two cards
            dealerHand.draw(deck);
            dealerHand.draw(deck);
            
            while(true){
                //Displaying players hand
                System.out.println("Your Hand: "+ playerHand.toString());
                System.out.println("Total value of your hand: " + playerHand.cardValue());
                
                //Displaying dealer hand
                System.out.println("Dealer first card is: " + dealerHand.getCard(0).toString());
                
                //Asking player what they would like to do
                System.out.println("What would you like to do?");
                System.out.println("Press 1 to Hit \nPress 2 to Stand");
                int decision = keysIn.nextInt();
                
                if ((decision != 1) && (decision != 2)){
                    System.out.println("You must press a 1 or a 2");
                    System.out.println("Press 1 to Hit \nPress 2 to Stand");
                    decision = keysIn.nextInt();
                }
                //Hit
                if(decision == 1){
                    playerHand.draw(deck);
                    System.out.println("You drew a " + playerHand.getCard(playerHand.getSize()-1).toString());
                    
                    //Bust
                    if(playerHand.cardValue() > 21){
                        System.out.println("Busted! You cards value is: " + playerHand.cardValue() + " which is over 21");
                        playerMoney -= playerBet;
                        endRound = true;
                        break;
                    }
                }
                
                //Stand
                if(decision == 2){
                    break;
                }
            }
            
            //Show dealer cards
            System.out.println("Dealer cards: " + dealerHand.toString());
           
            //Determining Winner
            //Check to see if dealer has higher card value.
            if((dealerHand.cardValue() > playerHand.cardValue()) && endRound == false){
                System.out.println("Dealer wins!");
                playerMoney -= playerBet;
                endRound = true;
            }
            //Dealer will draw if value is 16 and stand if value is greater than or equal to 17
            while((dealerHand.cardValue() < 17) && endRound == false){
                dealerHand.draw(deck);
                System.out.println("The Dealer drew a " + dealerHand.getCard(dealerHand.getSize()-1).toString());
            }
            //Displaying dealerHand value
            System.out.println("Dealer hands value is: "+ dealerHand.cardValue());
            //See if dealer busted
            if((dealerHand.cardValue() > 21) && endRound == false){
                System.out.println("Dealer Busted! You Win!");
                playerMoney += playerBet;
                endRound = true;
            }
            //See if playerHand value is equal to dealerHand
            if((playerHand.cardValue() == dealerHand.cardValue()) && endRound == false){
                System.out.println("Push");
                endRound = true;
            }
            //See if dealerHad value is higher than playerHand
            if((dealerHand.cardValue() > playerHand.cardValue()) && endRound == false){
                System.out.println("Dealer wins!");
                playerMoney -= playerBet;
                endRound = true;
            }
            //See if playerHand value is higher than dealerHand
            if((playerHand.cardValue() > dealerHand.cardValue()) && endRound == false){
                System.out.println("You Win! You beat the dealer.");
                playerMoney += playerBet;
                endRound = true;
            }
            
            //Moving cards back into deck
            playerHand.putBackInDeck(deck);
            dealerHand.putBackInDeck(deck);
            System.out.println("End of hand");
            System.out.println("Would you like to continue playing? Press 1 for yes and 2 for no");
            int answer = keysIn.nextInt();
            if(answer == 2){
                System.out.println("Ok " +one.getPlayerID()+ " thanks for playing. You are leaving here with $" + playerMoney + ". Have a great day");
                break;
            }
            if(answer == 1){
                if(playerMoney > 0)
                    System.out.println("Alright " + one.getPlayerID() + " lets keep going");
                if(playerMoney <= 0){
                    System.out.println("Sorry you don't have enough money.");
                }
            }
        }
        
        System.out.println("Game Over!");
    }
    
}
