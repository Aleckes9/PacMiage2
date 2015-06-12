package pacmiage2.vue.eshop;

import javax.swing.JScrollPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage2.vue.menu.FenetrePrincipale;

/**
 *
 * @author Aleckes9
 */
public class Eshop_AfficheEshopTest {
    
    public Eshop_AfficheEshopTest() {
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
     * Test of buildListObjet method, of class Eshop_AfficheEshop.
     */
    @Test
    public void testBuildListObjet() throws Exception {
        System.out.println("buildListObjet");
        FenetrePrincipale f = null;
        Eshop_AfficheEshop instance = null;
        JScrollPane expResult = null;
        JScrollPane result = instance.buildListObjet(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
