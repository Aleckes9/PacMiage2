package pacmiage.vue.partie;

import org.newdawn.slick.SlickException;
import pacmiage.modele.Objet;
import pacmiage.modele.ObjetPartie;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Méthode permettant d'afficher les objets bonus dans la partie
 */
public class PartieAffichageObjetBonus extends ObjetPartie{

    private Objet objet;

    /**
     * Constructeur de la classe PartieAffichageObjetBonus
     * @param objet l'objet
     * @param x l'abscisse
     * @param y l'ordonnée
     * @throws SlickException
     */
    public PartieAffichageObjetBonus(Objet objet, int x, int y) throws SlickException {
        super(x, y ,objet.getMiniImage());
        this.objet = objet;
    }

    /**
     * Méthode renvoyant l'objet bonus
     * @return l'objet bonus
     */
    public Objet getObjet() {
        return objet;
    }

    /**
     * Méthode permettant de setter l'objet bonus
     * @param objet
     */
    public void setBonus(Objet objet) {
        this.objet = objet;
    }

}
