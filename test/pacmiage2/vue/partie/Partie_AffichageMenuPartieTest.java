package pacmiage2.vue.partie;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
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
public class Partie_AffichageMenuPartieTest {
    
    public Partie_AffichageMenuPartieTest() {
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
     * Test of initFenetre method, of class Partie_AffichageMenuPartie.
     */
    @Test
    public void testInitFenetre() {
        System.out.println("initFenetre");
        Partie_AffichageMenuPartie instance = null;
        instance.initFenetre();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initButton method, of class Partie_AffichageMenuPartie.
     */
    @Test
    public void testInitButton() {
        System.out.println("initButton");
        Partie_AffichageMenuPartie instance = null;
        instance.initButton();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configButton method, of class Partie_AffichageMenuPartie.
     */
    @Test
    public void testConfigButton() {
        System.out.println("configButton");
        JButton button = null;
        Partie_AffichageMenuPartie instance = null;
        instance.configButton(button);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class Partie_AffichageMenuPartie.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        Partie_AffichageMenuPartie instance = null;
        instance.actionPerformed(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFenetre method, of class Partie_AffichageMenuPartie.
     */
    @Test
    public void testGetFenetre() {
        System.out.println("getFenetre");
        Partie_AffichageMenuPartie instance = null;
        JFrame expResult = null;
        JFrame result = instance.getFenetre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
