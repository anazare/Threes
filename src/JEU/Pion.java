/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JEU;
 
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author redou
 */
public class Pion extends JButton{
    PionConsole pion;
    int l;
    int L;

 /**
     *Construit un pion graphique qui a pour paramètre un pionConsole, une longueur et une largeur
     * @param pion
     * @param l
     * @param L
     */
    public Pion(PionConsole pion, int l, int L) {
        this.pion = pion;
        this.l = l;
        this.L = L;
    }

      /**
     * Cette fonction permet de colorier en bleu les pions du premier joueur et en rouge celui du deuxième joueur
     * n plus, les rois sont de forme carrée et les pions normaux sont de forme ronde 
     * @param g
     */
        @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (pion.toString() == "PB"){
        g.setColor(Color.BLUE);
        g.fillOval(13,13,80,80);
        }
        if (pion.toString() == "RB"){
        g.setColor(Color.BLUE);
        g.fillRect(13,13,80,80);
        }
        if (pion.toString() == "PR"){
         g.setColor(Color.RED);    
        g.fillOval(13,13,80,80);
        }
        if (pion.toString() == "RR"){
        g.setColor(Color.RED);     
        g.fillRect(13,13,80,80);
        }
}
}
