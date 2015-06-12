package pacmiage2.modele;

import java.util.ArrayList;
import java.util.Iterator;
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
public class QuestionTest {
    
    public QuestionTest() {
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
     * Test of getChoix method, of class Question.
     */
    @Test
    public void testGetChoix() {
        System.out.println("getChoix");
        Question instance = new Question();
        String expResult = "";
        String result = instance.getChoix();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChoix method, of class Question.
     */
    @Test
    public void testSetChoix() {
        System.out.println("setChoix");
        String choix = "";
        Question instance = new Question();
        instance.setChoix(choix);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReponse method, of class Question.
     */
    @Test
    public void testGetReponse_0args() {
        System.out.println("getReponse");
        Question instance = new Question();
        ArrayList<Reponse> expResult = null;
        ArrayList<Reponse> result = instance.getReponse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReponse method, of class Question.
     */
    @Test
    public void testSetReponse() {
        System.out.println("setReponse");
        ArrayList<Reponse> reponse = null;
        Question instance = new Question();
        instance.setReponse(reponse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class Question.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Question instance = new Question();
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setText method, of class Question.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String text = "";
        Question instance = new Question();
        instance.setText(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmptyChoix method, of class Question.
     */
    @Test
    public void testIsEmptyChoix() {
        System.out.println("isEmptyChoix");
        Question instance = new Question();
        boolean expResult = false;
        boolean result = instance.isEmptyChoix();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmptyReponse method, of class Question.
     */
    @Test
    public void testIsEmptyReponse() {
        System.out.println("isEmptyReponse");
        Question instance = new Question();
        boolean expResult = false;
        boolean result = instance.isEmptyReponse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReponse method, of class Question.
     */
    @Test
    public void testGetReponse_int() {
        System.out.println("getReponse");
        int index = 0;
        Question instance = new Question();
        Reponse expResult = null;
        Reponse result = instance.getReponse(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReponse method, of class Question.
     */
    @Test
    public void testAddReponse() {
        System.out.println("addReponse");
        Reponse e = null;
        Question instance = new Question();
        boolean expResult = false;
        boolean result = instance.addReponse(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeReponse method, of class Question.
     */
    @Test
    public void testRemoveReponse() {
        System.out.println("removeReponse");
        int index = 0;
        Question instance = new Question();
        Reponse expResult = null;
        Reponse result = instance.removeReponse(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iteratorReponse method, of class Question.
     */
    @Test
    public void testIteratorReponse() {
        System.out.println("iteratorReponse");
        Question instance = new Question();
        Iterator<Reponse> expResult = null;
        Iterator<Reponse> result = instance.iteratorReponse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNiveau method, of class Question.
     */
    @Test
    public void testGetNiveau() {
        System.out.println("getNiveau");
        Question instance = new Question();
        int expResult = 0;
        int result = instance.getNiveau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNiveau method, of class Question.
     */
    @Test
    public void testSetNiveau() {
        System.out.println("setNiveau");
        int niveau = 0;
        Question instance = new Question();
        instance.setNiveau(niveau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
