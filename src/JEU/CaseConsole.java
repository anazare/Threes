/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JEU;

/**
 *
 * @author redou
 */
public class CaseConsole {
    boolean etat;
    PionConsole pion = null;
    boolean gris;
    
    public CaseConsole() {
        this.etat = false;
    }
    
    public boolean VerifEtat(){
        if (etat == false){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void Gris(){
        gris = true;
    }
    
    public void addPion(int X, int Y, String couleur,boolean roi){
        etat=true;
        pion =  new PionConsole(X,Y,couleur,false);
    }
    
    public void SuppPion(){
        etat=false;
        pion = null;
    }

    @Override
    public String toString() {
        if (etat==true){
            return pion.toString();
        }
        if (gris == true){
            return "G";
        }
        else {
            return "";
        }
    }
    
    
}
