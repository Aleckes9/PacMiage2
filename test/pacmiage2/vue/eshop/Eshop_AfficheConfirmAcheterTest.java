package pacmiage2.vue.eshop;

import java.awt.event.ActionEvent;
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
public class Eshop_AfficheConfirmAcheterTest {
    
    Objet it;
    FenetrePrincipale eshopFenetre;
            
    public Eshop_AfficheConfirmAcheterTest() {
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
     * Test of actionPerformed method, of class Eshop_AfficheConfirmAcheter.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        Eshop_AfficheConfirmAcheter instance = new Eshop_AfficheConfirmAcheter(it, eshopFenetre);
        instance.actionPerformed(ae);
    }
    
}
