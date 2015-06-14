/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.utiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maëlle Cloitre / Alexandre Dupuis / Axel Nini / Raphaël Senand
 * 
 * Classe permettant de sauvegarder des informations dans un fichier
 */
public class SauvegardeFichier implements Serializable {

    private static final SauvegardeFichier SAUVEGARDE = new SauvegardeFichier();

    private SauvegardeFichier() {

    }

    /**
     * Enregistre dans un fichier la liste des médias
     *
     * @param monObjetSerializable information du joueur
     * @param cheminFichier
     */
    public void enregistrerFichier(Object monObjetSerializable, String cheminFichier) {

        ObjectOutputStream out = null;
        try {
            FileOutputStream fos = null;
            File f = new File(cheminFichier);
            if (!f.exists()) {
                f.createNewFile();
            }
            fos = new FileOutputStream(f);
            out = new ObjectOutputStream(fos);
            out.writeObject(monObjetSerializable);
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(SauvegardeFichier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(SauvegardeFichier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     *
     * @return
     */
    public static SauvegardeFichier getInstance() {
        return SAUVEGARDE;
    }
}
