package pacmiage2.vue.bouton;

import pacmiage.vue.bouton.Eshop_BtnAcheter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage.modele.Objet;
import pacmiage.vue.menu.FenetrePrincipale;

/**
 *
 * @author Aleckes9
 */
public class Eshop_BtnAcheterTest {
    
    Objet it;
    FenetrePrincipale eshopFenetre;
            
    public Eshop_BtnAcheterTest() {
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
     * Test of initButton method, of class Eshop_BtnAcheter.
     */
    @Test
    public void testInitButton() {
        System.out.println("initButton");
        Eshop_BtnAcheter instance = new Eshop_BtnAcheter(it, eshopFenetre);
        instance.initButton();
    }
    
}
