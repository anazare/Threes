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
    
    public void fusionCellule(Cellule Cel1, Cellule Cel2){
        if ((Cel1.nombreCellule==1 && Cel2.nombreCellule==3) || ((Cel1.nombreCellule==3 && Cel2.nombreCellule==1))){
            this.nombreCellule=Cel1.nombreCellule+Cel2.nombreCellule;
        } else if (Cel1.nombreCellule==Cel2.nombreCellule){
            this.nombreCellule=Cel1.nombreCellule+Cel2.nombreCellule;
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
