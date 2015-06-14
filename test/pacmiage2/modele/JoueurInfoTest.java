package pacmiage2.modele;

import pacmiage.modele.Objet;
import pacmiage.modele.JoueurInfo;
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
public class JoueurInfoTest {
    
    Objet[] objetDispo;
    JoueurInfo instance;
    
    public JoueurInfoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = JoueurInfo.getInstance();       
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of ajouterGraines method, of class JoueurInfo.
     */
    @Test
    public void testAjouterGraines() {
        System.out.println("ajouterGraines");
        int n = 0;
        instance.ajouterGraines(n);
    }

    /**
     * Test of retirerGraines method, of class JoueurInfo.
     */
    @Test
    public void testRetirerGraines() {
        System.out.println("retirerGraines");
        int n = 0;
        instance.retirerGraines(n);
    }

    /**
     * Test of getGraines method, of class JoueurInfo.
     */
    @Test
    public void testGetGraines() {
        System.out.println("getGraines");
        int expResult = 0;
        int result = instance.getGraines();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRecord method, of class JoueurInfo.
     */
    @Test
    public void testGetRecord() {
        System.out.println("getRecord");
        int expResult = 0;
        int result = instance.getRecord();
        assertEquals(expResult, result);
    }


    /**
     * Test of setRecord method, of class JoueurInfo.
     */
    @Test
    public void testSetRecord() {
        System.out.println("setRecord");
        int record = 0;
        instance.setRecord(record);
    }

    /**
     * Test of ajouterObjet method, of class JoueurInfo.
     */
    @Test
    public void testAjouterObjet() {
        System.out.println("ajouterObjet");
        Objet o = null;
        boolean expResult = true;
        boolean result = instance.ajouterObjet(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of retirerObjet method, of class JoueurInfo.
     */
    @Test
    public void testRetirerObjet() {
        System.out.println("retirerObjet");
        Objet o = null;
        instance.retirerObjet(o);
    }

   

    
}
