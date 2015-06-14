package pacmiage2.controleur.partie;

import pacmiage.modele.ControleurTemps;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Aleckes9
 */
public class ControleurTempsTest {
    
    int temps;
    
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
        ControleurTemps instance = new ControleurTemps(temps);
        instance.start();
    }

    /**
     * Test of stop method, of class ControleurTemps.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        ControleurTemps instance = new ControleurTemps(temps);
        instance.stop();
    }
}
