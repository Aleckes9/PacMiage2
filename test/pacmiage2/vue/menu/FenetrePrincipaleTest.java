package pacmiage2.vue.menu;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage2.controleur.partie.PartieController;
import pacmiage2.modele.JoueurInfo;

/**
 *
 * @author Aleckes9
 */
public class FenetrePrincipaleTest {
    
    JoueurInfo joueur;
    
    public FenetrePrincipaleTest() {
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
     * Test of initFenetre method, of class FenetrePrincipale.
     */
    @Test
    public void testInitFenetre() {
        System.out.println("initFenetre");
        FenetrePrincipale instance = new FenetrePrincipale(joueur);
        instance.initFenetre();
    }

    /**
     * Test of initFenetreMenu method, of class FenetrePrincipale.
     */
    @Test
    public void testInitFenetreMenu() throws Exception {
        System.out.println("initFenetreMenu");
        FenetrePrincipale instance = null;
        instance.initFenetreMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initFenetreNiveau method, of class FenetrePrincipale.
     */
    @Test
    public void testInitFenetreNiveau() throws Exception {
        System.out.println("initFenetreNiveau");
        FenetrePrincipale instance = null;
        instance.initFenetreNiveau();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initFenetreShop method, of class FenetrePrincipale.
     */
    @Test
    public void testInitFenetreShop() throws Exception {
        System.out.println("initFenetreShop");
        FenetrePrincipale instance = null;
        instance.initFenetreShop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executerPartie method, of class FenetrePrincipale.
     */
    @Test
    public void testExecuterPartie() throws Exception {
        System.out.println("executerPartie");
        int niveau = 0;
        String cheminCarte = "";
        FenetrePrincipale instance = null;
        instance.executerPartie(niveau, cheminCarte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJpanel method, of class FenetrePrincipale.
     */
    @Test
    public void testGetJpanel() {
        System.out.println("getJpanel");
        FenetrePrincipale instance = null;
        JPanel expResult = null;
        JPanel result = instance.getJpanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJpanel method, of class FenetrePrincipale.
     */
    @Test
    public void testSetJpanel() {
        System.out.println("setJpanel");
        JPanel jpanel = null;
        FenetrePrincipale instance = null;
        instance.setJpanel(jpanel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJoueur method, of class FenetrePrincipale.
     */
    @Test
    public void testGetJoueur() {
        System.out.println("getJoueur");
        FenetrePrincipale instance = null;
        JoueurInfo expResult = null;
        JoueurInfo result = instance.getJoueur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPartieController method, of class FenetrePrincipale.
     */
    @Test
    public void testGetPartieController() {
        System.out.println("getPartieController");
        FenetrePrincipale instance = null;
        PartieController expResult = null;
        PartieController result = instance.getPartieController();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPartieController method, of class FenetrePrincipale.
     */
    @Test
    public void testSetPartieController() {
        System.out.println("setPartieController");
        PartieController partieController = null;
        FenetrePrincipale instance = null;
        instance.setPartieController(partieController);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTailleEcran method, of class FenetrePrincipale.
     */
    @Test
    public void testGetTailleEcran() {
        System.out.println("getTailleEcran");
        Dimension expResult = null;
        Dimension result = FenetrePrincipale.getTailleEcran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
