/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

/**
 * Objet de l'eshop caractérisé par un nom, une image, une description et un
 * prix
 *
 * @author Maëlle
 */
public class Objet {

    private String nom;
    private String image;
    private String description;
    private int prix;

    public Objet(String nom, String image, String description, int prix) {
        this.nom = nom;
        this.image = image;
        this.description = description;
        this.prix = prix;
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

}
