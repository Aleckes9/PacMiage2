package pacmiage2.vue.menu;

import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage2.modele.JoueurInfo;

/**
 *
 * @author Aleckes9
 */
public class FenetreMenuTest {
    
    FenetrePrincipale uneFenetre;
    JPanel jPanel;
    JPanel boutons;

    JLabel logo;
    JLabel record;

    JButton nouvellepartie;
    JButton store;
    JButton quitter;
    JButton changerLangue;
        
    public FenetreMenuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        jPanel = new JPanel();
        boutons = new JPanel();
        logo = new JLabel(new ImageIcon("./src/ressources/image/logo/logo.png"));
        record = new JLabel("Record : " + String.valueOf(JoueurInfo.getInstance().getRecord()));
        nouvellepartie = new JButton();
        store = new JButton();
        quitter = new JButton();
        changerLangue = new JButton(new ImageIcon("./src/ressources/image/drapeau/enfr.png"));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of init method, of class FenetreMenu.
     */
    @Test
    public void testInit() throws IOException {
        System.out.println("init");
        FenetreMenu instance = new FenetreMenu(uneFenetre);
        instance.init();
    }

    /**
     * Test of initFenetre method, of class FenetreMenu.
     */
    @Test
    public void testInitFenetre() throws IOException {
        System.out.println("initFenetre");
        FenetreMenu instance = new FenetreMenu(uneFenetre);
        instance.initFenetre();
    }

    /**
     * Test of initRecord method, of class FenetreMenu.
     */
    @Test
    public void testInitRecord() throws IOException {
        System.out.println("initRecord");
        FenetreMenu instance = new FenetreMenu(uneFenetre);
        instance.initRecord();
    }

    /**
     * Test of initButtonLangue method, of class FenetreMenu.
     */
    @Test
    public void testInitButtonLangue() throws IOException {
        System.out.println("initButtonLangue");
        FenetreMenu instance = new FenetreMenu(uneFenetre);
        instance.initButtonLangue();
    }

    /**
     * Test of initButtonOptions method, of class FenetreMenu.
     */
    @Test
    public void testInitButtonOptions() throws IOException {
        System.out.println("initButtonOptions");
        FenetreMenu instance = new FenetreMenu(uneFenetre);
        instance.initButtonOptions();
    }

    /**
     * Test of initConfigButton method, of class FenetreMenu.
     */
    @Test
    public void testInitConfigButton() throws IOException {
        System.out.println("initConfigButton");
        JButton button = null;
        FenetreMenu instance = new FenetreMenu(uneFenetre);
        instance.initConfigButtonMenu(button);
    }
    
}
