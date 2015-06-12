package pacmiage2.utiles;

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
public class ChargerFichierTest {
    
    public ChargerFichierTest() {
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
     * Test of lectureFichier method, of class ChargerFichier.
     */
    @Test
    public void testLectureFichier() throws Exception {
        System.out.println("lectureFichier");
        String cheminFichier = "";
        ChargerFichier instance = null;
        Object expResult = null;
        Object result = instance.lectureFichier(cheminFichier);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class ChargerFichier.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ChargerFichier expResult = null;
        ChargerFichier result = ChargerFichier.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
