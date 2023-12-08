/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ONITAMA;

import static java.util.Arrays.equals;
import static java.util.Objects.equals;

/**
 *
 * @author redou
 */
public class Carte {
    String nom; //nom de la carte 
    String statut; //pioche/flottante/joueur
    int DegresDeplacement; 
//    int colonne;
//    int ligne;

    public Carte(String statut, int DegresDeplacement) {
        this.statut = "pioche";
        this.DegresDeplacement = DegresDeplacement;
    }
    
    public void DéplacementDroite(Pawn pawn, int ligne, int colonne){
        if ("roi".equals(pawn.VisualiserType(pawn))){
            colonne+=1;
        } else {
            colonne+=1;
        }
    }
}
