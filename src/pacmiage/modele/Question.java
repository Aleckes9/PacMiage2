/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.modele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe correspondant au modèle d'une question
 */
public class Question {

    private int niveau;
    private String choix;
    private List<Reponse> reponse;
    private String text;

    /**
     * Constructeur de la classe Question
     */
    public Question() {
        reponse = new ArrayList<>();
    }

    /**
     * Méthode permettant de renvoyer le choix
     * @return le choix
     */
    public String getChoix() {
        return choix;
    }

    /**
     * Méthode permettant de setter le choix
     * @param choix
     */
    public void setChoix(String choix) {
        this.choix = choix;
    }

    /**
     * Méthode permettant de renvoyer une liste de réponses
     * @return une liste de réponses possibles
     */
    public List<Reponse> getReponse() {
        return reponse;
    }

    /**
     * Méthode permettant de setter la liste de choix de réponses
     * @param reponse
     */
    public void setReponse(List<Reponse> reponse) {
        this.reponse = reponse;
    }

    /**
     * Méthode permettant de renvoyer le texte
     * @return le texte de la réponse
     */
    public String getText() {
        return text;
    }

    /**
     * Méthode permettant de setter le texte de la réponse
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Méthode permettant de déterminer si le choix est vide ou non
     * @return un booléen indiquant true si le choix est vide, sinon false
     */
    public boolean isEmptyChoix() {
        return choix.isEmpty();
    }

    /**
     *  Méthode permettant de déterminer si une réponse est vide ou non
     * @return un booléen indiquant true si la réponse est vide, sinon false
     */
    public boolean isEmptyReponse() {
        return reponse.isEmpty();
    }

    /** 
     * Méthode permettant de renvoyer la réponse
     * @param index est l'index de la réponse 
     * @return une réponse
     */
    public Reponse getReponse(int index) {
        return reponse.get(index);
    }

    /**
     * Méthode permettant d'ajouter une réponse à la liste de réponses
     * @param e est une réponse
     * @return une réponse à la liste de réponses
     */
    public boolean addReponse(Reponse e) {
        return reponse.add(e);
    }

    /**
     * Méthode permettant de supprimer une réponse à la liste de réponses
     * @param index est l'index de la réponse qu'on supprime
     * @return la liste de réponses sans l'élément supprimé
     */
    public Reponse removeReponse(int index) {
        return reponse.remove(index);
    }

    /**
     * Méthode permettant d'itérer sur la liste de réponses
     * @return
     */
    public Iterator<Reponse> iteratorReponse() {
        return reponse.iterator();
    }

    /**
     * Méthode permettant de renvoyer le niveau
     * @return un niveau
     */
    public int getNiveau() {
        return niveau;
    }

    /**
     * Méthode permettant de setter un niveau
     * @param niveau
     */
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

}
