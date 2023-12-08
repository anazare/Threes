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
    //String statut; //pioche/flottante/joueur (peut �tre pas ici)
    int DegresDeplacementLigne; 
    int DegresDeplacementColonne; 


    public Carte( int DegresDeplacementLigne, int DegresDeplacementColonne) { //String statut
        //this.statut = "pioche";
        this.DegresDeplacementLigne = DegresDeplacementLigne;
        this.DegresDeplacementColonne=DegresDeplacementColonne;
    }
    
    public void D�placementDroite(Pawn pawn, int ligne, int colonne){
        if ("roi".equals(pawn.VisualiserType(pawn))){
            colonne+=1;
        } else {
            colonne+=1;
        }
    }
    
    public void D�placementGauche(Pawn pawn, int ligne, int colonne){
        if ("roi".equals(pawn.VisualiserType(pawn))){
            colonne-=1;
        } else {
            colonne-=1;
        }
    }
    
    public void D�placementHaut(Pawn pawn, int ligne, int colonne){
        if ("roi".equals(pawn.VisualiserType(pawn))){
            ligne-=1;
        } else {
            ligne-=1;
        }
    }
    
    public void D�placementBas (Pawn pawn, int ligne, int colonne){
        if ("roi".equals(pawn.VisualiserType(pawn))){
            ligne+=1;
        } else {
            ligne+=1;
        }
    }
}
