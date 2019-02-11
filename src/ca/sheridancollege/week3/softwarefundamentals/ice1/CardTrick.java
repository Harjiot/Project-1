/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
             Random random = new Random();
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
       c.setValue(random.nextInt(13)+1);
            c.setSuit(Card.SUITS[(int) (Math.random()*3 +1)]);
         
         magicHand[i]=c;  
         
         // System.out.println("Random value of card: " + valueRand);
         System.out.println("Choose a  random card suit " + c.getSuit());
         System.out.println("Select  the random number " + c.getValue());
         break;
          
        }
        
          Scanner input = new Scanner(System.in);
          
          System.out.println("Please Enter a card ");
        String inputCard = input.nextLine();
        
        System.out.println("Please Enter a value");
      
        int inputValue = input.nextInt();
        
       
     
        Card Cards = new Card();
        //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        Cards.setValue(inputValue);
        Cards.setSuit(inputCard);
       
        //insert code to ask the user for Card value and suit, create their card
        //Then report the result here
    for (int i=0; i<magicHand.length; i++)
        {
            
           
            if(((magicHand[i].getSuit()).equals(Cards.getSuit()))  && (magicHand[i].getValue()==Cards.getValue()))
            {
                
                System.out.println("you have Wining opportunity");
                break;  
                    }
       
            else {
               
                System.out.println("You will lost");
                break;
            }
       
        }
        Card Luky_Card=new Card();
        Luky_Card.setValue(1);
        Luky_Card.setSuit("Hearts");
        System.out.println("This is my Lucky Card"+Lucky_Card.getValue());
        System.out.println("This is my lucky suit"+Lucky_Card.getSuit());
        }
        
      
    }
    

