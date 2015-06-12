package pacmiage2.vue.menu;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aleckes9
 */
public class CarteIconTest {
    
    public CarteIconTest() {
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
     * Test of getImage method, of class CarteIcon.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        CarteIcon instance = null;
        BufferedImage expResult = null;
        BufferedImage result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImage method, of class CarteIcon.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        BufferedImage image = null;
        CarteIcon instance = null;
        instance.setImage(image);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintIcon method, of class CarteIcon.
     */
    @Test
    public void testPaintIcon() {
        System.out.println("paintIcon");
        Component c = null;
        Graphics g = null;
        int x = 0;
        int y = 0;
        CarteIcon instance = null;
        instance.paintIcon(c, g, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIconWidth method, of class CarteIcon.
     */
    @Test
    public void testGetIconWidth() {
        System.out.println("getIconWidth");
        CarteIcon instance = null;
        int expResult = 0;
        int result = instance.getIconWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIconHeight method, of class CarteIcon.
     */
    @Test
    public void testGetIconHeight() {
        System.out.println("getIconHeight");
        CarteIcon instance = null;
        int expResult = 0;
        int result = instance.getIconHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
