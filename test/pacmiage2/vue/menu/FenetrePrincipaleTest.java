package pacmiage2.vue.menu;

import pacmiage.vue.menu.FenetrePrincipale;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage.controleur.partie.PartieController;
import pacmiage.modele.JoueurInfo;

/**
 *
 * @author Aleckes9
 */
public class FenetrePrincipaleTest {
    
    JoueurInfo joueur;
    FenetrePrincipale instance;
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
        instance = new FenetrePrincipale();
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
        instance.initFenetre();
    }

    /**
     * Test of initFenetreMenu method, of class FenetrePrincipale.
     */
    @Test
    public void testInitFenetreMenu() throws Exception {
        System.out.println("initFenetreMenu");
        instance.initFenetreMenu();
    }

    /**
     * Test of initFenetreNiveau method, of class FenetrePrincipale.
     */
    @Test
    public void testInitFenetreNiveau() throws Exception {
        System.out.println("initFenetreNiveau");
        instance.initFenetreNiveau();
    }

    /**
     * Test of initFenetreShop method, of class FenetrePrincipale.
     */
    @Test
    public void testInitFenetreShop() throws Exception {
        System.out.println("initFenetreShop");
        instance.initFenetreShop();
    }

    /**
     * Test of executerPartie method, of class FenetrePrincipale.
     */
    @Test
    public void testExecuterPartie() throws Exception {
        System.out.println("executerPartie");
        int niveau = 0;
        String cheminCarte = "";
        instance.executerPartie(niveau, cheminCarte);
    }





    
}
