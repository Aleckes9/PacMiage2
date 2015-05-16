/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *Ferme la fenêtre de confirmation et revient à l'eshop
 * @author Maëlle
 */
public class FermerLaFenetre extends AbstractAction {
JDialog  f;
    public FermerLaFenetre(JDialog  f) {
    this.f=f;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
f.dispose();
    }
    
}
