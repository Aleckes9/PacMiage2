package pacmiage2.modele;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import pacmiage2.utiles.Configuration;
import pacmiage2.vue.partie.Partie_AffichageMap;

/**
 *
 * @author Aleckes9
 */
public class FantomeTest {
    
    Partie_AffichageMap map;
    Fantome instance;
    
    public FantomeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        map = new Partie_AffichageMap();
        instance = new Fantome(map);
        try {
            map.init(Configuration.getInstance().recupererValeur("carte1"));
        } catch (SlickException ex) {
            Logger.getLogger(FantomeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of init method, of class Fantome.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        int niveau = 1;
        instance.init(niveau);
    }

    /**
     * Test of initEtat method, of class Fantome.
     */
    @Test
    public void testInitEtat() {
        System.out.println("initEtat");
        int posX = 0;
        int pasY = 0;
        instance.initEtat(posX, pasY);
    }

    /**
     * Test of initDepart method, of class Fantome.
     */
    @Test
    public void testInitDepart() {
        System.out.println("initDepart");
        int posX = 0;
        int pasY = 0;
        instance.initDepart(posX, pasY);
    }

    /**
     * Test of render method, of class Fantome.
     */
    @Test
    public void testRender() throws Exception {
        System.out.println("render");
        Graphics g = null;
        instance.render(g);
    }

    /**
     * Test of update method, of class Fantome.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        float newXPac = 0.0F;
        float newYPac = 0.0F;
        instance.update(newXPac, newYPac);
    }

    /**
     * Test of estEnCollisionMur method, of class Fantome.
     */
    @Test
    public void testEstEnCollisionMur() {
        System.out.println("estEnCollisionMur");
        float xObjet = 0.0F;
        float yObjet = 0.0F;
        instance.setX(2);
        instance.setY(2);
        boolean expResult = true;
        boolean result = instance.estEnCollisionMur(xObjet, yObjet);
        assertEquals(expResult, result);
    }

    /**
     * Test of estEnCollisionCible method, of class Fantome.
     */
    @Test
    public void testEstEnCollisionCible() {
        System.out.println("estEnCollisionCible");
        float xObjet = 3.0F;
        float yObjet = 3.0F;
        instance.setX(2);
        instance.setY(2);
        boolean expResult = true;
        boolean result = instance.estEnCollisionCible(xObjet, yObjet);
        assertEquals(expResult, result);    
    }

}
