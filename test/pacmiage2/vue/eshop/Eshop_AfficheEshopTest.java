package pacmiage2.vue.eshop;

import javax.swing.JScrollPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.vue.menu.FenetrePrincipale;

/**
 *
 * @author Aleckes9
 */
public class Eshop_AfficheEshopTest {
    
    JoueurInfo joueur;
    
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
        FenetrePrincipale f = new FenetrePrincipale();
        Eshop_AfficheEshop instance = new Eshop_AfficheEshop(f);
        JScrollPane expResult = null;
        JScrollPane result = instance.buildListObjet(f);
        assertEquals(expResult, result);
    }
    
}
