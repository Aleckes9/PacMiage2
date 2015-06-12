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
public class JoueurInfoTest {
    
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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNbObjet method, of class JoueurInfo.
     */
    @Test
    public void testGetNbObjet() {
        System.out.println("getNbObjet");
        JoueurInfo instance = null;
        int expResult = 0;
        int result = instance.getNbObjet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterGraines method, of class JoueurInfo.
     */
    @Test
    public void testAjouterGraines() {
        System.out.println("ajouterGraines");
        int n = 0;
        JoueurInfo instance = null;
        instance.ajouterGraines(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirerGraines method, of class JoueurInfo.
     */
    @Test
    public void testRetirerGraines() {
        System.out.println("retirerGraines");
        int n = 0;
        JoueurInfo instance = null;
        instance.retirerGraines(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGraines method, of class JoueurInfo.
     */
    @Test
    public void testGetGraines() {
        System.out.println("getGraines");
        JoueurInfo instance = null;
        int expResult = 0;
        int result = instance.getGraines();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecord method, of class JoueurInfo.
     */
    @Test
    public void testGetRecord() {
        System.out.println("getRecord");
        JoueurInfo instance = null;
        int expResult = 0;
        int result = instance.getRecord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjetDispo method, of class JoueurInfo.
     */
    @Test
    public void testGetObjetDispo() {
        System.out.println("getObjetDispo");
        JoueurInfo instance = null;
        Objet[] expResult = null;
        Objet[] result = instance.getObjetDispo();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecord method, of class JoueurInfo.
     */
    @Test
    public void testSetRecord() {
        System.out.println("setRecord");
        int record = 0;
        JoueurInfo instance = null;
        instance.setRecord(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterObjet method, of class JoueurInfo.
     */
    @Test
    public void testAjouterObjet() {
        System.out.println("ajouterObjet");
        Objet o = null;
        JoueurInfo instance = null;
        boolean expResult = false;
        boolean result = instance.ajouterObjet(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirerObjet method, of class JoueurInfo.
     */
    @Test
    public void testRetirerObjet() {
        System.out.println("retirerObjet");
        Objet o = null;
        JoueurInfo instance = null;
        instance.retirerObjet(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class JoueurInfo.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        JoueurInfo expResult = null;
        JoueurInfo result = JoueurInfo.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInstance method, of class JoueurInfo.
     */
    @Test
    public void testSetInstance() {
        System.out.println("setInstance");
        JoueurInfo joueur = null;
        JoueurInfo.setInstance(joueur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
