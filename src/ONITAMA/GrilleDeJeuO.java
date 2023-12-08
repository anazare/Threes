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
    
    public void D�placementDroite(Pawn pawn, int ligne, int colonne){
        if ("roi".equals(pawn.VisualiserType(pawn))){
            colonne+=1;
        } else {
            colonne+=1;
        }
    }
    
    public void D�placementGauche(Pawn pawn, int ligne, int colonne){
        if ("roi".equals(pawn.VisualiserType(pawn))){
            colonne-=1;
        } else {
            colonne-=1;
        }
    }
    
    public void D�placementHaut(Pawn pawn, int ligne, int colonne){
        if ("roi".equals(pawn.VisualiserType(pawn))){
            ligne-=1;
        } else {
            ligne-=1;
        }
    }
    
    public void D�placementBas (Pawn pawn, int ligne, int colonne){
        if ("roi".equals(pawn.VisualiserType(pawn))){
            ligne+=1;
        } else {
            ligne+=1;
        }
    }
}


