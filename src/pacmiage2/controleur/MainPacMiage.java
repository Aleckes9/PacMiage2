package pacmiage2.controleur;

import pacmiage2.controleur.partie.PartieController;
import pacmiage2.modele.FenetrePrincipale;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import pacmiage2.utiles.Configuration;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.utiles.ChargerFichier;
import pacmiage2.utiles.SauvegardeFichier;

/**
 *
 * @author Aleckes9
 */
public class MainPacMiage {


    public static JoueurInfo joueur;

    public static void main(String[] args) {

        try {

            AppGameContainer game;

            joueur = (JoueurInfo) ChargerFichier.getInstance().lectureFichier(Configuration.getInstance().recupererValeur("pathSauvegarde"));
            if (joueur == null) {
                SauvegardeFichier.getInstance().enregistrerFichier(JoueurInfo.getInstance(), Configuration.getInstance().recupererValeur("pathSauvegarde"));
            }else{
                JoueurInfo.setInstance(joueur);
            }

            FenetrePrincipale mainFenetre = new FenetrePrincipale(JoueurInfo.getInstance());
            mainFenetre.initFenetre();
            mainFenetre.initFenetreMenu();

            while (true) {
                System.out.print("");
                //
                if (mainFenetre.getPartieController() != null) {
                    PartieController partieController;
                    partieController = mainFenetre.getPartieController();
                    game = new AppGameContainer(partieController, 1024, 768, false);
                    partieController.setGame(game);
                    mainFenetre.dispose();
                    game.setShowFPS(false);
                    //limite le framerate pour garder la même vitesse de jeu sur tout les appariels
                    game.setTargetFrameRate(30);
                    game.setMusicOn(true);
                    game.setMusicVolume(0.5f);
                    //démarre la partie 
                    game.start();
                    //ferme la partie en cours sans fermer l'application
                    game.setForceExit(false);
                    game.exit();
                    
                    
                    mainFenetre.setPartieController(null);
                    mainFenetre.initFenetre();
                    mainFenetre.initFenetreNiveau();
                    

                }
            }

        } catch (IOException ex) {
            Logger.getLogger(MainPacMiage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPacMiage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SlickException ex) {
            Logger.getLogger(MainPacMiage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
