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
    Pion pion;
    
    public CaseConsole(boolean etat) {
        this.etat = etat;
    }
    
    public boolean VerifEtat(){
        if (etat == false){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void addPion(int X, int Y, String couleur,boolean roi){
        etat=true;
        pion =  new Pion(X,Y,couleur,false);
    }

    @Override
    public String toString() {
        if (etat==true){
            return pion.toString();
        } else {
            return "";
        }
    }
    
    
}
