package listener;

import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.modele.Objet;
import pacmiage2.vue.menu.FenetrePrincipale;

/**
 *
 * @author Aleckes9
 */
public class Eshop_Action_AchatTest {
    
    Objet it;
    FenetrePrincipale eshopFenetre;
    String message;
    int graines;
    JoueurInfo joueur;
    Class classe;
    
    String nom;
    String image;
    String description;
    int prix;
    String miniImage;
    
    public Eshop_Action_AchatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        graines = 0;
        prix = 0;
        eshopFenetre = new FenetrePrincipale(joueur);
        it = new Objet( nom, image, description, prix, miniImage);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class Eshop_Action_Achat.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        Eshop_Action_Achat instance = new Eshop_Action_Achat(it, eshopFenetre);
        instance.actionPerformed(ae);
    }
    
}
