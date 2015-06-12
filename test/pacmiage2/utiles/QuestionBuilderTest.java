package pacmiage2.utiles;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage2.modele.Question;

/**
 *
 * @author Aleckes9
 */
public class QuestionBuilderTest {
    
    public QuestionBuilderTest() {
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
     * Test of getQuestion method, of class QuestionBuilder.
     */
    @Test
    public void testGetQuestion() {
        System.out.println("getQuestion");
        int niveau = 0;
        QuestionBuilder instance = null;
        Question expResult = null;
        Question result = instance.getQuestion(niveau);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
