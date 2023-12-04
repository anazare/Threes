/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ONITAMA;

/**
 *
 * @author anaza
 */
public class Cellule {

    private int etat;
    int joueur1;
    int joueur2;

    public Cellule() {
        this.etat = 0;
    }

    public void activerCellule(int joueur) {
        if (joueur == joueur1) {
            etat = 1;
        }
        if (joueur == joueur2) {
            etat = 2;
        }

    }

    public void eteindreCellule() {
        etat = 0;
    }

    public int getEtat() {
        if (etat == 1) {
            return 1;
        } else if (etat == 2) {
            return 2;
        } else {
            return 0;
        }
    }

    public boolean VerifEtat(int joueur) {
        boolean possible = true;
        if (joueur == joueur1) {
            if (etat == 1) {
                possible = false;
            } else {
                possible = true;
            }
        }
        if (joueur == joueur2) {
            if (etat == 2) {
                possible = false;
            } else {
                possible = true;
            }
        }
        return possible;
    }
}


