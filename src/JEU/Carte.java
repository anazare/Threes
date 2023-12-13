/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JEU;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author redou
 */
public class Carte extends JButton {
    CarteConsole CarteAssociee;
    
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
        this.setText(CarteAssociee.toString());
        ///BufferedImage Image = null;
        
//        switch (CarteAssociee.nom){
//            case "boar" : 
//            try {
//                Image = ImageIO.read(new File("boar.png"));
//            } catch (IOException ex) {
//                Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Image carte1 = Image.getScaledInstance(300, 175, Image.SCALE_DEFAULT);
//            ImageIcon icon1 = new ImageIcon(carte1);
//            
//           //action listener + creation du jButton possible ? 
//            
//            case "cobra" : 
//            BufferedImage bufferedImage = ImageIO.read(new File("cobra.png"));
//            Image carte2 = Image.getScaledInstance(300, 175, Image.SCALE_DEFAULT);
//            ImageIcon icon2 = new ImageIcon(carte2);
//            
//            case "crab" : 
//                try {
//                Image = ImageIO.read(new File("crab.png"));
//            } catch (IOException ex) {
//                Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Image carte3 = Image.getScaledInstance(300, 175, Image.SCALE_DEFAULT);
//            ImageIcon icon3 = new ImageIcon(carte3);
//            
//            case "crane":
//                try {
//                Image = ImageIO.read(new File("crane.png"));
//            } catch (IOException ex) {
//                Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Image carte4 = Image.getScaledInstance(300, 175, Image.SCALE_DEFAULT);
//            ImageIcon icon4 = new ImageIcon(carte4);
//            
//            case "dragon" : 
//            try {
//                Image = ImageIO.read(new File("dragon.png"));
//            } catch (IOException ex) {
//                Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Image carte5 = Image.getScaledInstance(300, 175, Image.SCALE_DEFAULT);
//            ImageIcon icon5 = new ImageIcon(carte5);
//            
//            case "eel":
//            try {
//                Image = ImageIO.read(new File("eel.png"));
//            } catch (IOException ex) {
//                Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Image carte6 = Image.getScaledInstance(300, 175, Image.SCALE_DEFAULT);
//            ImageIcon icon6 = new ImageIcon(carte6);
//            
//            case "elephant":
//            try {
//                Image = ImageIO.read(new File("elephant.png"));
//            } catch (IOException ex) {
//                Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Image carte7 = Image.getScaledInstance(300, 175, Image.SCALE_DEFAULT);
//            ImageIcon icon7 = new ImageIcon(carte7);
//            
//            case "frog":
//            try {
//                Image = ImageIO.read(new File("frog.png"));
//            } catch (IOException ex) {
//                Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Image carte8 = Image.getScaledInstance(300, 175, Image.SCALE_DEFAULT);
//            ImageIcon icon8 = new ImageIcon(carte8);
//            
//            case "goose":
//                try {
//                Image = ImageIO.read(new File("goose.png"));
//            } catch (IOException ex) {
//                Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Image carte9 = Image.getScaledInstance(300, 175, Image.SCALE_DEFAULT);
//            ImageIcon icon9 = new ImageIcon(carte9);
//            
//            case "horse":
//                try {
//                Image = ImageIO.read(new File("horse.png"));
//            } catch (IOException ex) {
//                Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Image carte10 = Image.getScaledInstance(300, 175, Image.SCALE_DEFAULT);
//            ImageIcon icon10 = new ImageIcon(carte10);
//            
//            case "mantis": 
//                try {
//                Image = ImageIO.read(new File("mantis.png"));
//            } catch (IOException ex) {
//                Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Image carte11 = Image.getScaledInstance(300, 175, Image.SCALE_DEFAULT);
//            ImageIcon icon11 = new ImageIcon(carte11);
//            
//            case "monkey":
//                try {
//                Image = ImageIO.read(new File("monkey.png"));
//            } catch (IOException ex) {
//                Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Image carte12 = Image.getScaledInstance(300, 175, Image.SCALE_DEFAULT);
//            ImageIcon icon12 = new ImageIcon(carte12);
//            
//            case "ox":
//                try {
//                Image = ImageIO.read(new File("ox.png"));
//            } catch (IOException ex) {
//                Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Image carte13 = Image.getScaledInstance(300, 175, Image.SCALE_DEFAULT);
//            ImageIcon icon13 = new ImageIcon(carte13);
//            
//            case "rabbit":
//            case "rooster":
//            case "tiger": 
//        }
//        try {
//            Image = ImageIO.read(new File("boar.png"));
//        } catch (IOException ex) {
//            Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Image image1 = Image.getScaledInstance(40, 40, Image.SCALE_DEFAULT);
//        ImageIcon icon1 = new ImageIcon(image1);
//        
        
    }
    
}
