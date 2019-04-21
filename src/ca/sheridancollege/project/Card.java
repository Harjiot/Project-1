/**
 *@author Taha Yousuf, Harjot Kaur, Harpreet Kaur
 *@version 1
 */
package ca.sheridancollege.project;

public class Card 
{   
    //Setting up Suit and Values
    private Suit suit;
    private Values value;
    
    public Card(Suit suit, Values value){
        this.suit = suit;
        this.value = value;
    }
    //Getting the values
    public Values getValue(){
        return this.value;
    }
    
    public void setValue(Values value){
        this.value = value;
    }
    
    public Suit getSuit(){
        return this.suit;
    }
    
    public void setSuit(Suit suit){
        this.suit = suit;
    }
    public String toString(){
        return this.suit.toString() + "-" + this.value.toString();
    }
    
}
