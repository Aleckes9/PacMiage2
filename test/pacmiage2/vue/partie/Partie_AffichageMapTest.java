package pacmiage2.vue.partie;

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
public class Partie_AffichageMapTest {
    
    public Partie_AffichageMapTest() {
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
     * Test of init method, of class Partie_AffichageMap.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        String cheminCarte = "";
        Partie_AffichageMap instance = new Partie_AffichageMap();
        instance.init(cheminCarte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of renderBackground method, of class Partie_AffichageMap.
     */
    @Test
    public void testRenderBackground() {
        System.out.println("renderBackground");
        Partie_AffichageMap instance = new Partie_AffichageMap();
        instance.renderBackground();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of renderForeground method, of class Partie_AffichageMap.
     */
    @Test
    public void testRenderForeground() {
        System.out.println("renderForeground");
        Partie_AffichageMap instance = new Partie_AffichageMap();
        instance.renderForeground();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCollision method, of class Partie_AffichageMap.
     */
    @Test
    public void testIsCollision() {
        System.out.println("isCollision");
        float x = 0.0F;
        float y = 0.0F;
        Partie_AffichageMap instance = new Partie_AffichageMap();
        boolean expResult = false;
        boolean result = instance.isCollision(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectCount method, of class Partie_AffichageMap.
     */
    @Test
    public void testGetObjectCount() {
        System.out.println("getObjectCount");
        Partie_AffichageMap instance = new Partie_AffichageMap();
        int expResult = 0;
        int result = instance.getObjectCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectType method, of class Partie_AffichageMap.
     */
    @Test
    public void testGetObjectType() {
        System.out.println("getObjectType");
        int objectID = 0;
        Partie_AffichageMap instance = new Partie_AffichageMap();
        String expResult = "";
        String result = instance.getObjectType(objectID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectX method, of class Partie_AffichageMap.
     */
    @Test
    public void testGetObjectX() {
        System.out.println("getObjectX");
        int objectID = 0;
        Partie_AffichageMap instance = new Partie_AffichageMap();
        int expResult = 0;
        int result = instance.getObjectX(objectID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectY method, of class Partie_AffichageMap.
     */
    @Test
    public void testGetObjectY() {
        System.out.println("getObjectY");
        int objectID = 0;
        Partie_AffichageMap instance = new Partie_AffichageMap();
        int expResult = 0;
        int result = instance.getObjectY(objectID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectWidth method, of class Partie_AffichageMap.
     */
    @Test
    public void testGetObjectWidth() {
        System.out.println("getObjectWidth");
        int objectID = 0;
        Partie_AffichageMap instance = new Partie_AffichageMap();
        float expResult = 0.0F;
        float result = instance.getObjectWidth(objectID);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectHeight method, of class Partie_AffichageMap.
     */
    @Test
    public void testGetObjectHeight() {
        System.out.println("getObjectHeight");
        int objectID = 0;
        Partie_AffichageMap instance = new Partie_AffichageMap();
        float expResult = 0.0F;
        float result = instance.getObjectHeight(objectID);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectName method, of class Partie_AffichageMap.
     */
    @Test
    public void testGetObjectName() {
        System.out.println("getObjectName");
        int objectID = 0;
        Partie_AffichageMap instance = new Partie_AffichageMap();
        String expResult = "";
        String result = instance.getObjectName(objectID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectProperty method, of class Partie_AffichageMap.
     */
    @Test
    public void testGetObjectProperty() {
        System.out.println("getObjectProperty");
        int objectID = 0;
        String propertyName = "";
        String def = "";
        Partie_AffichageMap instance = new Partie_AffichageMap();
        String expResult = "";
        String result = instance.getObjectProperty(objectID, propertyName, def);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
