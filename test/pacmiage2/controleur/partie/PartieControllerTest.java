package pacmiage2.controleur.partie;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.AppGameContainer;
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
     * Test of getPlayer method, of class PartieController.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        PartieController instance = null;
        PacMiage expResult = null;
        PacMiage result = instance.getPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListFantome method, of class PartieController.
     */
    @Test
    public void testGetListFantome() {
        System.out.println("getListFantome");
        PartieController instance = null;
        List<Fantome> expResult = null;
        List<Fantome> result = instance.getListFantome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class PartieController.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        GameContainer container = null;
        PartieController instance = null;
        instance.init(container);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimer method, of class PartieController.
     */
    @Test
    public void testGetTimer() {
        System.out.println("getTimer");
        PartieController instance = null;
        ControleurTemps expResult = null;
        ControleurTemps result = instance.getTimer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

    /**
     * Test of getContainer method, of class PartieController.
     */
    @Test
    public void testGetContainer() {
        System.out.println("getContainer");
        PartieController instance = null;
        GameContainer expResult = null;
        GameContainer result = instance.getContainer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBackground method, of class PartieController.
     */
    @Test
    public void testGetBackground() {
        System.out.println("getBackground");
        PartieController instance = null;
        Music expResult = null;
        Music result = instance.getBackground();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGame method, of class PartieController.
     */
    @Test
    public void testGetGame() {
        System.out.println("getGame");
        PartieController instance = null;
        AppGameContainer expResult = null;
        AppGameContainer result = instance.getGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGame method, of class PartieController.
     */
    @Test
    public void testSetGame() {
        System.out.println("setGame");
        AppGameContainer game = null;
        PartieController instance = null;
        instance.setGame(game);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAffichageBonus method, of class PartieController.
     */
    @Test
    public void testGetAffichageBonus() {
        System.out.println("getAffichageBonus");
        PartieController instance = null;
        Partie_AffichageObjetBonus[] expResult = null;
        Partie_AffichageObjetBonus[] result = instance.getAffichageBonus();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAffichageBonus method, of class PartieController.
     */
    @Test
    public void testSetAffichageBonus() {
        System.out.println("setAffichageBonus");
        Partie_AffichageObjetBonus[] affichageBonus = null;
        PartieController instance = null;
        instance.setAffichageBonus(affichageBonus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMultiplicateur method, of class PartieController.
     */
    @Test
    public void testSetMultiplicateur() {
        System.out.println("setMultiplicateur");
        int multiplicateur = 0;
        PartieController instance = null;
        instance.setMultiplicateur(multiplicateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImageVeracite method, of class PartieController.
     */
    @Test
    public void testGetImageVeracite() {
        System.out.println("getImageVeracite");
        PartieController instance = null;
        Partie_AffichageImageFondu expResult = null;
        Partie_AffichageImageFondu result = instance.getImageVeracite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImageVeracite method, of class PartieController.
     */
    @Test
    public void testSetImageVeracite() {
        System.out.println("setImageVeracite");
        Partie_AffichageImageFondu imageVeracite = null;
        PartieController instance = null;
        instance.setImageVeracite(imageVeracite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSon method, of class PartieController.
     */
    @Test
    public void testGetSon() {
        System.out.println("getSon");
        PartieController instance = null;
        Sound expResult = null;
        Sound result = instance.getSon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSon method, of class PartieController.
     */
    @Test
    public void testSetSon() {
        System.out.println("setSon");
        Sound son = null;
        PartieController instance = null;
        instance.setSon(son);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCollision method, of class PartieController.
     */
    @Test
    public void testIsCollision() {
        System.out.println("isCollision");
        PartieController instance = null;
        boolean expResult = false;
        boolean result = instance.isCollision();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCollision method, of class PartieController.
     */
    @Test
    public void testSetCollision() {
        System.out.println("setCollision");
        boolean collision = false;
        PartieController instance = null;
        instance.setCollision(collision);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempsBonus method, of class PartieController.
     */
    @Test
    public void testGetTempsBonus() {
        System.out.println("getTempsBonus");
        PartieController instance = null;
        ControleurTemps expResult = null;
        ControleurTemps result = instance.getTempsBonus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTempsBonus method, of class PartieController.
     */
    @Test
    public void testSetTempsBonus() {
        System.out.println("setTempsBonus");
        ControleurTemps tempsBonus = null;
        PartieController instance = null;
        instance.setTempsBonus(tempsBonus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFantomeMove method, of class PartieController.
     */
    @Test
    public void testIsFantomeMove() {
        System.out.println("isFantomeMove");
        PartieController instance = null;
        boolean expResult = false;
        boolean result = instance.isFantomeMove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFantomeMove method, of class PartieController.
     */
    @Test
    public void testSetFantomeMove() {
        System.out.println("setFantomeMove");
        boolean fantomeMove = false;
        PartieController instance = null;
        instance.setFantomeMove(fantomeMove);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
