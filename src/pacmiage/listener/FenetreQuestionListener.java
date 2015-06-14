/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.listener;

import pacmiage.modele.Reponse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import pacmiage.vue.question.QuestionFenetreQuestion;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe qui permet de gérer les actions de l'utilisateur dans la fenêtre de question
 */
public class FenetreQuestionListener implements ActionListener {

        private QuestionFenetreQuestion fenetreQuestion;

    /**
     * Constructeur de la classe FenetreQuestionListener
     * @param fenetre
     */
    public FenetreQuestionListener(QuestionFenetreQuestion fenetre) {
        this.fenetreQuestion = fenetre;
    }

    /**
     * Méthode permettant de valider la réponse de l'utilisateur et de vérifier si elle est bonne ou fausse
     * @param e est un event indiquant qu'une action a lieue
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == fenetreQuestion.getValider()) {

            for (Reponse reponse : fenetreQuestion.getQuestion().getReponse()) {
                if (reponse.getText().equals(fenetreQuestion.getLabel().getText()) && reponse.isVeracite()) {
                        fenetreQuestion.setChoix(true);
                    break;
                }else{
                   fenetreQuestion.setChoix(false);
                }
                }
                fenetreQuestion.getValider().setEnabled(false);
                
                fenetreQuestion.dispose();
            

        } else {
            for (JButton bouton : fenetreQuestion.getBoutons()) {
                if (e.getSource() == bouton) {
                    fenetreQuestion.getLabel().setText(bouton.getText());
                    fenetreQuestion.getText().setText(fenetreQuestion.getQuestion().getText().replace("???", bouton.getText()));

  
                }
            }
        }

        fenetreQuestion.repaint();

    }

}
