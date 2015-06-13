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
    
    Objet[] objetDispo;
    
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
        JoueurInfo instance = JoueurInfo.getInstance();
        int expResult = 0;
        int result = instance.getNbObjet();
        assertEquals(expResult, result);
    }

    /**
     * Test of ajouterGraines method, of class JoueurInfo.
     */
    @Test
    public void testAjouterGraines() {
        System.out.println("ajouterGraines");
        int n = 0;
        JoueurInfo instance = new JoueurInfo();
        instance.ajouterGraines(n);
    }

    /**
     * Test of retirerGraines method, of class JoueurInfo.
     */
    @Test
    public void testRetirerGraines() {
        System.out.println("retirerGraines");
        int n = 0;
        JoueurInfo instance = new JoueurInfo();
        instance.retirerGraines(n);
    }

    /**
     * Test of getGraines method, of class JoueurInfo.
     */
    @Test
    public void testGetGraines() {
        System.out.println("getGraines");
        JoueurInfo instance = new JoueurInfo();
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
        JoueurInfo instance = new JoueurInfo();
        int expResult = 0;
        int result = instance.getRecord();
        assertEquals(expResult, result);
    }

    /**
     * Test of getObjetDispo method, of class JoueurInfo.
     */
    @Test
    public void testGetObjetDispo() {
        System.out.println("getObjetDispo");
        JoueurInfo instance = new JoueurInfo();
        Objet[] expResult = null;
        Objet[] result = instance.getObjetDispo();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setRecord method, of class JoueurInfo.
     */
    @Test
    public void testSetRecord() {
        System.out.println("setRecord");
        int record = 0;
        JoueurInfo instance = new JoueurInfo();
        instance.setRecord(record);
    }

    /**
     * Test of ajouterObjet method, of class JoueurInfo.
     */
    @Test
    public void testAjouterObjet() {
        System.out.println("ajouterObjet");
        Objet o = null;
        JoueurInfo instance = new JoueurInfo();
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
        JoueurInfo instance = new JoueurInfo();
        instance.retirerObjet(o);
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
    }

    /**
     * Test of setInstance method, of class JoueurInfo.
     */
    @Test
    public void testSetInstance() {
        System.out.println("setInstance");
        JoueurInfo joueur = new JoueurInfo();
        JoueurInfo.setInstance(joueur);
    }
    
}
