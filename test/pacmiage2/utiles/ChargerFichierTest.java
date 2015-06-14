package pacmiage2.utiles;

import pacmiage.utiles.ChargerFichier;
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
public class ChargerFichierTest {
    
    /**
     *
     */
    public ChargerFichierTest() {
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
     * Test of lectureFichier method, of class ChargerFichier.
     */
    @Test
    public void testLectureFichier() throws Exception {
        System.out.println("lectureFichier");
        String cheminFichier = "";
        ChargerFichier instance = ChargerFichier.getInstance();
        Object expResult = null;
        Object result = instance.lectureFichier(cheminFichier);
        assertEquals(expResult, result);
    }
    
}
