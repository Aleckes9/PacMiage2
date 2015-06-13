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
public class FenetreMenuListenerTest {
    
    FenetrePrincipale fenetre;
    JoueurInfo joueur;
    ActionEvent ae;
    
    Object source;
    int id;
    String command;
    long when;
    int modifiers;
    
    public FenetreMenuListenerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fenetre = new FenetrePrincipale(joueur);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class FenetreMenuListener.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = new ActionEvent(source,  id,  command,  when,  modifiers);
        FenetreMenuListener instance = new FenetreMenuListener(fenetre);
        instance.actionPerformed(ae);
    }
    
}
