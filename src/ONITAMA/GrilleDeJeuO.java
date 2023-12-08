/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ONITAMA;

/**
 *
 * @author anaza
 */
public class GrilleDeJeuO {

    Cellule[][] matriceCellules;
    int nbLignes;
    int nbColonnes;
    Carte carte;
    int positionLigneCarte;
    int positionColonneCarte;
    Pawn pion;

    public GrilleDeJeuO(int p_nbLignes, int p_nbColonnes) {

        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        matriceCellules = new Cellule[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new Cellule();
            }
        }
    }

    public void initialiserGrille() {
        for (int i = 0; i < nbColonnes; i++) {
            matriceCellules[1][i].activerCellule(1);
        }
        for (int i = 0; i < nbColonnes; i++) {
            matriceCellules[5][i].activerCellule(2);
        }
    }

    public void DéplacementDroite(Pawn pawn, int ligne, int colonne) {
        if ("roi".equals(pawn.VisualiserType(pawn))) {
            colonne += 1;
        } else {
            colonne += 1;
        }
    }

    public void DéplacementGauche(Pawn pawn, int ligne, int colonne) {
        if ("roi".equals(pawn.VisualiserType(pawn))) {
            colonne -= 1;
        } else {
            colonne -= 1;
        }
    }

    public void DéplacementHaut(Pawn pawn, int ligne, int colonne) {
        if ("roi".equals(pawn.VisualiserType(pawn))) {
            ligne -= 1;
        } else {
            ligne -= 1;
        }
    }

    public void DéplacementBas(Pawn pawn, int ligne, int colonne) {
        if ("roi".equals(pawn.VisualiserType(pawn))) {
            ligne += 1;
        } else {
            ligne += 1;
        }
    }

    public void VerifDeplacement(int ligne, int colonne) {
        if ("BOAR".equals(this.carte.nom)) {
            if (ligne == this.positionLigneCarte + 1) {
                DéplacementHaut(pion, ligne, colonne);
            } else if (colonne == this.positionColonneCarte + 1) {
                DéplacementDroite(pion, ligne, colonne);
            } else if (colonne == this.positionColonneCarte - 1) {
                DéplacementGauche(pion, ligne, colonne);
            }

        } else if ("COBRA".equals(this.carte.nom)) {
            if (colonne == this.positionColonneCarte - 1) {
                DéplacementGauche(pion, ligne, colonne);
            } else if ((colonne == this.positionColonneCarte + 1) || (ligne == this.positionLigneCarte - 1)) {
                DéplacementDroite(pion, ligne, colonne);
                DéplacementHaut(pion, ligne, colonne);
            } else if ((colonne == this.positionColonneCarte + 1) || (ligne == this.positionLigneCarte + 1)) {
                DéplacementDroite(pion, ligne, colonne);
                DéplacementBas(pion, ligne, colonne);
            }
        } else if ("CRAB".equals(this.carte.nom)) {
            if (ligne == this.positionLigneCarte - 1) {
                DéplacementHaut(pion, ligne, colonne);
            } else if (colonne == this.positionColonneCarte + 2) {
                DéplacementDroite(pion, ligne, colonne);
                DéplacementDroite(pion, ligne, colonne);
            } else if (colonne == this.positionColonneCarte - 2) {
                DéplacementGauche(pion, ligne, colonne);
                DéplacementGauche(pion, ligne, colonne);
            }
        } else if ("CRANE".equals(this.carte.nom)) {
            if ((colonne == this.positionColonneCarte - 1) || (ligne == this.positionLigneCarte + 1)) {
                DéplacementBas(pion, ligne, colonne);
                DéplacementGauche(pion, ligne, colonne);
            } else if (ligne == this.positionLigneCarte - 1) {
                DéplacementHaut(pion, ligne, colonne);
            }
            if ((colonne == this.positionColonneCarte + 1) || (ligne == this.positionLigneCarte + 1)) {
                DéplacementBas(pion, ligne, colonne);
                DéplacementDroite(pion, ligne, colonne);
            }
        } else if ("DRAGON".equals(this.carte.nom)) {
            if ((colonne == this.positionColonneCarte - 2) || (ligne == this.positionLigneCarte - 1)) {
                DéplacementHaut(pion, ligne, colonne);
                DéplacementGauche(pion, ligne, colonne);
                DéplacementGauche(pion, ligne, colonne);
            } else if ((ligne == this.positionLigneCarte - 1) || (colonne == this.positionColonneCarte + 2)) {
                DéplacementHaut(pion, ligne, colonne);
                DéplacementDroite(pion, ligne, colonne);
                DéplacementDroite(pion, ligne, colonne);
            } else if ((ligne == this.positionLigneCarte + 1) || (colonne == this.positionColonneCarte - 1)) {
                DéplacementBas(pion, ligne, colonne);
                DéplacementGauche(pion, ligne, colonne);
            }

            if ((colonne == this.positionColonneCarte + 1) || (ligne == this.positionLigneCarte + 1)) {
                DéplacementBas(pion, ligne, colonne);
                DéplacementDroite(pion, ligne, colonne);
            }
        }
    }
}
