package pacmiage2.utiles;

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
@Suite.SuiteClasses({pacmiage2.utiles.ConfigurationTest.class, pacmiage2.utiles.SauvegardeFichierTest.class, pacmiage2.utiles.SessionTest.class, pacmiage2.utiles.objetBonus.ObjetBonusSuite.class, pacmiage2.utiles.QuestionBuilderTest.class, pacmiage2.utiles.ChargerFichierTest.class, pacmiage2.utiles.LecteurObjetTest.class})
public class UtilesSuite {

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
