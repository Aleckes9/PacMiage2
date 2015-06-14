package pacmiage2.vue.partie;

import org.newdawn.slick.SlickException;
import pacmiage2.modele.Objet;
import pacmiage2.modele.ObjetPartie;

/**
 *
 * @author Aleckes9
 */
public class Partie_AffichageObjetBonus extends ObjetPartie{

    private Objet objet;

    /**
     *
     * @param objet
     * @param x
     * @param y
     * @throws SlickException
     */
    public Partie_AffichageObjetBonus(Objet objet, int x, int y) throws SlickException {
        super(x, y ,objet.getMiniImage());
        this.objet = objet;
    }

    /**
     *
     * @return
     */
    public Objet getObjet() {
        return objet;
    }

    /**
     *
     * @param objet
     */
    public void setBonus(Objet objet) {
        this.objet = objet;
    }

}
