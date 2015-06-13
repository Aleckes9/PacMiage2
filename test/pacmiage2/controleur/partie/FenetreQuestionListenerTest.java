package pacmiage2.controleur.partie;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacmiage2.modele.Question;
import pacmiage2.modele.Reponse;
import pacmiage2.vue.question.Question_FenetreQuestion;

/**
 *
 * @author Aleckes9
 */
public class FenetreQuestionListenerTest {
    
    Question_FenetreQuestion f;
    Object source;
    int id;
    String command;
    int modifiers;
    Question question;
    ArrayList<Reponse> reponse;
    
    public FenetreQuestionListenerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        f = new Question_FenetreQuestion(question);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class FenetreQuestionListener.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = new ActionEvent(source, id, command, modifiers);
        FenetreQuestionListener instance = new FenetreQuestionListener(f);
        instance.actionPerformed(e);
    }
    
}
