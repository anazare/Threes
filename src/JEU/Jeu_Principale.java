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
    Pion PionSelectionne;
    PionConsole CaseSelectionne;
    Joueur joueur;
    Joueur adversaire;
    int tour;
    int i;
    int j;
    
    /**
     * Creates new form Jeu_Principale
     */

    public Jeu_Principale() {
        initComponents();
        this.plateau = new Plateau();
        this.CarteSelectionne=null;
        this.CaseSelectionne=null;
        this.joueur = plateau.j1;
        this.adversaire=plateau.j1;
        this.tour=0;
        PanneauGrille.setLayout(new GridLayout(5, 5));
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200,5*110, 5*110));
            this.pack();
            this.revalidate();
        for ( i=0; i < 5; i++) {
            for ( j=0; j < 5; j++ ) {
                Pion bouton = plateau.grille.grille[i][j];
                PanneauGrille.add(plateau.grille.grille[i][j]);
                 ActionListener MettrePion = new ActionListener() {
                            final int b = i;
                            final int c = j;
                            Pion pionselect2 = plateau.grille.grille[b][c];
                            @Override
                            public void actionPerformed(ActionEvent e) {
                               
                            }
                        };
                ActionListener SelectPion = new ActionListener() {
                    final int b = i;
                    final int c = j;
                    Pion pionselect = plateau.grille.grille[b][c];
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (joueur.Couleur == pionselect.pion.couleur) {
                            for (int a = 0; a < 2; a++) {
                                if (CarteSelectionne == joueur.MainJ.get(a)) {
                                    desactiverToutesCases();
                                }
                                activerCasesDepPossible(pionselect, joueur, CarteSelectionne);
//                                metaction(MettrePion);
//                                enleveaction(this);
                            }
                        }
                        else{
                             Joueur j = joueur;
                                joueur = adversaire;
                                adversaire = j;
                                Move(pionselect,plateau.grille.grille[b][c].pion.X,plateau.grille.grille[b][c].pion.Y);
                                activerToutesCases();
                                noGris();
                        }
                    }
                };
                bouton.addActionListener(SelectPion);
            }
            plateau.initialiserPion();
        }
        
        Defausse.setLayout(new GridLayout(1, 1));
        getContentPane().add(Defausse, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10,300, 175));
            this.pack();
            this.revalidate();
            Carte carte = new Carte(plateau.Main.get(2), 170,30);
            carte.setIcon(carte.icon);
            Defausse.add(carte);
        
            PanneauCarteJ1.setLayout(new GridLayout(2, 1));
            getContentPane().add(PanneauCarteJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280,300, 350));
            this.pack();
            this.revalidate();
            Carte carte2 = new Carte(plateau.j1.MainJ.get(1), 170,30);
            Carte carte1 = new Carte(plateau.j1.MainJ.get(0), 170,30);
            carte1.setIcon(carte1.icon);
            carte2.setIcon(carte2.icon);
            PanneauCarteJ1.add(carte1); // ajout au Jpanel PanneauGrille
            ActionListener Carte1 = new ActionListener() {
                Carte carte;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        carte = carte1;
                        carte1.setEnabled(false);
                        carte2.setEnabled(false);
                        CarteSelectionne = carte.CarteAssociee;
                    }  
            };
            carte1.addActionListener(Carte1);
   
            PanneauCarteJ1.add(carte2); // ajout au Jpanel PanneauGrille
            ActionListener Carte2 = new ActionListener() {   
                Carte carte;
                @Override
                    public void actionPerformed(ActionEvent e) {
                        carte = carte2;
                        carte1.setEnabled(false);
                        carte2.setEnabled(false);
                        CarteSelectionne = carte.CarteAssociee;
                    }   
            };
            carte2.addActionListener(Carte2);
           
            
        PanneauCarteJ2.setLayout(new GridLayout(2, 1));
        getContentPane().add(PanneauCarteJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 280,300, 350));
            this.pack();
            this.revalidate();
            Carte carte5 = new Carte(plateau.j2.MainJ.get(1), 170,30);
            Carte carte4 = new Carte(plateau.j2.MainJ.get(0), 170,30);
            carte4.setIcon(carte4.icon);
            carte5.setIcon(carte5.icon);
            PanneauCarteJ2.add(carte4); // ajout au Jpanel PanneauGrille
                    ActionListener Carte4 = new ActionListener() {
                    Carte carte;
                     @Override
                    public void actionPerformed(ActionEvent e) {
                       carte = carte4;
                       carte4.setEnabled(false);
                       carte5.setEnabled(false);
                       CarteSelectionne = carte.CarteAssociee;
                    }   
            };
            carte4.addActionListener(Carte4);
            
            PanneauCarteJ2.add(carte5); // ajout au Jpanel PanneauGrille
            ActionListener Carte5 = new ActionListener() {
                    Carte carte;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        carte = carte5;
                        carte4.setEnabled(false);
                        carte5.setEnabled(false);
                    }   
            };
            carte5.addActionListener(Carte5);
            CarteSelectionne = carte.CarteAssociee;
    }
    public void Move(Pion Pion,int X,int Y){
            plateau.DeplacerPion(Pion, X, Y);
            plateau.EnleverPion(Pion.pion);
        }

    public void changejoueur(Joueur j,Joueur adv){
        joueur=adv;
        adversaire=j;
    }
    
    public void CarteTour(Joueur adv){
        
    }
    /**
     *Fonction qui desactive toutes les cases 
     */
    public void desactiverToutesCases(){
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                plateau.grille.grille[i][j].setEnabled(false); 
            }
        }
    }
    
      public void activerToutesCases(){
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                plateau.grille.grille[i][j].setEnabled(true); 
            }
        }
    }
      
    public void noGris(){
        plateau.noGris();
    }
      
    public void activerCasesDepPossible(Pion Pion,Joueur jj,CarteConsole CarteSelectionne){
        Coord co = new Coord(Pion.pion.X,Pion.pion.Y);
        plateau.VerifCoordPossible(jj,plateau.CoordPossible(co, CarteSelectionne,jj));
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if ( plateau.grille.grille[i][j].pion.gris==true){
                     plateau.grille.grille[i][j].setEnabled(true);           
                 }
            }
        }
    }

    public void enleveaction(ActionListener a){
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                     plateau.grille.grille[i][j].removeActionListener(a);           
            }
    }
    }
    
      public void metaction(ActionListener a){
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                     plateau.grille.grille[i][j].addActionListener(a);           
            }
    }
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
