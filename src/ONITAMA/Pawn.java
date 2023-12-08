/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ONITAMA;

/**
 *
 * @author anaza
 */
public class Pawn {
    //String nom; 
    String type;
    int ligne; 
    int colonne;
    

    public Pawn(String type, int ligne, int colonne) {
        this.ligne =  ligne;
        this.colonne = colonne;
        this.type = type;
        
    }
    
    public String VisualiserType(Pawn pawn){
        return type;
    }
    
    
}
