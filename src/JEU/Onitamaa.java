/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JEU;

/**
 *
 * @author redou
 */
public class Onitamaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plateau plateau = new Plateau(5);
        plateau.initialiserPlateau();
        System.out.print(plateau.grille);
    }
    
}
