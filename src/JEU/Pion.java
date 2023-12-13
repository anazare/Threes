/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JEU;

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
         if (pion.roi == "oui"){
            this.setText("R");
        } else {
             this.setText("P");
        }
    }
}
