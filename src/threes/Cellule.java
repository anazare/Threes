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

    /**
     *Construit une cellule de valeur 0
     */
    public Cellule() {
        this.nombreCellule = 0;
    }
    
    /**
     * Vérifie si la cellule est remplie 
     * @return boolean 
     */
    public boolean getEtat(){
        if (this.nombreCellule==0){
            return false;
        } else {
            return true;
        }
    }
    
    public void eteindreCel(){
        if (this.getEtat()==true){
            this.nombreCellule=0;
        }
    }
    
    /**
     * Additionne les cellules 
     * @param Cel1
     * @param Cel2
     */
    public void additionCellule(Cellule Cel1, Cellule Cel2){
        if ((Cel1.nombreCellule==1 && Cel2.nombreCellule==2) || ((Cel1.nombreCellule==2 && Cel2.nombreCellule==1))){
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
