/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

/**
 *
 * @author Maëlle Cloitre,Saadia Hussain et Raphaël Senand
 */
public class ApplicationContext {

    private JoueurInfo joueur;
    private PartieController partie;
    private  Fantome fantome;
 
    public ApplicationContext(JoueurInfo joueur, PartieController partie,Fantome fantome) {
       this.joueur=joueur;
       this.partie=partie;
       this.fantome=fantome;
    
    }

    public JoueurInfo getJoueur() {
        return joueur;
    }

    public Fantome getFantome() {
        return fantome;
    }

    public PartieController getPartie() {
        return partie;
    }

    public void setJoueur(JoueurInfo joueur) {
        this.joueur = joueur;
    }

    public void setPartie(PartieController partie) {
        this.partie = partie;
    }

    public void setFantome(Fantome fantome) {
        this.fantome = fantome;
    }

 


}
