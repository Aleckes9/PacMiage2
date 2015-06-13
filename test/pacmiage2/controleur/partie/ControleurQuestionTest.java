package pacmiage2.controleur.partie;

import java.awt.GraphicsDevice;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import pacmiage2.modele.Question;
import pacmiage2.modele.Reponse;
import pacmiage2.utiles.QuestionBuilder;
import pacmiage2.vue.question.Question_FenetreQuestion;

/**
 *
 * @author Aleckes9
 */
public class ControleurQuestionTest {
    
    Question question;
    Question_FenetreQuestion fenetre;
    ArrayList<Reponse> reponse;
    
    
    public ControleurQuestionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        reponse = new ArrayList<>();
        fenetre = new Question_FenetreQuestion(question);
    }
    
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
        instance.init();
    }


    /**
     * Test of afficherQuestion method, of class ControleurQuestion.
     */
    @Test
    public void testAfficherQuestion() {
        System.out.println("afficherQuestion");
        int niveau = 1;
        ControleurQuestion instance = new ControleurQuestion();
        instance.afficherQuestion(niveau);
    }
}
