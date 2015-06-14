
package pacmiage.modele;

import java.io.Serializable;

/**
 * 
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Objet de l'eshop caractérisé par un nom, une image, une description et un prix
 */
public class Objet  implements Serializable {

    private final String nom;
    private final String image;
    private final String miniImage;
    private final String description;
    private Bonus bonus;
    private final int prix;

    /**
     * Constructeur de la classe Objet
     * @param nom le nom de l'objet
     * @param image l'image de l'objet
     * @param description la description de l'objet
     * @param prix le prix de l'objet
     * @param miniImage la mini image de l'objet
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public Objet(String nom, String image, String description, int prix,String miniImage) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        this.nom = nom;
        this.image = image;
        this.description = description;
        this.prix = prix;
        this.miniImage=miniImage;
        Class classe = Class.forName("pacmiage.utiles.objetbonus.Objet"+nom.replaceAll(" ", ""));
        this.bonus = (Bonus)classe.newInstance();
    }

    /**
     * Méthode renvoyant une mini image de l'objet
     * @return une mini image de l'objet
     */
    public String getMiniImage() {
        return miniImage;
    }

    /**
     * Méthode renvoyant un nom de l'objet
     * @return un nom de l'objet
     */
    public String getNom() {
        return nom;
    }

    /**
     * Méthode renvoyant une image de l'objet
     * @return une image de l'objet
     */
    public String getImage() {
        return image;
    }

    /**
     * Méthode renvoyant une description de l'objet
     * @return une description de l'objet
     */
    public String getDescription() {
        return description;
    }

    /**
     * Méthode renvoyant un prix de l'objet
     * @return un prix de l'objet
     */
    public int getPrix() {
        return prix;
    }

    /**
     * Méthode renvoyant un bonus de l'objet
     * @return un bonus de l'objet
     */
    public Bonus getBonus() {
        return bonus;
    }

    /**
     * Méthode permettant de setter un bonus
     * @param bonus
     */
    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    
    
}
