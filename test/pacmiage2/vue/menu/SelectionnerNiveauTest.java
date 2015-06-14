package pacmiage2.vue.menu;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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
        fenetre1 = new FenetrePrincipale();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initFenetre method, of class SelectionnerNiveau.
     */
    @Test
    public void testInitFenetre() {
        try {
            System.out.println("initFenetre");
            SelectionnerNiveau instance = new SelectionnerNiveau(fenetre1);
            instance.initFenetre();
        } catch (IOException ex) {
            Logger.getLogger(SelectionnerNiveauTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of initBoutons method, of class SelectionnerNiveau.
     */
    @Test
    public void testInitBoutons() {
        try {
            System.out.println("initBoutons");
            SelectionnerNiveau instance = new SelectionnerNiveau(fenetre1);
            instance.initBoutons();
        } catch (IOException ex) {
            Logger.getLogger(SelectionnerNiveauTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
