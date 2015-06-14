package pacmiage2.utiles;

import pacmiage.utiles.Session;
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
    
    Session instance;
            
    /**
     *
     */
    public SessionTest() {
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
        instance = Session.getInstance();
    }
    
    /**
     *
     */
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
        String expResult = null;
        String result = instance.recupererValeur(cle);
        assertEquals(expResult, result);
    }


    /**
     * Test of setLocale method, of class Session.
     */
    @Test
    public void testSetLocale() {
        System.out.println("setLocale");
        Locale locale = Locale.FRENCH;
        instance.setLocale(locale);
    }

    
}
