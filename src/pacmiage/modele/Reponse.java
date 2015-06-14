/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.modele;

/**
 *
 * @author @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe correspondant au modèle d'une réponse
 * 
 */
public class Reponse {

    private String text;
    private boolean veracite;

    /**
     * Constructeur de la classe Reponse
     */
    public Reponse() {

    }

    /**
     * Constructeur de la classe réponse
     * @param text le texte associé à la réponse
     * @param veracite est un booléen indiquant si la réponse est bonne ou non
     */
    public Reponse(String text, boolean veracite) {

        this.text = text;
        this.veracite = veracite;

    }

    /**
     * Méthode permettant de renvoyer le texte
     * @return le texte de la réponse
     */
    public String getText() {
        return text;
    }

    /**
     * Méthode permettant de setter le texte
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Méthode renvoyant un booléen indiquant si la réponse est juste ou non
     * @return
     */
    public boolean isVeracite() {
        return veracite;
    }

    /**
     * Méthode permettant de setter la véracité d'une réponse
     * @param veracite
     */
    public void setVeracite(boolean veracite) {
        this.veracite = veracite;
    }

}
