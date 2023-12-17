/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JEU;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author redou
 */
public class Jeu_Principale extends javax.swing.JFrame {
    Plateau plateau;
    Joueur joueur1, joueur2;
    ArrayList<Pion> PionsJoueur1, PionsJoueur2;
    ArrayList<CarteConsole> Main;
    //PionConsole CaseSelectionne;
    CarteConsole CarteSelectionne;
    //PionConsole PionSelectionne;
    int tour;
    //int j;
   
    public void maj_tour(){
        this.tour+=1;
    }
    
    public void desactiverToutesCases(){
        /*CaseConsole bouton_case;*/
        //Case c= new Case(bouton_case); // C EST PAS VRAIMENT NOUVEAU ...
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                CaseConsole bouton_case =  plateau.grille.grille[i][j];
                Case c = (Case) bouton_case;
                c.setClickable(false);
                // j'ai besoin que la case soit de type case et non de type case console 
                // voir comment s'utilisent les methodes setClickable(false) et setEnabled(true) (il faut peut être import un package)
            }
        }
    }
    
    public void activerCasesDepPossible(Carte CarteSelectionne){
        // en entree tableau des deplacements possibles 
        // parcours le tableau et active les cellules des coordonnées autorisées 
        
        // -> methode : setEnabled(true); 
        // -> les griser 
    }
    
    
    /**
     * Creates new form Jeu_Principale
     */
    public Jeu_Principale() {
        initComponents();
        
        // initialiser la partie 
        this.plateau = new Plateau();
        this.joueur1 = plateau.j1;
        this.joueur2 = plateau.j2;
   
        this.PionsJoueur1 = joueur1.PionsJ;
        this.PionsJoueur2 = joueur2.PionsJ;
        
        this.Main = plateau.Main;

        this.tour=0;
        
             
//        this.CarteSelectionne=null;
//        this.PionSelectionne= null;
//        this.CaseSelectionne=null;
        
        
        // création d'une grille de cases
        PanneauGrille.setLayout(new GridLayout(5, 5));
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints
            (470, 200, 5 * 110, 5 * 110));
        this.pack();
        this.revalidate();
        for (int i = 0; i < 5; i++) {
            for (int j=0; j < 5; j++ ) {
                Case bouton_case = new Case(plateau.grille.grille[i][j]);
                PanneauGrille.add(bouton_case);
            }
        }
        
        //Création du Panneau des cartes du joueur 1
        PanneauCarteJ1.setLayout(new GridLayout(2, 1));
        getContentPane().add(PanneauCarteJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints
            (120, 280,300, 350));
        this.pack();
        this.revalidate();
        
        //ajout des cartes dans le panneau 
        for (int i=0; i<2; i++){
            Carte bouton_carte = new Carte(plateau.j1.MainJ.get(i), 170,30);
            PanneauCarteJ1.add(bouton_carte); // ajout au Jpanel PanneauCarte1
            
//            ActionListener ecouteurClick = new ActionListener() {
//                //final int j = i;
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    /*ajouter l'action de la carte 
//                    pour i allant de 0 à la taille de la liste des coordonnées possible 
//                    -> grise les cellules 
//                    -> setEnabled(false) tous les boutons sauf ceux des cases grisées 
//                    */ //-> plus besoin les deux méthodes devraient suffir 
//                    desactiverToutesCases();
//                    //activerCasesDepPossible(CarteSelectionne); //this : carte sur laquelle le joueur à cliqué ! 
//                    // trouver un autre moyen (utiliser un paramètre carte sélectionnée) ? comment le mettre à jour 
//                    
//                }
//            };
//            bouton_carte.addActionListener(ecouteurClick);
//            PanneauCarteJ1.add(bouton_carte);
        }
        
        
        //Création du Panneau des cartes du joueur 2
        PanneauCarteJ2.setLayout(new GridLayout(2, 1));
        getContentPane().add(PanneauCarteJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints
            (1070, 280,300, 350));
        this.pack();
        this.revalidate();
        
        //ajout des cartes dans le panneau 
        for (int i=3; i<5; i++){
            Carte bouton_carte = new Carte(plateau.j1.MainJ.get(i), 170,30);
            PanneauCarteJ2.add(bouton_carte); // ajout au Jpanel PanneauCarte1
            
//            ActionListener ecouteurClick = new ActionListener() {
//                //final int j = i; jsp si c'est utile 
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    desactiverToutesCases();
//                    //activerCasesDepPossible(CarteSelectionne); //this : carte sur laquelle le joueur à cliqué ! est ce possible de l'utiliser comme ca ? 
//                    // trouver un autre moyen (utiliser un paramètre carte sélectionnée) ? comment le mettre à jour 
//                }
//            };
//            
//            bouton_carte.addActionListener(ecouteurClick);
//            PanneauCarteJ2.add(bouton_carte);
        }
        
        //Création du Panneau de la defosse 
        Defausse.setLayout(new GridLayout(1, 1));
        getContentPane().add(Defausse, new org.netbeans.lib.awtextra.AbsoluteConstraints
            (600, 10,300, 175));
        this.pack();
        this.revalidate();
        Carte carte = new Carte(plateau.Main.get(2), 170,30);
        Defausse.add(carte);
        
        
