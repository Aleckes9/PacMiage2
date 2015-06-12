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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValider method, of class Question_FenetreQuestion.
     */
    @Test
    public void testGetValider() {
        System.out.println("getValider");
        Question_FenetreQuestion instance = null;
        JButton expResult = null;
        JButton result = instance.getValider();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValider method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetValider() {
        System.out.println("setValider");
        JButton valider = null;
        Question_FenetreQuestion instance = null;
        instance.setValider(valider);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestion method, of class Question_FenetreQuestion.
     */
    @Test
    public void testGetQuestion() {
        System.out.println("getQuestion");
        Question_FenetreQuestion instance = null;
        Question expResult = null;
        Question result = instance.getQuestion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class Question_FenetreQuestion.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Question_FenetreQuestion instance = null;
        JTextPane expResult = null;
        JTextPane result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setText method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        JTextPane text = null;
        Question_FenetreQuestion instance = null;
        instance.setText(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestion method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetQuestion() {
        System.out.println("setQuestion");
        Question question = null;
        Question_FenetreQuestion instance = null;
        instance.setQuestion(question);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPanelGlobal method, of class Question_FenetreQuestion.
     */
    @Test
    public void testGetPanelGlobal() {
        System.out.println("getPanelGlobal");
        Question_FenetreQuestion instance = null;
        JPanel expResult = null;
        JPanel result = instance.getPanelGlobal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPanelGlobal method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetPanelGlobal() {
        System.out.println("setPanelGlobal");
        JPanel panelGlobal = null;
        Question_FenetreQuestion instance = null;
        instance.setPanelGlobal(panelGlobal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBoutons method, of class Question_FenetreQuestion.
     */
    @Test
    public void testGetBoutons() {
        System.out.println("getBoutons");
        Question_FenetreQuestion instance = null;
        ArrayList<JButton> expResult = null;
        ArrayList<JButton> result = instance.getBoutons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBoutons method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetBoutons() {
        System.out.println("setBoutons");
        ArrayList<JButton> boutons = null;
        Question_FenetreQuestion instance = null;
        instance.setBoutons(boutons);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class Question_FenetreQuestion.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Question_FenetreQuestion instance = null;
        JTextPane expResult = null;
        JTextPane result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetLabel() {
        System.out.println("setLabel");
        JTextPane label = null;
        Question_FenetreQuestion instance = null;
        instance.setLabel(label);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fermer method, of class Question_FenetreQuestion.
     */
    @Test
    public void testFermer() {
        System.out.println("fermer");
        Question_FenetreQuestion instance = null;
        instance.fermer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChoix method, of class Question_FenetreQuestion.
     */
    @Test
    public void testSetChoix() {
        System.out.println("setChoix");
        boolean unChoix = false;
        Question_FenetreQuestion instance = null;
        instance.setChoix(unChoix);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isChoix method, of class Question_FenetreQuestion.
     */
    @Test
    public void testIsChoix() {
        System.out.println("isChoix");
        Question_FenetreQuestion instance = null;
        boolean expResult = false;
        boolean result = instance.isChoix();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
