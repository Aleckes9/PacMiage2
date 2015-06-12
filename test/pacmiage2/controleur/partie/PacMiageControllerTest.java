package pacmiage2.controleur.partie;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.Input;

/**
 *
 * @author Aleckes9
 */
public class PacMiageControllerTest {
    
    public PacMiageControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setInput method, of class PacMiageController.
     */
    @Test
    public void testSetInput() {
        System.out.println("setInput");
        Input input = null;
        PacMiageController instance = null;
        instance.setInput(input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAcceptingInput method, of class PacMiageController.
     */
    @Test
    public void testIsAcceptingInput() {
        System.out.println("isAcceptingInput");
        PacMiageController instance = null;
        boolean expResult = false;
        boolean result = instance.isAcceptingInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inputEnded method, of class PacMiageController.
     */
    @Test
    public void testInputEnded() {
        System.out.println("inputEnded");
        PacMiageController instance = null;
        instance.inputEnded();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inputStarted method, of class PacMiageController.
     */
    @Test
    public void testInputStarted() {
        System.out.println("inputStarted");
        PacMiageController instance = null;
        instance.inputStarted();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyPressed method, of class PacMiageController.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        int key = 0;
        char c = ' ';
        PacMiageController instance = null;
        instance.keyPressed(key, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyReleased method, of class PacMiageController.
     */
    @Test
    public void testKeyReleased() {
        System.out.println("keyReleased");
        int key = 0;
        char c = ' ';
        PacMiageController instance = null;
        instance.keyReleased(key, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
