package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerHandTest {
    
    public PlayerHandTest() {
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
     * Test of getCard method, of class PlayerHand.
     */
    @Test
    public void testGetCardGood() {
        System.out.println("getCard");
        int i = 0;
        PlayerHand instance = new PlayerHand();
        Card expResult = new Card(Suit.CLUBS, Values.TWO);
        instance.addCard(expResult);
        Card result = instance.getCard(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeCard method, of class PlayerHand.
     */
    @Test
    public void testRemoveCardGood() {
        System.out.println("removeCard");
        int i = 0;
        PlayerHand instance = new PlayerHand();
        instance.addCard(new Card(Suit.CLUBS, Values.ACE));
        instance.removeCard(i);
    }

    /**
     * Test of addCard method, of class PlayerHand.
     */
    @Test
    public void testAddCardGood() {
        System.out.println("addCard");
        Card card = new Card(Suit.CLUBS, Values.ACE);
        PlayerHand instance = new PlayerHand();
        instance.addCard(card);
    }

    /**
     * Test of draw method, of class PlayerHand.
     */
    @Test
    public void testDrawGood() {
        System.out.println("draw");
        GroupOfCards deck = new GroupOfCards();
        deck.generateDeck();
        PlayerHand instance = new PlayerHand();
        instance.draw(deck);
    }

    /**
     * Test of putBackInDeck method, of class PlayerHand.
     */
    @Test
    public void testPutBackInDeckGood() {
        System.out.println("putBackInDeck");
        GroupOfCards deck = new GroupOfCards();
        deck.generateDeck();
        PlayerHand instance = new PlayerHand();
        instance.draw(deck);
        instance.putBackInDeck(deck);
    }

    /**
     * Test of getSize method, of class PlayerHand.
     */
    @Test
    public void testGetSizeGood() {
        System.out.println("getSize");
        PlayerHand instance = new PlayerHand();
        instance.addCard(new Card(Suit.CLUBS, Values.ACE));
        int expResult = 1;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of cardValue method, of class PlayerHand.
     */
    @Test
    public void testCardValueGood() {
        System.out.println("cardValue");
        PlayerHand instance = new PlayerHand();
        instance.addCard(new Card(Suit.CLUBS, Values.FIVE));
        int expResult = 5;
        int result = instance.cardValue();
        assertEquals(expResult, result);
    }
    
}
