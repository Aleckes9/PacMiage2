package pacmiage2.controleur;

import pacmiage2.modele.JoueurInfo;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JFrame;


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
//    try {
//        
//        new AfficherMenu(j, new Fenetre());
//    } catch (IOException ex) {
//        Logger.getLogger(RetourMenu.class.getName()).log(Level.SEVERE, null, ex);
//    }
    f.dispose();
       
    }

    
}
