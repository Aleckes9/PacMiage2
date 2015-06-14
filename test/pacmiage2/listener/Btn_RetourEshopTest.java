package pacmiage2.listener;

import pacmiage2.listener.Btn_RetourEshop;
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
