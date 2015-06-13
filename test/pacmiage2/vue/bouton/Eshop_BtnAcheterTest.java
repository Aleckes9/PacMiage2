package pacmiage2.vue.bouton;

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
