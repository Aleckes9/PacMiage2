package pacmiage2.listener;

import pacmiage.listener.RetourMenu;
import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pacmiage.modele.JoueurInfo;
import pacmiage.vue.menu.FenetrePrincipale;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class RetourMenuTest {
    
    FenetrePrincipale f;
    JoueurInfo joueur;
    
    /**
     *
     */
    public RetourMenuTest() {
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
        f = new FenetrePrincipale();
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class RetourMenu.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        RetourMenu instance = new RetourMenu(f);
        instance.actionPerformed(ae);
    }
    
}
