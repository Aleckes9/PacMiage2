package pacmiage2.listener;

import pacmiage.listener.ActionBtnObjet;
import java.awt.event.ActionEvent;
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
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class Action_Btn_ObjetTest {
    
    FenetrePrincipale eshopFenetre;
    Objet it;
    
    /**
     *
     */
    public Action_Btn_ObjetTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        
    }
    
    /**
     *
     */
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
        ActionBtnObjet instance = new ActionBtnObjet(it, eshopFenetre);
        instance.actionPerformed(ae);
    }
    
}
