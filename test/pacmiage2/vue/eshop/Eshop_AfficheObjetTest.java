package pacmiage2.vue.eshop;

import javax.swing.JPanel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage2.modele.Objet;
import pacmiage2.vue.menu.FenetrePrincipale;

/**
 *
 * @author Aleckes9
 */
public class Eshop_AfficheObjetTest {
    
    JPanel panel;
    Objet objet;
    boolean affBtnAchat;
    FenetrePrincipale eshopFenetre;
            
    public Eshop_AfficheObjetTest() {
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
     * Test of afficher method, of class Eshop_AfficheObjet.
     */
    @Test
    public void testAfficher() {
        System.out.println("afficher");
        Eshop_AfficheObjet instance = new Eshop_AfficheObjet(panel, objet, affBtnAchat, eshopFenetre);
        instance.afficher();
    }
    
}
