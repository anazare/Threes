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
    // constructeur (appel� depuis FenetrePrincipale)

    public CelluleGraph(Cellule celluleAssociee, int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.celluleAssociee = celluleAssociee;
    }
    // Methode g�rant le dessin de la cellule

    @Override
    protected void paintComponent(Graphics g) {
        int w = this.getWidth();
        int h = this.getHeight();
        switch (celluleAssociee.getEtat()) {
            case 1 -> g.setColor(Color.red);
            case 2 -> g.setColor(Color.blue);
            default -> g.setColor(Color.white);
        }
        g.fillRect(2, 2, 110, 110);
    }

}


