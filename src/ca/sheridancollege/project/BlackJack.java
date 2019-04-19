package ca.sheridancollege.project;

public class BlackJack {

    public static void main(String[] args) {
        GroupOfCards deck = new GroupOfCards();
        deck.generateDeck();
        deck.shuffle();
        System.out.println(deck);
    }
    
}
