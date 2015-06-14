/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.utiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maëlle Cloitre / Alexandre Dupuis / Axel Nini / Raphaël Senand
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

        FileOutputStream fos = null;
        try {
            File f = new File(cheminFichier);
            if (!f.exists()) {
                try {
                    f.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(SauvegardeFichier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            fos = new FileOutputStream(f);
            try (ObjectOutputStream out = new ObjectOutputStream(fos)) {
                try {
                    out.writeObject(monObjetSerializable);
                } catch (IOException ex) {
                    Logger.getLogger(SauvegardeFichier.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(SauvegardeFichier.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SauvegardeFichier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(SauvegardeFichier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static SauvegardeFichier getInstance() {
        return SAUVEGARDE;
    }
}
