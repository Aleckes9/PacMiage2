package pacmiage2;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import static pacmiage2.Eshop_Liaison_avec_Menu.save;

/**
 *
 * @author Maëlle
 */
public class RetourMenu extends AbstractAction{
JoueurInfo j;
    public RetourMenu(JoueurInfo j) {
    this.j=j;
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       save= new Sauvegarde();
    try {
        save.enregistrerFichier(j);
    } catch (IOException ex) {
        Logger.getLogger(RetourMenu.class.getName()).log(Level.SEVERE, null, ex);
    }
       System.exit(0); 
    }

    
}
