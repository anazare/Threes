/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JEU;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author redou
 */
public class Jeu_Principale extends javax.swing.JFrame {

    Plateau plateau;
    CarteConsole CarteSelectionne;
    Pion PionSelectionne;
    ArrayList<Carte> Cartes;
    ArrayList<Pion> CasePossible;
    Joueur joueur;
    Joueur adversaire;
    int i;
    int j;

    /**
     * Creates new form Jeu_Principale
     */
    public Jeu_Principale() {
        initComponents();
        this.plateau = new Plateau();
        this.Cartes = new ArrayList();
        this.CasePossible = new ArrayList<Pion>();
        this.CarteSelectionne = new CarteConsole(null, null, null, null, null);
        this.joueur = plateau.j1;
        this.adversaire = plateau.j2;
        this.PionSelectionne = new Pion(new PionConsole(0, 0, "white", "non"), 0, 0);
        PanneauGrille.setLayout(new GridLayout(5, 5));
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 5 * 110, 5 * 110));
        this.pack();
        this.revalidate();
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
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
//                      if (joueur.Couleur == pionselect.pion.couleur) {
                        if (CasePossible.size() != 0) {
                            for (int o = 0; o < CasePossible.size(); o++) {
                                if (pionselect == CasePossible.get(o)) {
                                    plateau.DeplacerPion(PionSelectionne, pionselect.pion.X, pionselect.pion.Y);
//                                    pionselect = new Pion(null, 0, 0);
                                    plateau.EnleverPion(PionSelectionne.pion);
                                    activerToutesCases();
                                    CasePossible = new ArrayList<Pion>();
                                    // qd il joue reactive ses cartes et echange la carte utilise avec celle du millieu
                                    for (int k = 0; k < 5; k++) {
                                        if (CarteSelectionne == plateau.Main.get(k)) {
                                            plateau.ActualiserMain(CarteSelectionne, k);
                                            CarteSelectionne = new CarteConsole(null, null, null, null, null);
                                        }
                                    }
                                    PionSelectionne = new Pion(new PionConsole(0, 0, "white", "non"), 0, 0);
                                    Fin();
                                    Joueur h = joueur;
                                    joueur = adversaire;
                                    adversaire = h;
                                    CarteSelectionne = new CarteConsole(null, null, null, null, null);
                                    System.out.println(CarteSelectionne);
                                    System.out.println(CasePossible);
                                }
                            }
                        } else {
                            for (int a = 0; a < 2; a++) {
                                if (CarteSelectionne == joueur.MainJ.get(a)) {
                                    System.out.println(CarteSelectionne);
                                    System.out.println(CasePossible);
                                     plateau.ActualiserMain(CarteSelectionne, a);
                                    desactiverToutesCases();
                                    PionSelectionne = pionselect;
                                    System.out.println("oppPion" + PionSelectionne.pion.X + "" + PionSelectionne.pion.Y);
                                }
                            }
                            activerCasesDepPossible(pionselect, joueur, CarteSelectionne);
                        }
                    }
                };

                bouton.addActionListener(SelectPion);
            }
            plateau.initialiserPion();
        }

//            PanneauCarteJ1.setLayout(new BorderLayout(4,4));
//            JPanel west = new JPanel(new GridLayout(2,1));
//            JPanel east = new JPanel(new GridLayout(2,1));
//            getContentPane().add(west, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 1000, 1000));
//            getContentPane().add(PanneauCarteJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 1250, 800));
        this.pack();
        this.revalidate();
        Carte carte3 = new Carte(plateau.Main.get(2), 300, 175);
        Carte carte2 = new Carte(plateau.Main.get(1), 300, 175);
        Carte carte1 = new Carte(plateau.Main.get(0), 300, 175);
        Carte carte5 = new Carte(plateau.Main.get(3), 300, 175);
        Carte carte4 = new Carte(plateau.Main.get(4), 300, 175);
        Cartes.add(0,carte1); Cartes.add(1,carte2);Cartes.add(2,carte3);Cartes.add(3,carte4);Cartes.add(4,carte5);
