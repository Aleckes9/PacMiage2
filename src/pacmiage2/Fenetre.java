package pacmiage2;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 *
 * @author Axel Nini
 */
public class Fenetre extends JFrame{
    
    JPanel j = new JPanel();
    public static    Sauvegarde save;
    public Fenetre(){
        Session.getInstance();
        this.setSize(2000, 1100);
        this.setTitle("pacmiage");
        this.setVisible(true);
        this.setContentPane(j);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        JoueurInfo joueur=new JoueurInfo();
        save=new Sauvegarde();
      joueur= save.lectureFichier();
        new AfficherMenu(joueur);
        //new SelectionnerNiveau();
    }
    
    
}