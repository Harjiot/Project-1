/**
 *@author Taha Yousuf, Harjot Kaur, Harpreet Kaur
 *@version 1
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

public class PlayerHand extends GroupOfCards{
    
    private ArrayList<Card> playerHand;
    
    public PlayerHand(){
        this.playerHand = new ArrayList<Card>();
    }
    
    @Override
    public Card getCard(int i){
        return this.playerHand.get(i);
    }
    @Override
    public void removeCard(int i){
        this.playerHand.remove(i);
    }
    @Override
    public void addCard(Card card){
        this.playerHand.add(card);
    }
    /**
     * Method to draw a card from a deck
     * @param deck 
     */
    public void draw(GroupOfCards deck){
        this.playerHand.add(deck.getCard(0));
        deck.removeCard(0);
    }
    /**
     * Method to return cards into deck
     * @param deck 
     */
    public void putBackInDeck(GroupOfCards deck){
        int deckSize = this.playerHand.size();
        
        for(int i = 0; i < deckSize; i++){
            deck.addCard(this.getCard(i));
        }
        for(int i = 0; i < deckSize; i++){
            this.removeCard(0);
        }
    }
    /**
     * Displays the size
     * @return 
     */
    public int getSize() {
        return this.playerHand.size();
    }
    @Override
    public int cardValue(){
        int totalValue = 0;
        int aces = 0;
        
        for(Card card: this.playerHand){
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
    @Override
    public String toString(){
        String elements = new String();
        for (Card a : this.playerHand){
            elements += "\n -" + a.toString();
        }
        return elements;
    }
}