//            carte1.setIcon(carte1.icon);
//            carte2.setIcon(carte2.icon);
//            carte.setIcon(carte.icon);
//            west.add(carte1);
//            west.add(carte2);
//            east.add(carte4);
//            east.add(carte4);
//            PanneauCarteJ1.add(west,BorderLayout.WEST);
//            PanneauCarteJ1.add(carte, BorderLayout.NORTH);
//            PanneauCarteJ1.add(carte5, BorderLayout.EAST);
//            PanneauCarteJ1.add(carte4, BorderLayout.EAST);
// ajout au Jpanel PanneauGrille
        ActionListener Carte1 = new ActionListener() {
            Carte carte;

            @Override
            public void actionPerformed(ActionEvent e) {
                carte = carte1;
                CarteSelectionne = carte.CarteAssociee;
                desactiverToutesCartes();
                PanneauCarteJ1.remove(carte);
                Defausse.remove(Cartes.get(2));
                Defausse.add(carte);
                PanneauCarteJ1.add(Cartes.get(2));
                Carte translat = Cartes.get(2);
                Cartes.set(2,carte);
                Cartes.set(0, translat);
            }
        };
        carte1.addActionListener(Carte1);

        ActionListener Carte2 = new ActionListener() {
            Carte carte;

            @Override
            public void actionPerformed(ActionEvent e) {
                carte = carte2;
                CarteSelectionne = carte.CarteAssociee;
                desactiverToutesCartes();
                PanneauCarteJ1.remove(carte);
                Defausse.remove(Cartes.get(2));
                Defausse.add(carte);
                PanneauCarteJ1.add(Cartes.get(2));
                Defausse.revalidate();
                Defausse.repaint();
                PanneauCarteJ1.revalidate();
                PanneauCarteJ1.repaint();
                Carte translat = Cartes.get(2);
                Cartes.set(2,carte);
                Cartes.set(1, translat);
            }
        };
        carte2.addActionListener(Carte2);

        ActionListener Carte4 = new ActionListener() {
            Carte carte;

            @Override
            public void actionPerformed(ActionEvent e) {
                carte = carte4;
                CarteSelectionne = carte.CarteAssociee;
                desactiverToutesCartes();
                PanneauCarteJ2.remove(carte);
                Defausse.remove(Cartes.get(2));
                Defausse.add(carte);
                PanneauCarteJ2.add(Cartes.get(2));
                Carte translat = Cartes.get(2);
                Cartes.set(2,carte);
                Cartes.set(3, translat);
            }
        };
        carte4.addActionListener(Carte4);

        ActionListener Carte5 = new ActionListener() {
            Carte carte;

            @Override
            public void actionPerformed(ActionEvent e) {
                carte = carte5;
                CarteSelectionne = carte.CarteAssociee;
                desactiverToutesCartes();
                PanneauCarteJ2.remove(carte);
                Defausse.remove(Cartes.get(2));
                Defausse.add(carte);
                PanneauCarteJ2.add(Cartes.get(2));
                Defausse.revalidate();
                Defausse.repaint();
                PanneauCarteJ2.revalidate();
                PanneauCarteJ2.repaint();
                Carte translat = Cartes.get(2);
                Cartes.set(2,carte);
                Cartes.set(4, translat);
            }
        };
        carte5.addActionListener(Carte5);

        Defausse.setLayout(new GridLayout(1, 1));
        getContentPane().add(Defausse, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 300, 175));
        this.pack();
        this.revalidate();
//            carte.setIcon(carte.icon);
        Defausse.add(carte3);

        PanneauCarteJ1.setLayout(new GridLayout(2, 1));
        getContentPane().add(PanneauCarteJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 300, 350));
        this.pack();
        this.revalidate();
