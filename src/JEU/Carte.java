/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JEU;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author redou
 */
public class Carte extends JButton {
    CarteConsole CarteAssociee;
    ImageIcon icon;
    int l;
    int L;

    public Carte(CarteConsole CarteAssociee, int l, int L) {
        this.CarteAssociee = CarteAssociee;
        this.l = l;
        this.L = L;
        }
    
    @Override
    protected void paintComponent(Graphics g) {
       super.paintComponent(g);
       g.drawString(CarteAssociee.toString(),l,L);
//        g.drawImage(icon.getImage(), 0, 0, (ImageObserver) icon);
    }
}


