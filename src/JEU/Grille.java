/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JEU;
  
/**
 *
 * @author anaza
 */
public class Grille {
    int taille;
    Pion[][] grille;
    
/**
     * Construit une grille de pions graphiques avec en paramètre la taille de la grille. 
     * @param taille
     */
    public Grille(int taille) {
        this.taille = taille;
        grille = new Pion[taille][taille];
        for (int i=0; i<taille;i++){
            for (int j=0; j<taille;j++){
                grille[i][j] =new Pion(new PionConsole(i,j,"white","non"),110,110);
            }
        }
    }
    
}
