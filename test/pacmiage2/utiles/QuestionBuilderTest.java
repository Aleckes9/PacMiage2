package pacmiage2.utiles;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import pacmiage2.modele.Question;

/**
 *
 * @author Aleckes9
 */
public class QuestionBuilderTest {
    
    Element racine;
    List<Question> questions;
    
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
        int niveau = 1;
        QuestionBuilder instance = new QuestionBuilder(racine);
        Question expResult = null;
        Question result = instance.getQuestion(niveau);
        assertEquals(expResult, result);
    }
    
}
