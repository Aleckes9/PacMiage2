package pacmiage2.modele;

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
public class ObjetTest {
    
    public ObjetTest() {
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
     * Test of getMiniImage method, of class Objet.
     */
    @Test
    public void testGetMiniImage() {
        System.out.println("getMiniImage");
        Objet instance = null;
        String expResult = "";
        String result = instance.getMiniImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Objet.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Objet instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class Objet.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Objet instance = null;
        String expResult = "";
        String result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Objet.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Objet instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrix method, of class Objet.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Objet instance = null;
        int expResult = 0;
        int result = instance.getPrix();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBonus method, of class Objet.
     */
    @Test
    public void testGetBonus() {
        System.out.println("getBonus");
        Objet instance = null;
        Bonus expResult = null;
        Bonus result = instance.getBonus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBonus method, of class Objet.
     */
    @Test
    public void testSetBonus() {
        System.out.println("setBonus");
        Bonus bonus = null;
        Objet instance = null;
        instance.setBonus(bonus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
