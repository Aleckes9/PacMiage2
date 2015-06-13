package listener;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
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
public class SelectionNiveauListenerTest {
    
    FenetrePrincipale fenetre;
    JoueurInfo joueur;
    JButton tp;
    
    public SelectionNiveauListenerTest() {
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
     * Test of actionPerformed method, of class SelectionNiveauListener.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        SelectionNiveauListener instance = new SelectionNiveauListener(fenetre);
        instance.actionPerformed(e);
    }
    
}
