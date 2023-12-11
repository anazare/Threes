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
public class CarteConsole {
    public String nom;
    public Coord[] deplacementAutorise; 

    public CarteConsole(String nom,Coord Coord1,Coord Coord2,Coord Coord3,Coord Coord4) {
        this.nom = nom;
        Coord[] deplacementAutorise = {Coord1,Coord2,Coord3,Coord4};
        this.deplacementAutorise = deplacementAutorise;
    }

    @Override
    public String toString() {
        return  nom + "";
    } 
}
