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
public class ConfigurationTest {
    
    public ConfigurationTest() {
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
     * Test of recupererValeur method, of class Configuration.
     */
    @Test
    public void testRecupererValeur() {
        System.out.println("recupererValeur");
        String cle = "";
        Configuration instance = null;
        String expResult = "";
        String result = instance.recupererValeur(cle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class Configuration.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Configuration expResult = null;
        Configuration result = Configuration.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
