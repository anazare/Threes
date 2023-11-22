/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threes;

/**
 *
 * @author anaza
 */
public class Grille {
    int nbLignes=4;
    int nbColonnes=4; 
    Cellule[][] matriceCellules;

    /**
     * crée une grille de jeu 4X4
     */
    public Grille() {
        matriceCellules = new Cellule[nbLignes][nbColonnes];
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++ ){
                matriceCellules[i][j] = new Cellule();
            }
        }
    }
    
    
}
