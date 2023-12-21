/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JEU;

/**
 *
 * @author redou
 */
public class PionConsole {
    String roi;
    boolean gris = false;
    int X;
    int Y;
    String couleur;

    public PionConsole(int X, int Y, String couleur,String roi) {
        this.X = X;
        this.Y = Y;
        this.couleur = couleur;
        this.roi = roi;
    }
    
    
   public void SuppPion(){
       couleur = "white";
    }
   
    public void Gris(){
        gris = true;
    }
    
     public void noGris(){
        gris = false;
    }

    public void addPion(int X1, int Y1, String couleur1,String roi1){
        X=X1;
        Y=Y1;
        couleur=couleur1;
        roi = roi1;
    }
    
    public void deplace(String couleur1,String roi1){
        couleur = couleur1;
        roi = roi1;
    }

    @Override
    public String toString() {
          if (couleur == "white"){
            return "";
          }
          else{
                if (roi == "oui"){
                    if (couleur == "red" ){
                        return "RR";
                    }
                    else{
                        return "RB";
                    }
                    
                } else {
                    if (couleur == "red" ){
                        return "PR";
                    }
                    else{
                        return "PB";
                    }
                }
            }
        }
    }
    
    
