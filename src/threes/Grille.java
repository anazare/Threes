/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threes;

import java.awt.GridLayout;

/**
 *
 * @author anaza
 */
public class Grille {
    int nbLignes;
    int nbColonnes; 
    Cellule[][] matriceCellules;

    /**
     * crée une grille de jeu de Cellules (nbL X nbC)
     * @param nbL
     * @param nbC
     */
    public Grille(int nbL, int nbC) {
        this.nbLignes=nbL;
        this.nbColonnes=nbC;
        matriceCellules = new Cellule[nbLignes][nbColonnes];
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++ ){
                matriceCellules[i][j] = new Cellule();
            }
        }
    }
    
    public void EteindreCellulesGrille(){
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++ ){
                matriceCellules[i][j].nombreCellule=0;
            }
        }
    }

   
    
    
}
