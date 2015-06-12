package pacmiage2.modele;

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
public class BonusTest {
    
    public BonusTest() {
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
     * Test of executerBonus method, of class Bonus.
     */
    @Test
    public void testExecuterBonus() {
        System.out.println("executerBonus");
        PartieController partie = null;
        Bonus instance = new BonusImpl();
        instance.executerBonus(partie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BonusImpl implements Bonus {

        public void executerBonus(PartieController partie) {
        }
    }
    
}
