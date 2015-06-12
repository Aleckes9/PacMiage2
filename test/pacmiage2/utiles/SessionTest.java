package pacmiage2.utiles;

import java.util.Locale;
import java.util.Properties;
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
public class SessionTest {
    
    public SessionTest() {
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
     * Test of recupererValeur method, of class Session.
     */
    @Test
    public void testRecupererValeur() {
        System.out.println("recupererValeur");
        String cle = "";
        Session instance = null;
        String expResult = "";
        String result = instance.recupererValeur(cle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class Session.
     */
    @Test
    public void testLoad() throws Exception {
        System.out.println("load");
        String filename = "";
        Properties expResult = null;
        Properties result = Session.load(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocale method, of class Session.
     */
    @Test
    public void testGetLocale() {
        System.out.println("getLocale");
        Session instance = null;
        Locale expResult = null;
        Locale result = instance.getLocale();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocale method, of class Session.
     */
    @Test
    public void testSetLocale() {
        System.out.println("setLocale");
        Locale locale = null;
        Session instance = null;
        instance.setLocale(locale);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class Session.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Session expResult = null;
        Session result = Session.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
