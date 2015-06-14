/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.modele;

/**
 *
 * @author @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël
 * Senand
 */
public class Reponse {

    private String text;
    private boolean veracite;

    /**
     *
     */
    public Reponse() {

    }

    /**
     *
     * @param text
     * @param veracite
     */
    public Reponse(String text, boolean veracite) {

        this.text = text;
        this.veracite = veracite;

    }

    /**
     *
     * @return
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     */
    public boolean isVeracite() {
        return veracite;
    }

    /**
     *
     * @param veracite
     */
    public void setVeracite(boolean veracite) {
        this.veracite = veracite;
    }

}
