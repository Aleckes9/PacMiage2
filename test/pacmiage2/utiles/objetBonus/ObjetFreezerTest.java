package pacmiage2.utiles.objetBonus;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage2.controleur.partie.PartieController;

/**
 *
 * @author Aleckes9
 */
public class ObjetFreezerTest {
    
    public ObjetFreezerTest() {
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
     * Test of executerBonus method, of class ObjetFreezer.
     */
    @Test
    public void testExecuterBonus() {
        System.out.println("executerBonus");
        PartieController partie = null;
        ObjetFreezer instance = new ObjetFreezer();
        instance.executerBonus(partie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
