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
    boolean roi;
    int X;
    int Y;
    String couleur;

    public PionConsole(int X, int Y, String couleur,boolean roi) {
        this.X = X;
        this.Y = Y;
        this.couleur = couleur;
    }
    
    public String getColor(){
        return couleur;
    }

    @Override
    public String toString() {
        if (roi==true){
            return "R";
        } else {
            return "P";
        }
    }
    
    
}
