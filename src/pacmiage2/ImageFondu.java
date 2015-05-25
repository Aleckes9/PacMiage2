/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Aleckes9
 */
public class ImageFondu extends JPanel implements ActionListener {

    Timer timer;
    Image img;
    private float alpha;

    public ImageFondu() {

    }

    public int effetFondu(String cheminImg) {
        img = getImage(cheminImg);
        timer = new Timer(40, this);
        alpha = 1f;
        if (img != null) {
            timer.start();
        }
        return 0;
    }

    private Image getImage(String cheminImg) // Choisir une image
    {
        return new ImageIcon(cheminImg).getImage();
    }

    // Afficher l'image sélectionnée dans le frame
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));

        g2d.drawImage(img, this.getWidth() / 2 - 150, this.getHeight() / 2 - 150, 300, 300, null);
    }

    // Appliquer l'effet fondu sur l'image
    public void actionPerformed(ActionEvent e) {
        alpha += -0.01f;
        if (alpha <= 0) {
            alpha = 0;
            timer.stop();
            System.exit(0);
        }
        repaint();
    }

}
