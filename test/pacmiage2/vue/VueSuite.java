package pacmiage2.vue;

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
@Suite.SuiteClasses({pacmiage2.vue.question.QuestionSuite.class, pacmiage2.vue.bouton.BoutonSuite.class, pacmiage2.vue.partie.PartieSuite.class, pacmiage2.vue.eshop.EshopSuite.class, pacmiage2.vue.menu.MenuSuite.class})
public class VueSuite {

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
