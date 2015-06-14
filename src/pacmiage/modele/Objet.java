/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.modele;

import java.io.Serializable;

/**
 * Objet de l'eshop caractérisé par un nom, une image, une description et un
 * prix
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class Objet  implements Serializable {

    private final String nom;
    private final String image;
    private final String miniImage;
    private final String description;
    private Bonus bonus;
    private final int prix;

    /**
     *
     * @param nom
     * @param image
     * @param description
     * @param prix
     * @param miniImage
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
        //Class classe = Class.forName("java.lang.String");
        Class classe = Class.forName("pacmiage2.utiles.objetBonus.Objet"+nom.replaceAll(" ", ""));
        this.bonus = (Bonus)classe.newInstance();
    }

    /**
     *
     * @return
     */
    public String getMiniImage() {
        return miniImage;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @return
     */
    public String getImage() {
        return image;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @return
     */
    public int getPrix() {
        return prix;
    }

    /**
     *
     * @return
     */
    public Bonus getBonus() {
        return bonus;
    }

    /**
     *
     * @param bonus
     */
    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    
    
}
