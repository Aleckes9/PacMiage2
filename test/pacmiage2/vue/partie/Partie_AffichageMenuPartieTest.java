package pacmiage2.vue.partie;

import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import pacmiage2.controleur.partie.PartieController;

/**
 *
 * @author Aleckes9
 */
public class Partie_AffichageMenuPartieTest {
    
    PartieController partie;
    int unNiveau;
    String unCheminCarte;
    JPanel boutons;
    GameContainer container;
            
    public Partie_AffichageMenuPartieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws SlickException {
        partie = new PartieController(unNiveau, unCheminCarte);
        boutons = new JPanel();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initFenetre method, of class Partie_AffichageMenuPartie.
     * @throws java.io.IOException
     */
    @Test
    public void testInitFenetre() throws IOException {
        System.out.println("initFenetre");
        Partie_AffichageMenuPartie instance = new Partie_AffichageMenuPartie(partie);
        instance.initFenetre();
    }

    /**
     * Test of initButton method, of class Partie_AffichageMenuPartie.
     * @throws java.io.IOException
     */
    @Test
    public void testInitButton() throws IOException {
        System.out.println("initButton");
        Partie_AffichageMenuPartie instance = new Partie_AffichageMenuPartie(partie);
        instance.initButton();
    }

    /**
     * Test of configButton method, of class Partie_AffichageMenuPartie.
     * @throws java.io.IOException
     */
    @Test
    public void testConfigButton() throws IOException {
        System.out.println("configButton");
        JButton button = null;
        Partie_AffichageMenuPartie instance = new Partie_AffichageMenuPartie(partie);
        instance.configButton(button);
    }

    /**
     * Test of actionPerformed method, of class Partie_AffichageMenuPartie.
     * @throws java.io.IOException
     */
    @Test
    public void testActionPerformed() throws IOException {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        Partie_AffichageMenuPartie instance = new Partie_AffichageMenuPartie(partie);
        instance.actionPerformed(ae);
    }
}
