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
        Session instance = new Session();
        String expResult = null;
        String result = instance.recupererValeur(cle);
        assertEquals(expResult, result);
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
    }

    /**
     * Test of setLocale method, of class Session.
     */
    @Test
    public void testSetLocale() {
        System.out.println("setLocale");
        Locale locale = Locale.FRENCH;
        Session instance = new Session();
        instance.setLocale(locale);
    }

    
}
