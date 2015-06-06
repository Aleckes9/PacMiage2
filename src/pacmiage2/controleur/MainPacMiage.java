package pacmiage2.controleur;

import pacmiage2.modele.Fenetre;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import pacmiage2.utiles.Importation_Config;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.utiles.Sauvegarde;

/**
 *
 * @author Aleckes9
 */
public class MainPacMiage {

    /**
     * Properties est une class utilisée pour récupérer des valeurs dans un
     * fichiers spécifique. Chaque paramètre est stocké comme une paire composée
     * d'un pointeur de référence ('key') donnant le nom du paramètre, suivi de
     * la valeur désirée de ce paramètre.
     */
    public static Properties properties;

    /**
     * Importation_Config est la class utilisée pour récuperer nôtre fichiers de
     * configuration et retourner un properties utilisable.
     */
    public static Importation_Config config;

    public static Sauvegarde sauvegarde;

    public static JoueurInfo joueur;

    public static void main(String[] args) {

        try {
            //Création d'un objet Importation_Config avec un constructeur vide.
            config = new Importation_Config();
            //initialise le properties
            config.setConfiguration();
            //propeties reçoit le properties créé par la class Importation_Config
            properties = config.getConfiguration();

            sauvegarde = new Sauvegarde(properties.getProperty("pathSauvegarde"));

            joueur =  (JoueurInfo) sauvegarde.lectureFichier();
            if (joueur == null) {
                joueur = new JoueurInfo();
                sauvegarde.enregistrerFichier(joueur);
            }

            Fenetre mainFenetre = new Fenetre(properties, joueur);
            mainFenetre.initFenetre();
            mainFenetre.initFenetreMenu();
            
        } catch (IOException ex) {
            Logger.getLogger(MainPacMiage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPacMiage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}