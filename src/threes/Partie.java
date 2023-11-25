/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threes;

/**
 *
 * @author anaza
 */
public class Partie {
    Grille grille;
    int nbCoups;

    public Partie(Grille grille, int nbCoups) {
        this.grille = grille;
        this.nbCoups = 0;
    }
    
    
    public void lancerPartie(){
        grille.EteindreCellulesGrille();
        //générer deux nb aléatoirement entre 1 et 4 
        // faire apparaitre aléatoirement deux cellules 1 ou 3 
        // a chaque fois que le joureur joue (nbTours ++ et une autre cellule apparait)
    }
    
    
}
