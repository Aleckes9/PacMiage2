/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.controleur.partie;

import pacmiage2.modele.Reponse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import pacmiage2.vue.question.Question_FenetreQuestion;

/**
 *
 * @author Aleckes9
 */
public class FenetreQuestionListener  implements ActionListener {

        Question_FenetreQuestion f;

    public FenetreQuestionListener(Question_FenetreQuestion f) {
        this.f = f;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == f.getValider()) {

            for (Reponse reponse : f.getQuestion().getReponse()) {
                if (reponse.getText().equals(f.getLabel().getText()) && reponse.isVeracite() == true) {
                        f.setChoix(true);
                    break;
                }else{
                   f.setChoix(false);
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
