package listener;

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
@Suite.SuiteClasses({listener.Eshop_Action_AchatTest.class, listener.ActionSonTest.class, listener.FenetreMenuListenerTest.class, listener.RetourMenuTest.class, listener.Btn_RetourEshopTest.class, listener.Action_Btn_ObjetTest.class, listener.Eshop_Action_ConfirmAchatTest.class, listener.SelectionNiveauListenerTest.class})
public class ListenerSuite {

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
