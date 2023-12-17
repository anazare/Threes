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
public class Case extends JButton {
    CaseConsole CaseAssociee;
    int l=110;
    int L=110;

   
    public Case(CaseConsole CaseAssociee) {
        this.CaseAssociee = CaseAssociee;
//        this.l = l;
//        this.L = L;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setText(CaseAssociee.toString());
    }
    
    
}
