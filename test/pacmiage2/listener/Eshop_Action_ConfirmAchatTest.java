package pacmiage2.listener;

import pacmiage2.listener.Eshop_Action_ConfirmAchat;
import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.modele.Objet;

/**
 *
 * @author Aleckes9
 */
public class Eshop_Action_ConfirmAchatTest {
    
    JoueurInfo j;
    Objet it;
    String message;
    
    public Eshop_Action_ConfirmAchatTest() {
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
     * Test of actionPerformed method, of class Eshop_Action_ConfirmAchat.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        Eshop_Action_ConfirmAchat instance = new Eshop_Action_ConfirmAchat(j, it);
        instance.actionPerformed(ae);
    }
    
}
