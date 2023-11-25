/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threes;

import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author anaza
 */
public class CelluleGraph extends JButton {
    
    Cellule celluleGraphiqueAssociee;
    int largeur; 
    int longueur; 

    public CelluleGraph(Cellule celluleGraphiqueAssociee, int largeur, int longueur) {
        this.celluleGraphiqueAssociee = celluleGraphiqueAssociee;
        this.largeur = largeur;
        this.longueur = longueur;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setText(celluleGraphiqueAssociee.toString());
        
    }
}


