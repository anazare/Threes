/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JEU;

import java.util.ArrayList;

/**
 *
 * @author redou
 */
public class Pion {
    boolean roi;
    Coord coordPion;
    String couleur;

    public Pion(int X, int Y, String couleur,boolean roi) {
        this.coordPion = new Coord(X,Y);
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
