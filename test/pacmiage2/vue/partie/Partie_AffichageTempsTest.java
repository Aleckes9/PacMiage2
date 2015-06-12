package pacmiage2.vue.partie;

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
public class Partie_AffichageTempsTest {
    
    public Partie_AffichageTempsTest() {
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
     * Test of render method, of class Partie_AffichageTemps.
     */
    @Test
    public void testRender() throws Exception {
        System.out.println("render");
        Graphics g = null;
        Partie_AffichageTemps instance = new Partie_AffichageTemps();
        instance.render(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initPos method, of class Partie_AffichageTemps.
     */
    @Test
    public void testInitPos() {
        System.out.println("initPos");
        int xPos = 0;
        int Ypos = 0;
        Partie_AffichageTemps instance = new Partie_AffichageTemps();
        instance.initPos(xPos, Ypos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Partie_AffichageTemps.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int delta = 0;
        Partie_AffichageTemps instance = new Partie_AffichageTemps();
        instance.update(delta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTemps method, of class Partie_AffichageTemps.
     */
    @Test
    public void testGetTemps() {
        System.out.println("getTemps");
        Partie_AffichageTemps instance = new Partie_AffichageTemps();
        int expResult = 0;
        int result = instance.getTemps();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTemps method, of class Partie_AffichageTemps.
     */
    @Test
    public void testSetTemps() {
        System.out.println("setTemps");
        int temps = 0;
        Partie_AffichageTemps instance = new Partie_AffichageTemps();
        instance.setTemps(temps);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
