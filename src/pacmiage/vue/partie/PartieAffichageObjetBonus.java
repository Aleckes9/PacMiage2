package pacmiage.vue.partie;

import org.newdawn.slick.SlickException;
import pacmiage.modele.Objet;
import pacmiage.modele.ObjetPartie;

/**
 *
 * @author Aleckes9
 */
public class PartieAffichageObjetBonus extends ObjetPartie{

    private Objet objet;

    /**
     *
     * @param objet
     * @param x
     * @param y
     * @throws SlickException
     */
    public PartieAffichageObjetBonus(Objet objet, int x, int y) throws SlickException {
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
