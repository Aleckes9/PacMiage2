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
public class SauvegardeFichierTest {
    
    public SauvegardeFichierTest() {
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
     * Test of enregistrerFichier method, of class SauvegardeFichier.
     */
    @Test
    public void testEnregistrerFichier() throws Exception {
        System.out.println("enregistrerFichier");
        Object monObjetSerializable = null;
        String cheminFichier = "";
        SauvegardeFichier instance = null;
        instance.enregistrerFichier(monObjetSerializable, cheminFichier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class SauvegardeFichier.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        SauvegardeFichier expResult = null;
        SauvegardeFichier result = SauvegardeFichier.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
