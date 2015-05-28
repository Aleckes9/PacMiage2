/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.JButton;

/**
 *
 * @author Aleckes9
 */
public class FenetreQuestionListener  implements ActionListener {

        FenetreQuestion f;

    public FenetreQuestionListener(FenetreQuestion f) {
        this.f = f;
    }

    private BufferedImage image;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == f.getValider()) {

            for (Reponse reponse : f.getQuestion().getReponse()) {
                if (reponse.getText().equals(f.getLabel().getText()) && reponse.isVeracite() == true) {
                    

                    break;
                }else{
                   
                }
                }
                f.getValider().setEnabled(false);
                
                f.dispose();
            

        } else {
            for (JButton bouton : f.getBoutons()) {
                if (e.getSource() == bouton) {
                    f.getLabel().setText(bouton.getText());
                    f.getText().setText(f.getQuestion().getText().replace("???", bouton.getText()));

  
                }
            }
        }

        f.repaint();

    }

}
