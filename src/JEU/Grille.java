/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JEU;

/**
 *
 * @author anaza
 */
public class Grille {
    int taille;
    CaseConsole[][] grille;
    

    public Grille(int taille) {
        this.taille = taille;
        grille = new CaseConsole[taille][taille];
        for (int i=0; i<taille;i++){
            for (int j=0; j<taille;j++){
                grille[i][j] =new CaseConsole();
            }
        }
    }
    
}
