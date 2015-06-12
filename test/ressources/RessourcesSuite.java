package ressources;

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
@Suite.SuiteClasses({ressources.properties.PropertiesSuite.class, ressources.questions.QuestionsSuite.class, ressources.sauvegarde.SauvegardeSuite.class, ressources.parametres.ParametresSuite.class, ressources.map.MapSuite.class, ressources.image.ImageSuite.class, ressources.musique.MusiqueSuite.class})
public class RessourcesSuite {

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
