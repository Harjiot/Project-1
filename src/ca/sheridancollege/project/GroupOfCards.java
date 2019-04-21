/**
 *@author Taha Yousuf, Harjot Kaur, Harpreet Kaur
 *@version 1
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size;//
    
    public GroupOfCards()
    {
        this.cards = new ArrayList<Card>();
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    public void generateDeck(){
        for(Suit s : Suit.values()){
            for(Values v : Values.values()){
                this.cards.add(new Card(s, v));
            }
        }
    }
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    public Card getCard(int i){
        return this.cards.get(i);
    }
    /**
     * Removing a card from the deck
     * @param i 
     */
    public void removeCard(int i){
        this.cards.remove(i);
    }
    /**
     * Adding a card to the deck
     * @param card 
     */
    public void addCard(Card card){
        this.cards.add(card);
    }
    /**
     * Method to determine the actual value of a card.
     * @return 
     */
    public int cardValue(){
        int totalValue = 0;
        int aces = 0;
        
        for(Card card: this.cards){
            switch(card.getValue()){
                case TWO: 
                    totalValue += 2;
                    break;
                case THREE: 
                    totalValue += 3;
                    break;
                case FOUR: 
                    totalValue += 4;
                    break;
                case FIVE: 
                    totalValue += 5;
                    break;
                case SIX: 
                    totalValue += 6;
                    break;
                case SEVEN:
                    totalValue += 7;
                    break;
                case EIGHT:
                    totalValue += 8;
                    break;
                case NINE: 
                    totalValue += 9;
                    break;
                case TEN:
                    totalValue += 10;
                    break;
                case JACK: 
                    totalValue += 10;
                    break;
                case QUEEN:
                    totalValue += 10;
                    break;
                case KING:
                    totalValue += 10;
                    break;
                case ACE:
                    aces += 1;
                    break;
            }
        }
        for(int i = 0; i < aces; i++){
            if(totalValue > 10){
                totalValue += 1;
            }else{
                totalValue += 11;
            }
        }
        
        return totalValue;
    }
    public String toString(){
        String elements = new String();
        for (Card a : this.cards){
            elements += "\n -" + a.toString();
        }
        return elements;
    }
    
}//end class
