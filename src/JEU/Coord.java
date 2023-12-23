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
public class Coord {
    ArrayList<Integer> coordonnees;

    public Coord(int X, int Y) {
        coordonnees = new ArrayList<>();
        coordonnees.add(0,X);
        coordonnees.add(1,Y);
    }    
}

