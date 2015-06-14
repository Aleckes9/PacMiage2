/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.modele;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class Question {

    private int niveau;
    private String choix;
    private ArrayList<Reponse> reponse;
    private String text;

    /**
     *
     */
    public Question() {
        reponse = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public String getChoix() {
        return choix;
    }

    /**
     *
     * @param choix
     */
    public void setChoix(String choix) {
        this.choix = choix;
    }

    /**
     *
     * @return
     */
    public ArrayList<Reponse> getReponse() {
        return reponse;
    }

    /**
     *
     * @param reponse
     */
    public void setReponse(ArrayList<Reponse> reponse) {
        this.reponse = reponse;
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
    public boolean isEmptyChoix() {
        return choix.isEmpty();
    }

    /**
     *
     * @return
     */
    public boolean isEmptyReponse() {
        return reponse.isEmpty();
    }

    /**
     *
     * @param index
     * @return
     */
    public Reponse getReponse(int index) {
        return reponse.get(index);
    }

    /**
     *
     * @param e
     * @return
     */
    public boolean addReponse(Reponse e) {
        return reponse.add(e);
    }

    /**
     *
     * @param index
     * @return
     */
    public Reponse removeReponse(int index) {
        return reponse.remove(index);
    }

    /**
     *
     * @return
     */
    public Iterator<Reponse> iteratorReponse() {
        return reponse.iterator();
    }

    /**
     *
     * @return
     */
    public int getNiveau() {
        return niveau;
    }

    /**
     *
     * @param niveau
     */
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

}
