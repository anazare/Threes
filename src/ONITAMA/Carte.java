/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ONITAMA;

import java.util.ArrayList;

/**
 *
 * @author redou
 */
public class Carte {
    String nom;
    //String statut; //pioche/flottante/joueur (pas ici)
    //nom de la carte 
    ArrayList<Integer> DegresDeplacement;
    


    public Carte(int DegresDeplacementLigne, int DegresDeplacementColonne) { 
        this.DegresDeplacement = new ArrayList<>();
        DegresDeplacement.add(DegresDeplacementLigne);
        DegresDeplacement.add(DegresDeplacementColonne);
    }
    
    
}
