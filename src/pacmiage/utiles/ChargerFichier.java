package pacmiage.utiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant de charger le fichier contenant les données du joueur
 */
public class ChargerFichier {

    private static final ChargerFichier CHARGER = new ChargerFichier();

    /**
     * Constructeur de la classe ChargerFichier
     */
    private ChargerFichier() {

    }

    /**
     * Retourne les infomations du joueur enregistrées dans le fichier
     *
     * @param cheminFichier
     * @return les infomations du joueur enregistrées dans le fichier
     */
    public Object lectureFichier(String cheminFichier){
        File f = new File(cheminFichier);
        Object o = null;
        if (f.exists()) {
            FileInputStream fin = null;
            try {
                fin = new FileInputStream(f);
                ObjectInputStream in = new ObjectInputStream(fin);
                o = in.readObject();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ChargerFichier.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(ChargerFichier.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fin.close();
                } catch (IOException ex) {
                    Logger.getLogger(ChargerFichier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return o;
    }

    /**
     *
     * @return
     */
    public static ChargerFichier getInstance() {
        return CHARGER;
    }
}
