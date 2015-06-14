package pacmiage2.listener;

import pacmiage.listener.Btn_RetourEshop;
import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage.modele.JoueurInfo;
import pacmiage.vue.menu.FenetrePrincipale;

/**
 *
 * @author Aleckes9
 */
public class Btn_RetourEshopTest {
    
    FenetrePrincipale fenetre;
    JoueurInfo joueur;
    
    public Btn_RetourEshopTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fenetre = new FenetrePrincipale();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class Btn_RetourEshop.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        Btn_RetourEshop instance = new Btn_RetourEshop(fenetre);
        instance.actionPerformed(ae);
    }
    
}
