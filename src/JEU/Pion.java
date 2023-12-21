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

    public Pion(PionConsole pion, int l, int L) {
        this.pion = pion;
        this.l = l;
        this.L = L;
    }
        @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (pion.toString() == "PB"){
        g.fillOval(13,13,80,80);
        g.setColor(Color.BLUE);
        }
        if (pion.toString() == "RB"){
        g.fillRect(13,13,80,80);
        g.setColor(Color.BLUE);
        }
        if (pion.toString() == "PR"){
        g.fillOval(13,13,80,80);
        g.setColor(Color.RED);
        }
        if (pion.toString() == "RR"){
        g.fillRect(13,13,80,80);
        g.setColor(Color.RED);
        }
}
}