//      
//            carte1.setIcon(carte1.icon);
//            carte2.setIcon(carte2.icon);
        PanneauCarteJ1.add(carte1); // ajout au Jpanel PanneauGrille
        PanneauCarteJ1.add(carte2); // ajout au Jpanel PanneauGrille

        PanneauCarteJ2.setLayout(new GridLayout(2, 1));
        getContentPane().add(PanneauCarteJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 280, 300, 350));
        this.pack();
        this.revalidate();
//            
//            carte4.setIcon(carte4.icon);
//            carte5.setIcon(carte5.icon);
        PanneauCarteJ2.add(carte4); // ajout au Jpanel PanneauGrille
        PanneauCarteJ2.add(carte5); // ajout au Jpanel PanneauGrille
        
        while(plateau.Victoire(joueur)!=0){
            this.dispose();                              
        }
    }

    public void changejoueur(Joueur j, Joueur adv) {
        joueur = adv;
        adversaire = j;
    }

    public void CarteTour(Joueur adv) {

    }

    public void desactiverToutesCartes() {
        for (int m = 0; m < 5; m++) {
            Cartes.get(m).setEnabled(false);
        }
    }

    public void desactiverToutesCases() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                plateau.grille.grille[i][j].setEnabled(false);
            }
        }
    }

    public static void carteMove(ArrayList<CarteConsole> main) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put(main.get(0).nom, "PanneauCarteJ1");
        capitalCities.put(main.get(1).nom, "PanneauCarteJ1");
        capitalCities.put(main.get(3).nom, "PanneauCarteJ2");
        capitalCities.put(main.get(4).nom, "PanneauCarteJ2");
        capitalCities.put(main.get(2).nom, "Defausse");
        System.out.println(capitalCities);
    }

    public void activerToutesCases() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                plateau.grille.grille[i][j].setEnabled(true);
            }
            Cartes.get(i).setEnabled(true);
        }
    }

    public void noGris() {
        plateau.noGris();
    }

    public void activerCasesDepPossible(Pion Pion, Joueur jj, CarteConsole CarteSelectionne) {
        Coord co = new Coord(Pion.pion.X, Pion.pion.Y);
        plateau.VerifCoordPossible(jj, plateau.CoordPossible(co, CarteSelectionne, jj));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (plateau.grille.grille[i][j].pion.gris == true) {
                    plateau.grille.grille[i][j].setEnabled(true);
                    CasePossible.add(plateau.grille.grille[i][j]);
                }
            }
        }
//        for (int k = 0;k<CasePossible.size();k++){ 
        System.out.println("opp" + CasePossible.size());
//        }
    }

    public void enleveaction(ActionListener a) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                plateau.grille.grille[i][j].removeActionListener(a);
            }
        }
    }

    public void metaction(ActionListener a) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                plateau.grille.grille[i][j].addActionListener(a);
            }
        }
    }
    
    public void Fin(){
        while (plateau.Victoire(joueur) != 0) {
            this.setVisible(false);
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
        PanneauCarteJ2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanneauCarteJ1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(-10, 0));
        setMaximumSize(new java.awt.Dimension(2400, 890));
        setMinimumSize(new java.awt.Dimension(2400, 890));
        setPreferredSize(new java.awt.Dimension(2400, 890));
        setSize(new java.awt.Dimension(900, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(102, 51, 0));
        PanneauGrille.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PanneauGrille.setLayout(new java.awt.BorderLayout());
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 600, 600));

        Defausse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Defausse.setForeground(new java.awt.Color(255, 255, 255));
        Defausse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Defausse, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 340, 420));

        PanneauCarteJ2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanneauCarteJ2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PanneauCarteJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 270, 340, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JEU/Showerwall Laminate Straight Edge Urban Concrete Sw48 2440 x 900 MDF.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 0, 730, 710));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JEU/Showerwall Laminate Straight Edge Urban Concrete Sw48 2440 x 900 MDF.jpeg"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 710, 730, 180));

        PanneauCarteJ1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanneauCarteJ1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PanneauCarteJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 340, 120));

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
