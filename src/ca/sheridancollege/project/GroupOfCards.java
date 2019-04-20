/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size;//the size of the grouping
    
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
        for(Card.Suits s : Card.Suits.values()){
            for(Card.Values v : Card.Values.values()){
                this.cards.add(new Card(s, v));
            }
        }
    }
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return this.cards.size();
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
    public void removeCard(int i){
        this.cards.remove(i);
    }
    public void addCard(Card card){
        this.cards.add(card);
    }
    public void draw(GroupOfCards deck){
        this.cards.add(deck.getCard(0));
        deck.removeCard(0);
    }
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
    public void putBackInDeck(GroupOfCards deck){
        int deckSize = this.cards.size();
        
        for(int i = 0; i < deckSize; i++){
            deck.addCard(this.getCard(i));
        }
        for(int i = 0; i < deckSize; i++){
            this.removeCard(0);
        }
    }
    public String toString(){
        String elements = new String();
        for (Card a : this.cards){
            elements += "\n -" + a.toString();
        }
        return elements;
    }
    
}//end class
