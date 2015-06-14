package pacmiage2.controleur.partie;

import pacmiage.controleur.partie.ControleurQuestion;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pacmiage.modele.Question;
import pacmiage.modele.Reponse;
import pacmiage.vue.question.QuestionFenetreQuestion;

/**
 *
 * @author Aleckes9
 */
public class ControleurQuestionTest {
    
    /**
     *
     */
    public ControleurQuestionTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {

    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of init method, of class ControleurQuestion.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        ControleurQuestion instance = new ControleurQuestion();
        instance.initQuestion();
    }


}
