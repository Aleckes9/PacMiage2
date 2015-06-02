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
public interface IPlugin {

    /**
     * Permet d'exécuter les fonctions
     *
     * @return le résultat de la fonction executer
     */
    public Object executer();

    /**
     * Retourne le nom du plugin
     *
     * @return le nom du plugin
     */
    public String getNom();

  

    /**
     * Permet au plugin d'obtenir les informations sur l'application principale
     * nécessaires à son fonctionnement
     *
     * @param ctx : ensemble d'informations sur l'application
     */
    void setApplicationContext(ApplicationContext ctx);
}
