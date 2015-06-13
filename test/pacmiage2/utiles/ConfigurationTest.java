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
    
    Configuration instance;
    
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
        instance = Configuration.getInstance();
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
        String expResult = null;
        String result = instance.recupererValeur(cle);
        assertEquals(expResult, result);
    }

    /**
     * Test of getInstance method, of class Configuration.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Configuration expResult = instance;
        Configuration result = Configuration.getInstance();
        assertEquals(expResult, result);
    }
    
}
