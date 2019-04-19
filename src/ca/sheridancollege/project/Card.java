/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public class Card 
{
    public enum Suits{DIAMONDS, CLUBS, SPADES, HEARTS};
    public enum Values{TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE};
    
    private Suits suit;
    private Values value;
    
    public Card(Suits suit, Values value){
        this.suit = suit;
        this.value = value;
    }
    
    public Values getValue(){
        return this.value;
    }
    
    public void setValue(Values value){
        this.value = value;
    }
    
    public Suits getSuit(){
        return this.suit;
    }
    
    public void setSuit(Suits suit){
        this.suit = suit;
    }
    public String toString(){
        return this.suit.toString() + "-" + this.value.toString();
    }
    
}
