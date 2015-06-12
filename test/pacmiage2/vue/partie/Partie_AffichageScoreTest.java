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
public class Partie_AffichageScoreTest {
    
    public Partie_AffichageScoreTest() {
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
     * Test of render method, of class Partie_AffichageScore.
     */
    @Test
    public void testRender() throws Exception {
        System.out.println("render");
        Graphics g = null;
        Partie_AffichageScore instance = new Partie_AffichageScore();
        instance.render(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initPos method, of class Partie_AffichageScore.
     */
    @Test
    public void testInitPos() {
        System.out.println("initPos");
        int xPos = 0;
        int Ypos = 0;
        Partie_AffichageScore instance = new Partie_AffichageScore();
        instance.initPos(xPos, Ypos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Partie_AffichageScore.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int delta = 0;
        Partie_AffichageScore instance = new Partie_AffichageScore();
        instance.update(delta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class Partie_AffichageScore.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        Partie_AffichageScore instance = new Partie_AffichageScore();
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScore method, of class Partie_AffichageScore.
     */
    @Test
    public void testSetScore() {
        System.out.println("setScore");
        int score = 0;
        Partie_AffichageScore instance = new Partie_AffichageScore();
        instance.setScore(score);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFutureScore method, of class Partie_AffichageScore.
     */
    @Test
    public void testGetFutureScore() {
        System.out.println("getFutureScore");
        Partie_AffichageScore instance = new Partie_AffichageScore();
        int expResult = 0;
        int result = instance.getFutureScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFutureScore method, of class Partie_AffichageScore.
     */
    @Test
    public void testSetFutureScore() {
        System.out.println("setFutureScore");
        int futureScore = 0;
        Partie_AffichageScore instance = new Partie_AffichageScore();
        instance.setFutureScore(futureScore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
