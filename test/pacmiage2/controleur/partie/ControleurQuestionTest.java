package pacmiage2.controleur.partie;

import java.awt.GraphicsDevice;
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
import pacmiage2.utiles.QuestionBuilder;
import pacmiage2.vue.question.Question_FenetreQuestion;

/**
 *
 * @author Aleckes9
 */
public class ControleurQuestionTest {
    
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFenetre method, of class ControleurQuestion.
     */
    @Test
    public void testGetFenetre() {
        System.out.println("getFenetre");
        ControleurQuestion instance = new ControleurQuestion();
        Question_FenetreQuestion expResult = null;
        Question_FenetreQuestion result = instance.getFenetre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFenetre method, of class ControleurQuestion.
     */
    @Test
    public void testSetFenetre() {
        System.out.println("setFenetre");
        Question_FenetreQuestion fenetre = null;
        ControleurQuestion instance = new ControleurQuestion();
        instance.setFenetre(fenetre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficherQuestion method, of class ControleurQuestion.
     */
    @Test
    public void testAfficherQuestion() {
        System.out.println("afficherQuestion");
        int niveau = 0;
        ControleurQuestion instance = new ControleurQuestion();
        instance.afficherQuestion(niveau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFactory method, of class ControleurQuestion.
     */
    @Test
    public void testGetFactory() {
        System.out.println("getFactory");
        ControleurQuestion instance = new ControleurQuestion();
        DocumentBuilderFactory expResult = null;
        DocumentBuilderFactory result = instance.getFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFactory method, of class ControleurQuestion.
     */
    @Test
    public void testSetFactory() {
        System.out.println("setFactory");
        DocumentBuilderFactory factory = null;
        ControleurQuestion instance = new ControleurQuestion();
        instance.setFactory(factory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuilder method, of class ControleurQuestion.
     */
    @Test
    public void testGetBuilder() {
        System.out.println("getBuilder");
        ControleurQuestion instance = new ControleurQuestion();
        DocumentBuilder expResult = null;
        DocumentBuilder result = instance.getBuilder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBuilder method, of class ControleurQuestion.
     */
    @Test
    public void testSetBuilder() {
        System.out.println("setBuilder");
        DocumentBuilder builder = null;
        ControleurQuestion instance = new ControleurQuestion();
        instance.setBuilder(builder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocument method, of class ControleurQuestion.
     */
    @Test
    public void testGetDocument() {
        System.out.println("getDocument");
        ControleurQuestion instance = new ControleurQuestion();
        Document expResult = null;
        Document result = instance.getDocument();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDocument method, of class ControleurQuestion.
     */
    @Test
    public void testSetDocument() {
        System.out.println("setDocument");
        Document document = null;
        ControleurQuestion instance = new ControleurQuestion();
        instance.setDocument(document);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRacine method, of class ControleurQuestion.
     */
    @Test
    public void testGetRacine() {
        System.out.println("getRacine");
        ControleurQuestion instance = new ControleurQuestion();
        Element expResult = null;
        Element result = instance.getRacine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRacine method, of class ControleurQuestion.
     */
    @Test
    public void testSetRacine() {
        System.out.println("setRacine");
        Element racine = null;
        ControleurQuestion instance = new ControleurQuestion();
        instance.setRacine(racine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getqBuilder method, of class ControleurQuestion.
     */
    @Test
    public void testGetqBuilder() {
        System.out.println("getqBuilder");
        ControleurQuestion instance = new ControleurQuestion();
        QuestionBuilder expResult = null;
        QuestionBuilder result = instance.getqBuilder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setqBuilder method, of class ControleurQuestion.
     */
    @Test
    public void testSetqBuilder() {
        System.out.println("setqBuilder");
        QuestionBuilder qBuilder = null;
        ControleurQuestion instance = new ControleurQuestion();
        instance.setqBuilder(qBuilder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDevice method, of class ControleurQuestion.
     */
    @Test
    public void testGetDevice() {
        System.out.println("getDevice");
        GraphicsDevice expResult = null;
        GraphicsDevice result = ControleurQuestion.getDevice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDevice method, of class ControleurQuestion.
     */
    @Test
    public void testSetDevice() {
        System.out.println("setDevice");
        GraphicsDevice device = null;
        ControleurQuestion.setDevice(device);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
