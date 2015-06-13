package pacmiage2.vue.menu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static pacmiage2.controleur.MainPacMiage.joueur;
import pacmiage2.modele.JoueurInfo;

/**
 *
 * @author Aleckes9
 */
public class SelectionnerNiveauTest {
    
    FenetrePrincipale fenetre1;
    JoueurInfo JOUEUR;
            
    public SelectionnerNiveauTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fenetre1 = new FenetrePrincipale(joueur);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initFenetre method, of class SelectionnerNiveau.
     */
    @Test
    public void testInitFenetre() {
        System.out.println("initFenetre");
        SelectionnerNiveau instance = new SelectionnerNiveau(fenetre1);
        instance.initFenetre();
    }

    /**
     * Test of initBoutons method, of class SelectionnerNiveau.
     */
    @Test
    public void testInitBoutons() {
        System.out.println("initBoutons");
        SelectionnerNiveau instance = new SelectionnerNiveau(fenetre1);
        instance.initBoutons();
    }
    
}
