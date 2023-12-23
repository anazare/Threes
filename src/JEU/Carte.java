/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JEU;
 
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
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
        if ("boar".equals(CarteAssociee.nom)){
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("boar.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else if ("cobra".equals(CarteAssociee.nom)) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("cobra.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else if ("crab".equals(CarteAssociee.nom)) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("crab.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else if ("crane".equals(CarteAssociee.nom)) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("crane.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else if ("dragon".equals(CarteAssociee.nom)) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("dragon.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else if ("eel".equals(CarteAssociee.nom)) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("eel.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else if ("elephant".equals(CarteAssociee.nom)) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("elephant.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else if ("frog".equals(CarteAssociee.nom)) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("frog.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else if ("goose".equals(CarteAssociee.nom)) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("goose.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else if ("horse".equals(CarteAssociee.nom)) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("horse.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else if ("mantis".equals(CarteAssociee.nom)) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("mantis.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else if ("monkey".equals(CarteAssociee.nom)) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("monkey.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else if ("ox".equals(CarteAssociee.nom)) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("ox.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else if ("rabbit".equals(CarteAssociee.nom)) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("rabbit.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else if ("rooster".equals(CarteAssociee.nom)) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("rooster.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } else  {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("cobra.jpg"));
                Image img1 = img.getScaledInstance(l, L, Image.SCALE_DEFAULT);
                this.icon = new ImageIcon(img1);
            } catch (IOException ex) {
            }
        } 
        this.setIcon(icon);
    }

} 


//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
////       g.drawString(CarteAssociee.toString(),l,L);
//        
//        g.drawImage(icon.getImage(), 0, 0, this);
//    }