//            
//                //this.PionSelectionne = bouton_case.pion;
//                //Pions.add(bouton_case);
//                 // ajout au Jpanel PanneauGrille
////                                        plateau.DeplacerPion(plateau.grille.grille[2][0],2,2);
//                    ActionListener MettrePion = new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) { 
//                         plateau.grille.grille[2][2] = bouton_case.pion;
//                          plateau.DeplacerPion(plateau.grille.grille[2][0],2,2);
//                          plateau.EnleverPion(bouton_case.pion);
//                            bouton_case.removeActionListener(this);
//                    }
//                    };
//                    bouton_case.addActionListener(MettrePion);
////                }
////                else{
////                ActionListener SelectPion = new ActionListener() {
////                    @Override
////                    public void actionPerformed(ActionEvent e) {
////                          plateau.DeplacerPion(PionSelectionne,2,2);
////                    } // ajouter des JButton pour pion pour pouvoir separer les actions des pions et des cases 
////                };
////                bouton_case.addActionListener(SelectPion);
////                }
//            }
//        }
//        plateau.initialiserPion();
//        for (int j = 0; j < 5; j++) {
//            if (j != 2) {
//                plateau.grille.grille[j][0].addPion(0, j, "blue", "non");
//                Pion Pion1 = new Pion(new PionConsole(0, j, "blue", "non", true),110,110);
//                plateau.j1.PionsJ.add(Pion1.pion);
//                  ActionListener Pions1 = new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                            Coord coordpion = new Coord(Pion1.pion.X,Pion1.pion.Y);
//                            ArrayList<Coord> CoordPossibles = plateau.CoordPossible(coordpion, CarteSelectionne);
//                            plateau.VerifCoordPossible(joueur1, CoordPossibles);
//                            PionSelectionne = Pion1.pion;      
//                    } // ajouter des JButton pour pion pour pouvoir separer les actions des pions et des cases 
//                  };
//                  Pion1.addActionListener(Pions1);
//                  
//
//            } else {
//                plateau.grille.grille[j][0].addPion(0, j, "blue", "oui");
//                Pion Roi1 = new Pion(new PionConsole(0, j, "blue", "oui", true),110,110);
//                plateau.j1.PionsJ.add(Roi1.pion);
//                ActionListener Rois1 = new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                            Coord coordpion = new Coord(Roi1.pion.X,Roi1.pion.Y);
//                            ArrayList<Coord> CoordPossibles = plateau.CoordPossible(coordpion, CarteSelectionne);
//                            plateau.VerifCoordPossible(joueur1, CoordPossibles);
//                            PionSelectionne = Roi1.pion;      
//                    } // ajouter des JButton pour pion pour pouvoir separer les actions des pions et des cases 
//                  };
//                  Roi1.addActionListener(Rois1);
//                  
//            }
//        }
//        for (int j = 0; j < 5; j++) {
//            if (j != 2) {
//                plateau.grille.grille[j][4].addPion(4, j, "red", "non");
//                PionConsole Pion2 = new PionConsole(0, j, "red", "non", true);
//                plateau.j2.PionsJ.add(Pion2);
//            } else {
//                plateau.grille.grille[j][4].addPion(4, j, "red", "oui");
//                PionConsole Roi2 = new PionConsole(0, j, "red", "oui", true);
//                plateau.j2.PionsJ.add(Roi2);
//            }
//        }
        
        
            
        
//        PanneauCarteJ2.setLayout(new GridLayout(2, 1));
//        getContentPane().add(PanneauCarteJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 280,300, 350));
//            this.pack();
//            this.revalidate();
//            Carte carte4 = new Carte(plateau.j2.MainJ.get(0), 170,30);
//            PanneauCarteJ2.add(carte4); // ajout au Jpanel PanneauGrille
//            Carte carte5 = new Carte(plateau.j2.MainJ.get(1), 170,30);
//            PanneauCarteJ2.add(carte5); // ajout au Jpanel PanneauGrille
//            ActionListener Carte1 = new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
////                        CarteSelectionne = carte4;
//                    }
//            };
//            carte4.addActionListener(Carte1);
//        While (plateau.Victoire(joueur1)==0){
//             if (tour==1){
//                 
//                 joueur1 = plateau.j1;
//                 
//             }
//        }
    }
//    public void Move(PionConsole Pion,int X,int Y){
//            plateau.DeplacerPion(Pion, X, Y);
//            plateau.EnleverPion(Pion);
//        }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        PanneauGrille = new javax.swing.JPanel();
        Defausse = new javax.swing.JPanel();
        PanneauCarteJ1 = new javax.swing.JPanel();
        PanneauCarteJ2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(-10, 0));
        setMaximumSize(new java.awt.Dimension(2400, 890));
        setMinimumSize(new java.awt.Dimension(2400, 890));
        setPreferredSize(new java.awt.Dimension(2400, 890));
        setSize(new java.awt.Dimension(900, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PanneauGrille.setLayout(new java.awt.BorderLayout());
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 600, 600));

        Defausse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Defausse.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Defausse, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 340, 420));

        PanneauCarteJ1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanneauCarteJ1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PanneauCarteJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 340, 120));

        PanneauCarteJ2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanneauCarteJ2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PanneauCarteJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 270, 340, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jeu_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Jeu_Principale().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Defausse;
    private javax.swing.JPanel PanneauCarteJ1;
    private javax.swing.JPanel PanneauCarteJ2;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
