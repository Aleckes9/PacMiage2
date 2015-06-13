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
        SauvegardeFichier instance = new SauvegardeFichier();
        instance.enregistrerFichier(monObjetSerializable, cheminFichier);
    }
    
}
