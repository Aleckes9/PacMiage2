package pacmiage2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Maëlle
 */
class ActionChoixObjet  {

    public ActionChoixObjet(PartieController partie,JoueurInfo joueur) {
        JFrame f=new JFrame();
         f.setUndecorated(true);
         JPanel p=new JPanel();
         p.add(new JLabel(" Vos objets disponibles: "));
         p.setLayout(new GridLayout(0, 4));
         for(int i=0;i<joueur.getObjetDispo().length;i++){

               p.add(new Btn_Objet(joueur.getObjetDispo()[i],joueur,f));
        
        }
        BtnRetourMenu bt=new BtnRetourMenu(joueur,f);
        p.add(bt);
    
    f.add(p);
    f.setVisible(true);

            }
    }

   
    

