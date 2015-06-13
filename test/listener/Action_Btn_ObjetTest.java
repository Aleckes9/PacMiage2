package listener;

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
public class Action_Btn_ObjetTest {
    
    FenetrePrincipale eshopFenetre;
    Objet it;
    
    public Action_Btn_ObjetTest() {
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
     * Test of actionPerformed method, of class Action_Btn_Objet.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        Action_Btn_Objet instance = new Action_Btn_Objet(it, eshopFenetre);
        instance.actionPerformed(ae);
    }
    
}
