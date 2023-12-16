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
    String nom;
    ArrayList<Coord> deplacementAutorise ; 

    /**
     * Cr�� une carte qui poss�de un nom et quatre d�placement possibles associ�s (qui vont �tre rang�s dans une ArrayList). 
     * @param nom
     * @param Coord1
     * @param Coord2
     * @param Coord3
     * @param Coord4
     */
    public CarteConsole(String nom,Coord Coord1,Coord Coord2,Coord Coord3,Coord Coord4) {
        this.nom = nom;
        this.deplacementAutorise = new ArrayList<>();
        deplacementAutorise.add(Coord1);
        deplacementAutorise.add(Coord2);
        deplacementAutorise.add(Coord3);
        deplacementAutorise.add(Coord4);
    }

    @Override
    public String toString() {
        return  nom + "";
    } 
}
