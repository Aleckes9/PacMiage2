package pacmiage2.controleur.partie;

import javax.swing.Timer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aleckes9
 */
public class ControleurTempsTest {
    
    public ControleurTempsTest() {
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
     * Test of start method, of class ControleurTemps.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        ControleurTemps instance = null;
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class ControleurTemps.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        ControleurTemps instance = null;
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimer method, of class ControleurTemps.
     */
    @Test
    public void testGetTimer() {
        System.out.println("getTimer");
        ControleurTemps instance = null;
        Timer expResult = null;
        Timer result = instance.getTimer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimer method, of class ControleurTemps.
     */
    @Test
    public void testSetTimer() {
        System.out.println("setTimer");
        Timer timer = null;
        ControleurTemps instance = null;
        instance.setTimer(timer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempsRestant method, of class ControleurTemps.
     */
    @Test
    public void testGetTempsRestant() {
        System.out.println("getTempsRestant");
        ControleurTemps instance = null;
        int expResult = 0;
        int result = instance.getTempsRestant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTempsRestant method, of class ControleurTemps.
     */
    @Test
    public void testSetTempsRestant() {
        System.out.println("setTempsRestant");
        int tempsRestant = 0;
        ControleurTemps instance = null;
        instance.setTempsRestant(tempsRestant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTemps method, of class ControleurTemps.
     */
    @Test
    public void testGetTemps() {
        System.out.println("getTemps");
        ControleurTemps instance = null;
        int expResult = 0;
        int result = instance.getTemps();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTemps method, of class ControleurTemps.
     */
    @Test
    public void testSetTemps() {
        System.out.println("setTemps");
        int temps = 0;
        ControleurTemps instance = null;
        instance.setTemps(temps);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
