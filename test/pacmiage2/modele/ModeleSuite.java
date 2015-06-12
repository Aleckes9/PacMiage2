package pacmiage2.modele;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Aleckes9
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({pacmiage2.modele.FantomeTest.class, pacmiage2.modele.ObjetTest.class, pacmiage2.modele.QuestionTest.class, pacmiage2.modele.ReponseTest.class, pacmiage2.modele.JoueurInfoTest.class, pacmiage2.modele.BonusTest.class, pacmiage2.modele.GraineTest.class, pacmiage2.modele.PacMiageTest.class})
public class ModeleSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
