package pacmiage2.controleur;

import pacmiage2.modele.JoueurInfo;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import pacmiage2.modele.Fenetre;

/**
 *
 * @author Maëlle
 */
public class RetourMenu extends AbstractAction {

    private JoueurInfo j;
    private Fenetre f;

    public RetourMenu(JoueurInfo j, Fenetre f) {
        this.j = j;
        this.f = f;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            f.getSauvegarde().enregistrerFichier(j);
            f.initFenetre();
            f.initFenetreMenu();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(RetourMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
