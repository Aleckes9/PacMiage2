package pacmiage2.controleur.partie;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Music;
import org.newdawn.slick.Sound;
import pacmiage2.modele.Fantome;
import pacmiage2.modele.PacMiage;
import pacmiage2.vue.partie.Partie_AffichageImageFondu;
import pacmiage2.vue.partie.Partie_AffichageObjetBonus;

/**
 *
 * @author Aleckes9
 */
public class PartieControllerTest {
    
    int unNiveau;
    String unCheminCarte;
    GameContainer container;
            
    public PartieControllerTest() {
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
     * Test of init method, of class PartieController.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        container = null;
        PartieController instance = new PartieController(unNiveau, unCheminCarte);
        instance.init(container);
    }


    /**
     * Test of render method, of class PartieController.
     */
    @Test
    public void testRender() throws Exception {
        System.out.println("render");
        GameContainer container = null;
        Graphics g = null;
        PartieController instance = null;
        instance.render(container, g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PartieController.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        GameContainer container = null;
        int delta = 0;
        PartieController instance = null;
        instance.update(container, delta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
