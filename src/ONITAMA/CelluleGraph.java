/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ONITAMA;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author anaza
 */
public class CelluleGraph extends JButton {

    int largeur; // largeur en pixel de la cellule
    int hauteur; // hauteur en pixel de la cellule
    Cellule celluleAssociee;
    // constructeur (appelé depuis FenetrePrincipale)

    public CelluleGraph(Cellule celluleAssociee, int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.celluleAssociee = celluleAssociee;
    }
    // Methode gérant le dessin de la cellule

    @Override
    protected void paintComponent(Graphics g){ 
        super.paintComponent(g);}
}
