package pacmiage2.vue.partie;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Aleckes9
 */
public class Partie_AffichageImageFonduTest {
    
    Image img;
    
    public Partie_AffichageImageFonduTest() {
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
     * Test of render method, of class Partie_AffichageImageFondu.
     */
    @Test
    public void testRender() throws Exception {
        System.out.println("render");
        Graphics g = null;
        GameContainer container = null;
        Partie_AffichageImageFondu instance = new Partie_AffichageImageFondu(img);
        instance.render(g, container);
    }

    /**
     * Test of isInvisible method, of class Partie_AffichageImageFondu.
     */
    @Test
    public void testIsInvisible() throws SlickException {
        System.out.println("isInvisible");
        Partie_AffichageImageFondu instance = new Partie_AffichageImageFondu(img);
        boolean expResult = false;
        boolean result = instance.isInvisible();
        assertEquals(expResult, result);
    }
    
}
