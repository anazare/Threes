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
    int X;
    int Y;
    String couleur;

    public PionConsole(int X, int Y, String couleur,String roi) {
        this.X = X;
        this.Y = Y;
        this.couleur = couleur;
        this.roi = roi;
    }
    
    public String getColor(){
        return couleur;
    }

    @Override
    public String toString() {
        if (roi == "oui"){
            return "R";
        } else {
            return "P";
        }
    }
    
    
}
