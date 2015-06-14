package pacmiage2.modele;

import pacmiage.modele.PacMiage;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.SlickException;
import pacmiage.utiles.Configuration;
import pacmiage.vue.partie.PartieAffichageMap;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class PacMiageTest {
    
    PartieAffichageMap map;
    PacMiage instance;
            
    /**
     *
     */
    public PacMiageTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        try {
            instance = new PacMiage(map, Configuration.getInstance().recupererValeur("pacNormal"));
        } catch (SlickException ex) {
            Logger.getLogger(PacMiageTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }



    /**
     * Test of setVitesse method, of class PacMiage.
     */
    @Test
    public void testSetVitesse() {
        System.out.println("setVitesse");
        int vitesse = 0;
        instance.setVitesse(vitesse);
    }

    /**
     * Test of update method, of class PacMiage.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int delta = 0;
        instance.updatePac();
    }



    /**
     * Test of estEnCollisionObjet method, of class PacMiage.
     */
    @Test
    public void testEstEnCollisionObjet() {
        System.out.println("estEnCollisionObjet");
        float xObjet = 1.0F;
        float yObjet = 1.0F;
        instance.setX(0);
        instance.setY(0);
        boolean expResult = true;
        boolean result = instance.estEnCollisionObjet(xObjet, yObjet);
        assertEquals(expResult, result);
    }

    /**
     * Test of setDirection method, of class PacMiage.
     */
    @Test
    public void testSetDirection() {
        System.out.println("setDirection");
        int direction = 0;
        instance.setDirection(direction);
    }

    /**
     * Test of isMoving method, of class PacMiage.
     */
    @Test
    public void testIsMoving() {
        System.out.println("isMoving");
        boolean expResult = false;
        boolean result = instance.isMoving();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMoving method, of class PacMiage.
     */
    @Test
    public void testSetMoving() {
        System.out.println("setMoving");
        boolean moving = false;
        instance.setMoving(moving);
    }

    /**
     * Test of getFuturDirection method, of class PacMiage.
     */
    @Test
    public void testGetFuturDirection() {
        System.out.println("getFuturDirection");
        int expResult = 0;
        int result = instance.getFuturDirection();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFuturDirection method, of class PacMiage.
     */
    @Test
    public void testSetFuturDirection() {
        System.out.println("setFuturDirection");
        int futurDirection = 0;
        instance.setFuturDirection(futurDirection);
    }


    
}
