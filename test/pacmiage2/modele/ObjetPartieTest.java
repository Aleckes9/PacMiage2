package pacmiage2.modele;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Aleckes9
 */
public class ObjetPartieTest {
    int x;
    int y;
    public ObjetPartieTest() {
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
        ObjetPartie instance = new ObjetPartie(x,y,"");
        instance.initObjetPartie();
    }

    /**
     * Test of render method, of class Graine.
     */
    @Test
    public void testRender() throws SlickException {
        System.out.println("render");
        Graphics g = null;
        ObjetPartie instance = new ObjetPartie(x,y,"");
        instance.renderObjetPartie(g);
    }

    /**
     * Test of update method, of class Graine.
     */
    @Test
    public void testUpdate() throws SlickException{
        System.out.println("update");
        int delta = 0;
        ObjetPartie instance = new ObjetPartie(x,y,"");
        instance.updateObjetPartie(delta);
    }
}
