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
public class GraineTest {
    
    public GraineTest() {
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
     * Test of init method, of class Graine.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        Graine instance = null;
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of render method, of class Graine.
     */
    @Test
    public void testRender() {
        System.out.println("render");
        Graphics g = null;
        Graine instance = null;
        instance.render(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Graine.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int delta = 0;
        Graine instance = null;
        instance.update(delta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Graine.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Graine instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Graine.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Graine instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Graine.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Graine instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Graine.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Graine instance = null;
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYMillieu method, of class Graine.
     */
    @Test
    public void testGetYMillieu() {
        System.out.println("getYMillieu");
        Graine instance = null;
        int expResult = 0;
        int result = instance.getYMillieu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getXMillieu method, of class Graine.
     */
    @Test
    public void testGetXMillieu() {
        System.out.println("getXMillieu");
        Graine instance = null;
        int expResult = 0;
        int result = instance.getXMillieu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
