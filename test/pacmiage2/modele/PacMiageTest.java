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
public class PacMiageTest {
    
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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of init method, of class PacMiage.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        int posX = 0;
        int pasY = 0;
        PacMiage instance = null;
        instance.init(posX, pasY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initAnimation method, of class PacMiage.
     */
    @Test
    public void testInitAnimation() throws Exception {
        System.out.println("initAnimation");
        PacMiage instance = null;
        instance.initAnimation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of render method, of class PacMiage.
     */
    @Test
    public void testRender() throws Exception {
        System.out.println("render");
        Graphics g = null;
        PacMiage instance = null;
        instance.render(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVitesse method, of class PacMiage.
     */
    @Test
    public void testSetVitesse() {
        System.out.println("setVitesse");
        int vitesse = 0;
        PacMiage instance = null;
        instance.setVitesse(vitesse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PacMiage.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int delta = 0;
        PacMiage instance = null;
        instance.update(delta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estEnCollisionMur method, of class PacMiage.
     */
    @Test
    public void testEstEnCollisionMur() {
        System.out.println("estEnCollisionMur");
        float xObjet = 0.0F;
        float yObjet = 0.0F;
        PacMiage instance = null;
        boolean expResult = false;
        boolean result = instance.estEnCollisionMur(xObjet, yObjet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estEnCollisionObjet method, of class PacMiage.
     */
    @Test
    public void testEstEnCollisionObjet() {
        System.out.println("estEnCollisionObjet");
        float xObjet = 0.0F;
        float yObjet = 0.0F;
        PacMiage instance = null;
        boolean expResult = false;
        boolean result = instance.estEnCollisionObjet(xObjet, yObjet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class PacMiage.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        PacMiage instance = null;
        float expResult = 0.0F;
        float result = instance.getX();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class PacMiage.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        PacMiage instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCenterX method, of class PacMiage.
     */
    @Test
    public void testGetCenterX() {
        System.out.println("getCenterX");
        PacMiage instance = null;
        float expResult = 0.0F;
        float result = instance.getCenterX();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCenterY method, of class PacMiage.
     */
    @Test
    public void testGetCenterY() {
        System.out.println("getCenterY");
        PacMiage instance = null;
        float expResult = 0.0F;
        float result = instance.getCenterY();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class PacMiage.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        PacMiage instance = null;
        float expResult = 0.0F;
        float result = instance.getY();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class PacMiage.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        PacMiage instance = null;
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirection method, of class PacMiage.
     */
    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        PacMiage instance = null;
        int expResult = 0;
        int result = instance.getDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirection method, of class PacMiage.
     */
    @Test
    public void testSetDirection() {
        System.out.println("setDirection");
        int direction = 0;
        PacMiage instance = null;
        instance.setDirection(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMoving method, of class PacMiage.
     */
    @Test
    public void testIsMoving() {
        System.out.println("isMoving");
        PacMiage instance = null;
        boolean expResult = false;
        boolean result = instance.isMoving();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoving method, of class PacMiage.
     */
    @Test
    public void testSetMoving() {
        System.out.println("setMoving");
        boolean moving = false;
        PacMiage instance = null;
        instance.setMoving(moving);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOnStair method, of class PacMiage.
     */
    @Test
    public void testIsOnStair() {
        System.out.println("isOnStair");
        PacMiage instance = null;
        boolean expResult = false;
        boolean result = instance.isOnStair();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOnStair method, of class PacMiage.
     */
    @Test
    public void testSetOnStair() {
        System.out.println("setOnStair");
        boolean onStair = false;
        PacMiage instance = null;
        instance.setOnStair(onStair);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFuturDirection method, of class PacMiage.
     */
    @Test
    public void testGetFuturDirection() {
        System.out.println("getFuturDirection");
        PacMiage instance = null;
        int expResult = 0;
        int result = instance.getFuturDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFuturDirection method, of class PacMiage.
     */
    @Test
    public void testSetFuturDirection() {
        System.out.println("setFuturDirection");
        int futurDirection = 0;
        PacMiage instance = null;
        instance.setFuturDirection(futurDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagePac method, of class PacMiage.
     */
    @Test
    public void testSetImagePac() {
        System.out.println("setImagePac");
        String imagePac = "";
        PacMiage instance = null;
        instance.setImagePac(imagePac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
