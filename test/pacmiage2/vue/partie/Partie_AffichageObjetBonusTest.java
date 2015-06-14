package pacmiage2.vue.partie;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import pacmiage2.modele.Objet;

/**
 *
 * @author Aleckes9
 */
public class Partie_AffichageObjetBonusTest {
    
    Objet objet;
    int x;
    int y;
    String nom;
    String image;
    String description;
    int prix;
    String miniImage;
            
    public Partie_AffichageObjetBonusTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        try {
            objet = new Objet(nom,  image, description, prix, miniImage);
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Partie_AffichageObjetBonusTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of render method, of class Partie_AffichageObjetBonus.
     */
    @Test
    public void testRender() throws SlickException {
        System.out.println("render");
        Graphics g = null;
        Partie_AffichageObjetBonus instance = new Partie_AffichageObjetBonus(objet, x, y);
        instance.renderObjetPartie(g);
    }

    /**
     * Test of update method, of class Partie_AffichageObjetBonus.
     */
    @Test
    public void testUpdate() throws SlickException {
        System.out.println("update");
        int delta = 0;
        Partie_AffichageObjetBonus instance = new Partie_AffichageObjetBonus(objet, x, y);
        instance.updateObjetPartie(delta);
    }
}
