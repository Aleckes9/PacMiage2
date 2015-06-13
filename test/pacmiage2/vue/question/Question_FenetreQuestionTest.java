package pacmiage2.vue.question;

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
import pacmiage2.modele.Question;

/**
 *
 * @author Aleckes9
 */
public class Question_FenetreQuestionTest {
    
    Question question;
            
    public Question_FenetreQuestionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        question = new Question();
    }
    
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
        Question_FenetreQuestion instance = new Question_FenetreQuestion(question);
        instance.setValider(valider);
    }

    /**
     * Test of setText method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        JTextPane text = null;
        Question_FenetreQuestion instance = new Question_FenetreQuestion(question);
        instance.setText(text);
    }

    /**
     * Test of setQuestion method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetQuestion() {
        System.out.println("setQuestion");
        Question_FenetreQuestion instance = new Question_FenetreQuestion(question);
        instance.setQuestion(question);
    }

    /**
     * Test of setPanelGlobal method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetPanelGlobal() {
        System.out.println("setPanelGlobal");
        JPanel panelGlobal = null;
        Question_FenetreQuestion instance = new Question_FenetreQuestion(question);
        instance.setPanelGlobal(panelGlobal);
    }

    /**
     * Test of setBoutons method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetBoutons() {
        System.out.println("setBoutons");
        ArrayList<JButton> boutons = null;
        Question_FenetreQuestion instance = new Question_FenetreQuestion(question);
        instance.setBoutons(boutons);
    }

    /**
     * Test of setLabel method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetLabel() {
        System.out.println("setLabel");
        JTextPane label = null;
        Question_FenetreQuestion instance = new Question_FenetreQuestion(question);
        instance.setLabel(label);
    }

    /**
     * Test of fermer method, of class Question_FenetreQuestion.
     */
    @Test
    public void testFermer() {
        System.out.println("fermer");
        Question_FenetreQuestion instance = new Question_FenetreQuestion(question);
        instance.fermer();
    }

    /**
     * Test of setChoix method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetChoix() {
        System.out.println("setChoix");
        boolean unChoix = false;
        Question_FenetreQuestion instance = new Question_FenetreQuestion(question);
        instance.setChoix(unChoix);
    }

    /**
     * Test of isChoix method, of class Question_FenetreQuestion.
     */
    @Test
    public void testIsChoix() {
        System.out.println("isChoix");
        Question_FenetreQuestion instance = new Question_FenetreQuestion(question);
        boolean expResult = false;
        boolean result = instance.isChoix();
        assertEquals(expResult, result);
    }
    
}
