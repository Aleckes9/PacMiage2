package pacmiage2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static pacmiage2.Eshop_AfficheEshop.hauteur;
import static pacmiage2.Eshop_AfficheEshop.largeur;

/**
 *
 * @author Maëlle
 */
class ActionChoixObjet  {

    public ActionChoixObjet(PartieController partie) {
        JFrame f=new JFrame();
        
         f.setBounds(largeur / 3, hauteur / 4, 4 * largeur / 11, hauteur / 2);
          f.setUndecorated(true);
         JPanel p=new JPanel();
       p.setBackground(Color.black);
         p.setLayout(new FlowLayout()); 
         JLabel l=new JLabel();
         l.setForeground(Color.WHITE);
         l.setFont(new Font("Kristen ITC", Font.PLAIN, 44));
        if(partie.getJoueur().getNbObjet()==0){
  new ObjetFreezer().executer(partie);
//   l.setText("Aucun objet");
         p.add(l);
        }else{
         for(int i=0;i<partie.getJoueur().getObjetDispo().length;i++){

               p.add(new Btn_Objet(partie.getJoueur().getObjetDispo()[i],partie.getJoueur(),f));
        
        }
        BtnRetourMenu bt=new BtnRetourMenu(partie.getJoueur(),f);
      
        p.add(bt);
        }
        
       
    
    f.add(p);
    f.setVisible(true);

            }
    }

   
    

