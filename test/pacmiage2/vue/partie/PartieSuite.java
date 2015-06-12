package pacmiage2.vue.partie;

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
@Suite.SuiteClasses({pacmiage2.vue.partie.Partie_AffichageScoreTest.class, pacmiage2.vue.partie.Partie_AffichageImageFonduTest.class, pacmiage2.vue.partie.Partie_AffichageMapTest.class, pacmiage2.vue.partie.Partie_AffichageMenuPartieTest.class, pacmiage2.vue.partie.Partie_AffichageObjetBonusTest.class, pacmiage2.vue.partie.Partie_AffichageTempsTest.class})
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
