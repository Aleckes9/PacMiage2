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
public class ReponseTest {
    
    public ReponseTest() {
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
     * Test of getText method, of class Reponse.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Reponse instance = new Reponse();
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
