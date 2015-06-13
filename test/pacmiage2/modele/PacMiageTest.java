package pacmiage2.modele;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import pacmiage2.vue.partie.Partie_AffichageMap;

/**
 *
 * @author Aleckes9
 */
public class PacMiageTest {
    
    Partie_AffichageMap map;
    PacMiage instance;
            
    public PacMiageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        try {
            instance = new PacMiage(map);
        } catch (SlickException ex) {
            Logger.getLogger(PacMiageTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of init method, of class PacMiage.
     */
    @Test
    public void testInit() throws SlickException {
        System.out.println("init");
        int posX = 0;
        int pasY = 0;
        instance.init(posX, pasY);
    }

    /**
     * Test of initAnimation method, of class PacMiage.
     */
    @Test
    public void testInitAnimation() throws SlickException {
        System.out.println("initAnimation");
        instance.initAnimation();
    }

    /**
     * Test of render method, of class PacMiage.
     */
    @Test
    public void testRender() throws SlickException {
        System.out.println("render");
        Graphics g = null;
        instance.render(g);
    }

    /**
     * Test of setVitesse method, of class PacMiage.
     */
    @Test
    public void testSetVitesse() {
        System.out.println("setVitesse");
        int vitesse = 0;
        instance.setVitesse(vitesse);
    }

    /**
     * Test of update method, of class PacMiage.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int delta = 0;
        instance.update(delta);
    }

    /**
     * Test of estEnCollisionMur method, of class PacMiage.
     */
    @Test
    public void testEstEnCollisionMur() {
        System.out.println("estEnCollisionMur");
        float xObjet = 0.0F;
        float yObjet = 0.0F;
        instance.setX(2);
        instance.setY(2);
        boolean expResult = true;
        boolean result = instance.estEnCollisionMur(xObjet, yObjet);
        assertEquals(expResult, result);
    }

    /**
     * Test of estEnCollisionObjet method, of class PacMiage.
     */
    @Test
    public void testEstEnCollisionObjet() {
        System.out.println("estEnCollisionObjet");
        float xObjet = 1.0F;
        float yObjet = 1.0F;
        instance.setX(0);
        instance.setY(0);
        boolean expResult = true;
        boolean result = instance.estEnCollisionObjet(xObjet, yObjet);
        assertEquals(expResult, result);
    }

    /**
     * Test of setDirection method, of class PacMiage.
     */
    @Test
    public void testSetDirection() {
        System.out.println("setDirection");
        int direction = 0;
        instance.setDirection(direction);
    }

    /**
     * Test of isMoving method, of class PacMiage.
     */
    @Test
    public void testIsMoving() {
        System.out.println("isMoving");
        boolean expResult = false;
        boolean result = instance.isMoving();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMoving method, of class PacMiage.
     */
    @Test
    public void testSetMoving() {
        System.out.println("setMoving");
        boolean moving = false;
        instance.setMoving(moving);
    }

    /**
     * Test of isOnStair method, of class PacMiage.
     */
    @Test
    public void testIsOnStair() {
        System.out.println("isOnStair");
        boolean expResult = false;
        boolean result = instance.isOnStair();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOnStair method, of class PacMiage.
     */
    @Test
    public void testSetOnStair() {
        System.out.println("setOnStair");
        boolean onStair = false;
        instance.setOnStair(onStair);
    }

    /**
     * Test of getFuturDirection method, of class PacMiage.
     */
    @Test
    public void testGetFuturDirection() {
        System.out.println("getFuturDirection");
        int expResult = 0;
        int result = instance.getFuturDirection();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFuturDirection method, of class PacMiage.
     */
    @Test
    public void testSetFuturDirection() {
        System.out.println("setFuturDirection");
        int futurDirection = 0;
        instance.setFuturDirection(futurDirection);
    }

    /**
     * Test of setImagePac method, of class PacMiage.
     */
    @Test
    public void testSetImagePac() {
        System.out.println("setImagePac");
        String imagePac = "";
        instance.setImagePac(imagePac);
    }
    
}
