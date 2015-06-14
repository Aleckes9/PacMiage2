package pacmiage2.modele;

import pacmiage.modele.Bonus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.SlickException;
import pacmiage.controleur.partie.PartieController;

/**
 *
 * @author Aleckes9
 */
public class BonusTest {
    
    int unNiveau;
    String unCheminCarte;
    
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
    public void testExecuterBonus() throws SlickException {
        System.out.println("executerBonus");
        PartieController partie = new PartieController(unNiveau, unCheminCarte);
        Bonus instance = new BonusImpl();
        instance.executerBonus(partie);
    }

    public class BonusImpl implements Bonus {

        public void executerBonus(PartieController partie) {
        }
    }
    
}
