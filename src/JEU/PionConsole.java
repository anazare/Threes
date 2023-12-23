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

       /**
     * Construit un pion avec en paramètres sa position X et Y (lignes/colonnes), 
     * sa couleur et s'il s'agit d'un roi.
     * @param X
     * @param Y
     * @param couleur
     * @param roi
     */
    public PionConsole(int X, int Y, String couleur,String roi) {
        this.X = X;
        this.Y = Y;
        this.couleur = couleur;
        this.roi = roi;
    }
    
    /**
     * Supprime le pion en changeant sa couleur vers "white".
     */
   public void SuppPion(){
       couleur = "white";
    }
   
    public void Gris(){
        gris = true;
    }
    
     public void noGris(){
        gris = false;
    }

    /**
     * Ajoute un pion en fonction de sa position, sa couleur et de son type 
     */
    public void addPion(int X1, int Y1, String couleur1,String roi1){
        X=X1;
        Y=Y1;
        couleur=couleur1;
        roi = roi1;
    }

  /**
     * Déplace un pion en fonction de sa couleur et de son type 
     */
    public void deplace(String couleur1,String roi1){
        couleur = couleur1;
        roi = roi1;
    }

  /**
     * Ce toString retourne en fonction de la couleur et du type du pions RR (roi rouge), PR (pion rouge),
     * RB (roi bleu), PB(pion bleu).
     * @return
     */
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
    
    
