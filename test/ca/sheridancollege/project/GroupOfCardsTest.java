package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println(">>>>>>>setUpClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println(">>>>>>>tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println(">>>>>>>setUp");
    }
    
    @After
    public void tearDown() {
        System.out.println(">>>>>>>tearDown");
    }

    /**
     * Test of showCards method, of class GroupOfCards.
     */
    @Test
    public void testShowCards() {
        System.out.println("showCards");
        GroupOfCards instance = new GroupOfCards();
        ArrayList<Card> expResult = new ArrayList();
        ArrayList<Card> result = instance.showCards();
        assertEquals(expResult, result);
    }

    /**
     * Test of generateDeck method, of class GroupOfCards.
     */
    @Test
    public void testGenerateDeck() {
        System.out.println("generateDeck");
        GroupOfCards instance = new GroupOfCards();
        instance.generateDeck();
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = new GroupOfCards();
        instance.generateDeck();
        instance.shuffle();
    }

    /**
     * Test of getCard method, of class GroupOfCards.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        int i = 0;
        GroupOfCards instance = new GroupOfCards();
        Card expResult = new Card(Suit.CLUBS, Values.EIGHT);
        instance.addCard(expResult);
        Card result = instance.getCard(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeCard method, of class GroupOfCards.
     */
    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        int i = 0;
        GroupOfCards instance = new GroupOfCards();
        instance.addCard(new Card(Suit.CLUBS, Values.FIVE));
        instance.removeCard(i);
    }

    /**
     * Test of addCard method, of class GroupOfCards.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = new Card(Suit.DIAMONDS, Values.FOUR);
        GroupOfCards instance = new GroupOfCards();
        instance.addCard(card);
    }

    /**
     * Test of cardValue method, of class GroupOfCards.
     */
    @Test
    public void testCardValue() {
        System.out.println("cardValue");
        GroupOfCards instance = new GroupOfCards();
        instance.addCard(new Card(Suit.CLUBS, Values.NINE));
        int expResult = 9;
        int result = instance.cardValue();
        assertEquals(expResult, result);
    }
    
}
