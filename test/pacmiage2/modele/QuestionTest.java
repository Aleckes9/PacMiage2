package pacmiage2.modele;

import pacmiage.modele.Reponse;
import pacmiage.modele.Question;
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
    
    String choix;
    String text;
    boolean veracite;
    
    /**
     *
     */
    public QuestionTest() {
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
     * Test of setChoix method, of class Question.
     */
    @Test
    public void testSetChoix() {
        System.out.println("setChoix");
        String choix = "";
        Question instance = new Question();
        instance.setChoix(choix);
    }

    /**
     * Test of setReponse method, of class Question.
     */
    @Test
    public void testSetReponse() {
        System.out.println("setReponse");
        ArrayList<Reponse> reponse = new ArrayList<Reponse>();
        Question instance = new Question();
        instance.setReponse(reponse);
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
    }




    /**
     * Test of addReponse method, of class Question.
     */
    @Test
    public void testAddReponse() {
        System.out.println("addReponse");
        Reponse e = null;
        Question instance = new Question();
        boolean expResult = true;
        boolean result = instance.addReponse(e);
        assertEquals(expResult, result);
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
    }
    
}
