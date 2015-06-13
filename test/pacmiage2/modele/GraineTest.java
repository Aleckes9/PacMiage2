package pacmiage2.modele;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Aleckes9
 */
public class GraineTest {
    int x;
    int y;
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
        Graine instance = new Graine(x,y);
        instance.init();
    }

    /**
     * Test of render method, of class Graine.
     */
    @Test
    public void testRender() throws SlickException {
        System.out.println("render");
        Graphics g = null;
        Graine instance = new Graine(x,y);
        instance.render(g);
    }

    /**
     * Test of update method, of class Graine.
     */
    @Test
    public void testUpdate() throws SlickException{
        System.out.println("update");
        int delta = 0;
        Graine instance = new Graine(x,y);
        instance.update(delta);
    }
}
