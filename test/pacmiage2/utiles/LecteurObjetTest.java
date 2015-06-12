package pacmiage2.utiles;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage2.modele.Objet;

/**
 *
 * @author Aleckes9
 */
public class LecteurObjetTest {
    
    public LecteurObjetTest() {
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
     * Test of getObjet method, of class LecteurObjet.
     */
    @Test
    public void testGetObjet() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println("getObjet");
        LecteurObjet instance = new LecteurObjet();
        Objet[] expResult = null;
        Objet[] result = instance.getObjet();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
