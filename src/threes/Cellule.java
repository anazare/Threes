/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threes;

/**
 *
 * @author anaza
 */
public class Cellule {
    int nombreCellule; 

    public Cellule() {
        this.nombreCellule = 0;
    }
    
    public boolean getEtat(){
        if (this.nombreCellule==0){
            return false;
        } else {
            return true;
        }
    }
    
    

    @Override
    public String toString() {
        if (this.nombreCellule!=0){
            return ""+nombreCellule;
        } else {
            return null;
        }
    }
    
    

}
