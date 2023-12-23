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
public class Joueur {
    ArrayList<CarteConsole> MainJ;
    ArrayList<Pion> PionsJ;
    String Couleur;

  /**
     * Construit un joueur, il possède une couleur, une main de cartes et des pions 
     * @param couleur
     */
    public Joueur(String couleur) {
        this.MainJ = new ArrayList<CarteConsole> ();
        this.PionsJ = new ArrayList<Pion> ();
        this.Couleur = couleur;
    }
    
    
}
