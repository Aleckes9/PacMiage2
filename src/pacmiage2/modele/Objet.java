/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.modele;

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

    public String getMiniImage() {
        return miniImage;
    }

    public String getNom() {
        return nom;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public int getPrix() {
        return prix;
    }

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    
    
}
