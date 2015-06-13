package listener;

import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.vue.menu.FenetrePrincipale;

/**
 *
 * @author Aleckes9
 */
public class RetourMenuTest {
    
    FenetrePrincipale f;
    JoueurInfo joueur;
    
    public RetourMenuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        f = new FenetrePrincipale(joueur);
    }
    
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
