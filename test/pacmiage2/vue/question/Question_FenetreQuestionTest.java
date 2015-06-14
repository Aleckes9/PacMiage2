package pacmiage2.vue.question;

import pacmiage.vue.question.QuestionFenetreQuestion;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage.modele.Question;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class Question_FenetreQuestionTest {
    
    Question question;
            
    /**
     *
     */
    public Question_FenetreQuestionTest() {
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
        question = new Question();
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of setValider method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetValider() {
        System.out.println("setValider");
        JButton valider = null;
        QuestionFenetreQuestion instance = new QuestionFenetreQuestion(question);
        instance.setValider(valider);
    }

    /**
     * Test of setText method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        JTextPane text = null;
        QuestionFenetreQuestion instance = new QuestionFenetreQuestion(question);
        instance.setText(text);
    }

    /**
     * Test of setQuestion method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetQuestion() {
        System.out.println("setQuestion");
        QuestionFenetreQuestion instance = new QuestionFenetreQuestion(question);
        instance.setQuestion(question);
    }

    /**
     * Test of setPanelGlobal method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetPanelGlobal() {
        System.out.println("setPanelGlobal");
        JPanel panelGlobal = null;
        QuestionFenetreQuestion instance = new QuestionFenetreQuestion(question);
        instance.setPanelGlobal(panelGlobal);
    }

    /**
     * Test of setBoutons method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetBoutons() {
        System.out.println("setBoutons");
        ArrayList<JButton> boutons = null;
        QuestionFenetreQuestion instance = new QuestionFenetreQuestion(question);
        instance.setBoutons(boutons);
    }

    /**
     * Test of setLabel method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetLabel() {
        System.out.println("setLabel");
        JTextPane label = null;
        QuestionFenetreQuestion instance = new QuestionFenetreQuestion(question);
        instance.setLabel(label);
    }

    /**
     * Test of fermer method, of class Question_FenetreQuestion.
     */
    @Test
    public void testFermer() {
        System.out.println("fermer");
        QuestionFenetreQuestion instance = new QuestionFenetreQuestion(question);
        instance.fermer();
    }

    /**
     * Test of setChoix method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetChoix() {
        System.out.println("setChoix");
        boolean unChoix = false;
        QuestionFenetreQuestion instance = new QuestionFenetreQuestion(question);
        instance.setChoix(unChoix);
    }

    /**
     * Test of isChoix method, of class Question_FenetreQuestion.
     */
    @Test
    public void testIsChoix() {
        System.out.println("isChoix");
        QuestionFenetreQuestion instance = new QuestionFenetreQuestion(question);
        boolean expResult = false;
        boolean result = instance.isChoix();
        assertEquals(expResult, result);
    }
    
}
