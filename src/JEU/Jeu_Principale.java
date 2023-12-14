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
    CarteConsole CarteSelectionne;
    PionConsole PionSelectionne;
    PionConsole CaseSelectionne;
    Joueur joueur;
    Joueur adversaire;
    ArrayList<Pion> Pions;
    int tour;
    
    /**
     * Creates new form Jeu_Principale
     */

    public Jeu_Principale() {
        initComponents();
        this.plateau = new Plateau();
        this.CarteSelectionne=plateau.boar;
        this.PionSelectionne= null;
        this.CaseSelectionne=null;
        this.joueur = plateau.j1;
        this.adversaire=plateau.j2;
        this.Pions = new ArrayList<Pion>();
        this.tour=0;
        PanneauGrille.setLayout(new GridLayout(5, 5));
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200,5*110, 5*110));
            this.pack();
            this.revalidate();
        for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++ ) {
                Pion bouton_cellule = new Pion(plateau.grille.grille[i][j], 110,110);
                Pions.add(bouton_cellule);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
                                ActionListener MettrePion = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) { 
                          bouton_cellule.pion.etat=true;
                          for (int i=0;i<25;i++){
                                    Pions.get(i).removeActionListener(this);
                            }
                    }
                        
                    };
                ActionListener SelectPion = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                          bouton_cellule.pion.etat=false;
//                        "Voir comment deplacer pion en ajoutant un action listener et en enlevant l'ancien"
                            Coord coordpion = new Coord(bouton_cellule.pion.X,bouton_cellule.pion.Y);
                            ArrayList<Coord> CoordPossibles = plateau.CoordPossible(coordpion, CarteSelectionne);
                            plateau.VerifCoordPossible(joueur, CoordPossibles);
                            PionSelectionne = bouton_cellule.pion;
//                          pour tous les boutons on ajoute lautrre action et on enleve celle la
                            for (int i=0;i<25;i++){
                                if (Pions.get(i).pion.etat==false){
                                    Pions.get(i).removeActionListener(this);
                                    Pions.get(i).addActionListener(MettrePion);
                                }
                            }
                    } // ajouter des JButton pour pion pour pouvoir separer les actions des pions et des cases 
                };
                bouton_cellule.addActionListener(SelectPion);
            }
        }
        plateau.initialiserPion();
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
//                            plateau.VerifCoordPossible(joueur, CoordPossibles);
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
//                            plateau.VerifCoordPossible(joueur, CoordPossibles);
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
        Defausse.setLayout(new GridLayout(1, 1));
        getContentPane().add(Defausse, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10,300, 175));
            this.pack();
            this.revalidate();
            Carte carte = new Carte(plateau.Main.get(2), 170,30);
            Defausse.add(carte);
        
            PanneauCarteJ1.setLayout(new GridLayout(2, 1));
        getContentPane().add(PanneauCarteJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280,300, 350));
            this.pack();
            this.revalidate();
            Carte carte1 = new Carte(plateau.j1.MainJ.get(0), 170,30);
            PanneauCarteJ1.add(carte1); // ajout au Jpanel PanneauGrille
            Carte carte2 = new Carte(plateau.j1.MainJ.get(1), 170,30);
            PanneauCarteJ1.add(carte2); // ajout au Jpanel PanneauGrille
        
        PanneauCarteJ2.setLayout(new GridLayout(2, 1));
        getContentPane().add(PanneauCarteJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 280,300, 350));
            this.pack();
            this.revalidate();
            Carte carte4 = new Carte(plateau.j2.MainJ.get(0), 170,30);
            PanneauCarteJ2.add(carte4); // ajout au Jpanel PanneauGrille
            Carte carte5 = new Carte(plateau.j2.MainJ.get(1), 170,30);
            PanneauCarteJ2.add(carte5); // ajout au Jpanel PanneauGrille
            ActionListener Carte1 = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
//                        CarteSelectionne = carte4;
                    }
            };
            carte4.addActionListener(Carte1);
//        While (plateau.Victoire(joueur)==0){
//             if (tour==1){
//                 
//                 joueur = plateau.j1;
//                 
//             }
//        }
    }
    
    

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jeu_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jeu_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jeu_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jeu_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jeu_Principale().setVisible(true);
            }
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
