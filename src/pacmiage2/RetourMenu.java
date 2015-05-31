package pacmiage2;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import static pacmiage2.Fenetre.save;


/**
 *
 * @author Maëlle
 */
public class RetourMenu extends AbstractAction{
private JoueurInfo j;
    private  JFrame f;
    public RetourMenu(JoueurInfo j,JFrame f) {
    this.j=j;
    this.f=f;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       save= new Sauvegarde();
    try {
        save.enregistrerFichier(j);
    } catch (IOException ex) {
        Logger.getLogger(RetourMenu.class.getName()).log(Level.SEVERE, null, ex);
    }
    f.dispose();
       System.exit(0); 
    }

    
}
