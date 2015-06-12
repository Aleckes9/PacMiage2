package pacmiage2.modele;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.Graphics;

/**
 *
 * @author Aleckes9
 */
public class FantomeTest {
    
    public FantomeTest() {
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
     * Test of resetPos method, of class Fantome.
     */
    @Test
    public void testResetPos() {
        System.out.println("resetPos");
        Fantome instance = null;
        instance.resetPos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class Fantome.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        int niveau = 0;
        Fantome instance = null;
        instance.init(niveau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initEtat method, of class Fantome.
     */
    @Test
    public void testInitEtat() {
        System.out.println("initEtat");
        int posX = 0;
        int pasY = 0;
        Fantome instance = null;
        instance.initEtat(posX, pasY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initDepart method, of class Fantome.
     */
    @Test
    public void testInitDepart() {
        System.out.println("initDepart");
        int posX = 0;
        int pasY = 0;
        Fantome instance = null;
        instance.initDepart(posX, pasY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of render method, of class Fantome.
     */
    @Test
    public void testRender() throws Exception {
        System.out.println("render");
        Graphics g = null;
        Fantome instance = null;
        instance.render(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Fantome.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        float newXPac = 0.0F;
        float newYPac = 0.0F;
        Fantome instance = null;
        instance.update(newXPac, newYPac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estEnCollisionMur method, of class Fantome.
     */
    @Test
    public void testEstEnCollisionMur() {
        System.out.println("estEnCollisionMur");
        float xObjet = 0.0F;
        float yObjet = 0.0F;
        Fantome instance = null;
        boolean expResult = false;
        boolean result = instance.estEnCollisionMur(xObjet, yObjet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estEnCollisionCible method, of class Fantome.
     */
    @Test
    public void testEstEnCollisionCible() {
        System.out.println("estEnCollisionCible");
        float xObjet = 0.0F;
        float yObjet = 0.0F;
        Fantome instance = null;
        boolean expResult = false;
        boolean result = instance.estEnCollisionCible(xObjet, yObjet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Fantome.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Fantome instance = null;
        float expResult = 0.0F;
        float result = instance.getX();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Fantome.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Fantome instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Fantome.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Fantome instance = null;
        float expResult = 0.0F;
        float result = instance.getY();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Fantome.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Fantome instance = null;
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirection method, of class Fantome.
     */
    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        Fantome instance = null;
        int expResult = 0;
        int result = instance.getDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirection method, of class Fantome.
     */
    @Test
    public void testSetDirection() {
        System.out.println("setDirection");
        int direction = 0;
        Fantome instance = null;
        instance.setDirection(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMoving method, of class Fantome.
     */
    @Test
    public void testIsMoving() {
        System.out.println("isMoving");
        Fantome instance = null;
        boolean expResult = false;
        boolean result = instance.isMoving();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoving method, of class Fantome.
     */
    @Test
    public void testSetMoving() {
        System.out.println("setMoving");
        boolean moving = false;
        Fantome instance = null;
        instance.setMoving(moving);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOnStair method, of class Fantome.
     */
    @Test
    public void testIsOnStair() {
        System.out.println("isOnStair");
        Fantome instance = null;
        boolean expResult = false;
        boolean result = instance.isOnStair();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOnStair method, of class Fantome.
     */
    @Test
    public void testSetOnStair() {
        System.out.println("setOnStair");
        boolean onStair = false;
        Fantome instance = null;
        instance.setOnStair(onStair);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFuturDirection method, of class Fantome.
     */
    @Test
    public void testGetFuturDirection() {
        System.out.println("getFuturDirection");
        Fantome instance = null;
        int expResult = 0;
        int result = instance.getFuturDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFuturDirection method, of class Fantome.
     */
    @Test
    public void testSetFuturDirection() {
        System.out.println("setFuturDirection");
        int futurDirection = 0;
        Fantome instance = null;
        instance.setFuturDirection(futurDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVitesse method, of class Fantome.
     */
    @Test
    public void testGetVitesse() {
        System.out.println("getVitesse");
        Fantome instance = null;
        int expResult = 0;
        int result = instance.getVitesse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVitesse method, of class Fantome.
     */
    @Test
    public void testSetVitesse() {
        System.out.println("setVitesse");
        int vitesse = 0;
        Fantome instance = null;
        instance.setVitesse(vitesse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of depart method, of class Fantome.
     */
    @Test
    public void testDepart() {
        System.out.println("depart");
        Fantome instance = null;
        instance.depart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
