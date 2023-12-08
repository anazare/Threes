/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ONITAMA;

/**
 *
 * @author redou
 */
public class Carte {
    String nom; //nom de la carte 
    String statut; //pioche/flottante/joueur
    int DegresDeplacement; 

    public Carte(String statut, int DegresDeplacement) {
        this.statut = "pioche";
        this.DegresDeplacement = DegresDeplacement;
    }
    
    public void DéplacementDroite(){
        
    }
}
