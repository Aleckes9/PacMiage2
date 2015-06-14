package pacmiage.controleur;

import pacmiage.controleur.partie.PartieController;
import pacmiage.vue.menu.FenetrePrincipale;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.InternalTextureLoader;
import pacmiage.utiles.Configuration;
import pacmiage.modele.JoueurInfo;
import pacmiage.utiles.ChargerFichier;
import pacmiage.utiles.SauvegardeFichier;

/**
 *
 * @author @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class MainPacMiage {

    /**
     *
     */
    private static JoueurInfo joueur;

    private MainPacMiage() {
    }
    
    

    public static void main(String[] args) {
        

        try {

            AppGameContainer game;

            joueur = (JoueurInfo) ChargerFichier.getInstance().lectureFichier(Configuration.getInstance().recupererValeur("pathSauvegarde"));
            if (joueur == null) {
                SauvegardeFichier.getInstance().enregistrerFichier(JoueurInfo.getInstance(), Configuration.getInstance().recupererValeur("pathSauvegarde"));
            }else{
                JoueurInfo.setInstance(joueur);
            }

            FenetrePrincipale mainFenetre = new FenetrePrincipale();
            mainFenetre.initFenetre();
            mainFenetre.initFenetreMenu();

            while (true) {
                System.out.print("");
                //
                if (mainFenetre.getPartieController() != null) {
                    PartieController partieController;
                    partieController = mainFenetre.getPartieController();
                    game = new AppGameContainer(partieController, 1024, 768, true);
                    partieController.setGame(game);
                    mainFenetre.dispose();
                       
                    game.setShowFPS(false);
                    
                    //limite le framerate pour garder la même vitesse de jeu sur tout les appariels
                    game.setTargetFrameRate(30);

                    //démarre la partie 
                    game.start();
                    
                    //ferme la partie en cours sans fermer l'application
                    game.setForceExit(false);
                    game.exit();
                    
                    //Supprime les images déjà enregistré en mémoire
                    InternalTextureLoader.get().clear();
                    mainFenetre.setPartieController(null);
                    mainFenetre.initFenetre();
                    mainFenetre.initFenetreMenu();

                }
            }

        } catch (IOException | SlickException ex) {
            Logger.getLogger(MainPacMiage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
