package pacmiage2.controleur.partie;

import pacmiage.controleur.partie.PartieController;
import pacmiage.listener.PacMiageListener;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage.modele.PacMiage;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class PacMiageListenerTest {
    
    PacMiage player;
    PartieController partie;
            
    /**
     *
     */
    public PacMiageListenerTest() {
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
     * Test of isAcceptingInput method, of class PacMiageListener.
     */
    @Test
    public void testIsAcceptingInput() {
        System.out.println("isAcceptingInput");
        PacMiageListener instance = new PacMiageListener(player,  partie);
        boolean expResult = true;
        boolean result = instance.isAcceptingInput();
        assertEquals(expResult, result);
    }

    /**
     * Test of inputEnded method, of class PacMiageListener.
     */
    @Test
    public void testInputEnded() {
        System.out.println("inputEnded");
        PacMiageListener instance = new PacMiageListener(player,  partie);
        instance.inputEnded();
    }

    /**
     * Test of inputStarted method, of class PacMiageListener.
     */
    @Test
    public void testInputStarted() {
        System.out.println("inputStarted");
        PacMiageListener instance = new PacMiageListener(player,  partie);
        instance.inputStarted();
    }


    
}
