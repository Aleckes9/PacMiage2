package pacmiage2.modele;

import pacmiage.modele.Reponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class ReponseTest {
    
    /**
     *
     */
    public ReponseTest() {
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
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of setText method, of class Reponse.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String text = "";
        Reponse instance = new Reponse();
        instance.setText(text);
    }

    /**
     * Test of isVeracite method, of class Reponse.
     */
    @Test
    public void testIsVeracite() {
        System.out.println("isVeracite");
        Reponse instance = new Reponse();
        boolean expResult = false;
        boolean result = instance.isVeracite();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVeracite method, of class Reponse.
     */
    @Test
    public void testSetVeracite() {
        System.out.println("setVeracite");
        boolean veracite = false;
        Reponse instance = new Reponse();
        instance.setVeracite(veracite);
    }
    
}
