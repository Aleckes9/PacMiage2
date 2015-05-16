/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static pacmiage2.Eshop_AfficheEshop.hauteur;
import static pacmiage2.Eshop_AfficheEshop.largeur;

/**
 *Achat d'un objet
 * @author Maëlle
 */
public class Eshop_Action_ConfirmAchat extends AbstractAction{
JoueurInfo j;
Objet it;
String message;
    public Eshop_Action_ConfirmAchat(JoueurInfo j,Objet it) {
       this.j=j;
       this.it=it;
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(j.getGraines()<it.getPrix()){
            message="Vous n'avez pas assez de graines";
        }
        else{
            j.retirerGraines(it.getPrix());
            j.ajouterObjet(it);
            message="Cet objet a été ajouté à votre liste";
        }
         JDialog f = new JDialog();
         
          JPanel p=new JPanel();
           p.setBackground(Color.black);
  f.setBounds(largeur/4, hauteur/4, 2*largeur/5, hauteur/2);
           JLabel texte = new JLabel();
           texte.setText(message);
         texte.setForeground(Color.white);
        texte.setFont(new Font(null, 30*largeur/1360, 30*hauteur/768));
        
        p.setLayout(new BorderLayout());
        p.add(texte,BorderLayout.CENTER);
         
         f.add(p);
        f.setVisible(true);
    }
    
}