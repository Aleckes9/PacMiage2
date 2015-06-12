package pacmiage2.controleur.partie;

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
@Suite.SuiteClasses({pacmiage2.controleur.partie.FenetreQuestionListenerTest.class, pacmiage2.controleur.partie.ControleurQuestionTest.class, pacmiage2.controleur.partie.ControleurTempsTest.class, pacmiage2.controleur.partie.PacMiageControllerTest.class, pacmiage2.controleur.partie.PartieControllerTest.class})
public class PartieSuite {

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
