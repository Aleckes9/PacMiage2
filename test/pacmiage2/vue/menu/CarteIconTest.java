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
    
    int width;
    int height;
    int imageType;
    String chemin;
    BufferedImage image;
            
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
     * Test of setImage method, of class CarteIcon.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        BufferedImage image = new BufferedImage(width, height, imageType);
        CarteIcon instance = new CarteIcon(chemin);
        instance.setImage(image);
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
        CarteIcon instance = new CarteIcon(chemin);
        instance.paintIcon(c, g, x, y);
    }

    /**
     * Test of getIconWidth method, of class CarteIcon.
     */
    @Test
    public void testGetIconWidth() {
        System.out.println("getIconWidth");
        CarteIcon instance = new CarteIcon(chemin);
        int expResult = 0;
        int result = instance.getIconWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIconHeight method, of class CarteIcon.
     */
    @Test
    public void testGetIconHeight() {
        System.out.println("getIconHeight");
        CarteIcon instance = new CarteIcon(chemin);
        int expResult = 0;
        int result = instance.getIconHeight();
        assertEquals(expResult, result);
    }
    
}
