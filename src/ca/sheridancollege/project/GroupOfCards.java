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
        return size;
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
    public void draw(GroupOfCards deck){
        this.cards.add(deck.getCard(0));
        deck.removeCard(0);
    }
    public String toString(){
        String elements = new String();
        for (Card a : this.cards){
            elements += "\n -" + a.toString();
        }
        return elements;
    }
    
}//end class
