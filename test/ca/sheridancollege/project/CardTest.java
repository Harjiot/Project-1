/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author scorc
 */
public class CardTest {
    
    public CardTest() {
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
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValueGood() {
        System.out.println("getValue");
        Card instance = new Card(Suit.CLUBS, Values.JACK);
        Values expResult = Values.JACK;
        Values result = instance.getValue();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetValueBad() {
        System.out.println("getValue");
        Card instance = new Card(Suit.CLUBS, null);
        Values expResult = null;
        Values result = instance.getValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValue method, of class Card.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Values value = Values.FIVE;
        Card instance = new Card(Suit.CLUBS, Values.ACE);
        instance.setValue(value);
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Card instance = new Card(Suit.DIAMONDS, Values.EIGHT);
        Suit expResult = Suit.DIAMONDS;
        Suit result = instance.getSuit();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSuit method, of class Card.
     */
    @Test
    public void testSetSuit() {
        System.out.println("setSuit");
        Suit suit = Suit.DIAMONDS;
        Card instance = new Card(Suit.CLUBS, Values.FIVE);
        instance.setSuit(suit);
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = new Card(Suit.CLUBS, Values.NINE);
        String expResult = "CLUBS-NINE";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
