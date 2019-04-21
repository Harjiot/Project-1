package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getPlayerID method, of class Player.
     */
    @Test
    public void testGetPlayerIDGood() {
        System.out.println("getPlayerID");
        Player instance = new Player("John");
        String expResult = "John";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetPlayerIDBad() {
        System.out.println("getPlayerID");
        Player instance = new Player(null);
        String expResult = null;
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetPlayerIDBoundary() {
        System.out.println("getPlayerID");
        Player instance = new Player("J");
        String expResult = "J";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
    }
    
}
