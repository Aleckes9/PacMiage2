package ressources.image;

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
@Suite.SuiteClasses({ressources.image.logo.LogoSuite.class, ressources.image.drapeau.DrapeauSuite.class, ressources.image.eshop.EshopSuite.class, ressources.image.chiffre.ChiffreSuite.class, ressources.image.personnage.PersonnageSuite.class, ressources.image.questions.QuestionsSuite.class, ressources.image.objet.ObjetSuite.class, ressources.image.miniMap.MiniMapSuite.class, ressources.image.score.ScoreSuite.class})
public class ImageSuite {

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
