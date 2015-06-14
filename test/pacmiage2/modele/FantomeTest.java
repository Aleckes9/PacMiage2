package pacmiage2.modele;

import pacmiage.modele.Fantome;
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
import pacmiage.utiles.Configuration;
import pacmiage.vue.partie.PartieAffichageMap;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class FantomeTest {
    
    PartieAffichageMap map;
    Fantome instance;
    
    /**
     *
     */
    public FantomeTest() {
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
        map = new PartieAffichageMap();
        try {
            instance = new Fantome(map, Configuration.getInstance().recupererValeur("carteFantome" + String.valueOf(1)));
            map.init(Configuration.getInstance().recupererValeur("carte1"));
        } catch (SlickException ex) {
            Logger.getLogger(FantomeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
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
