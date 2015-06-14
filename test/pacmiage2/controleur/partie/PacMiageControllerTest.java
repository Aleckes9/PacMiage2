package pacmiage2.controleur.partie;

import pacmiage.controleur.partie.PartieController;
import pacmiage.controleur.partie.PacMiageController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.Input;
import pacmiage.modele.PacMiage;

/**
 *
 * @author Aleckes9
 */
public class PacMiageControllerTest {
    
    PacMiage player;
    PartieController partie;
            
    /**
     *
     */
    public PacMiageControllerTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }


    /**
     * Test of isAcceptingInput method, of class PacMiageController.
     */
    @Test
    public void testIsAcceptingInput() {
        System.out.println("isAcceptingInput");
        PacMiageController instance = new PacMiageController(player,  partie);
        boolean expResult = true;
        boolean result = instance.isAcceptingInput();
        assertEquals(expResult, result);
    }

    /**
     * Test of inputEnded method, of class PacMiageController.
     */
    @Test
    public void testInputEnded() {
        System.out.println("inputEnded");
        PacMiageController instance = new PacMiageController(player,  partie);
        instance.inputEnded();
    }

    /**
     * Test of inputStarted method, of class PacMiageController.
     */
    @Test
    public void testInputStarted() {
        System.out.println("inputStarted");
        PacMiageController instance = new PacMiageController(player,  partie);
        instance.inputStarted();
    }


    
}
