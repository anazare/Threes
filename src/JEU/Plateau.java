/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JEU;
 
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author redou
 */
public class Plateau {
    Grille grille;
    int taille = 5;
    Joueur j1 ;
    Joueur j2 ;
    ArrayList<CarteConsole> Main;
    ArrayList<Coord> coordp;
    Coord nulle = new Coord(20,20),boar1 =new Coord(-1,0),boar2=new Coord(1,0),boar3 = new Coord(0,1);
    Coord cobra1 = new Coord(-1,0),cobra2 =new Coord(1,-1),cobra3=new Coord(1,1);
    Coord crab1 = new Coord(-2,0),crab2 =new Coord(2,0),crab3=new Coord(0,1);
    Coord crane1 = new Coord(0,1),crane2 =new Coord(-1,-1),crane3=new Coord(1,-1);
    Coord dragon1 = new Coord(-1,-1),dragon2 =new Coord(1,-1),dragon3=new Coord(-2,1),dragon4 = new Coord(2,1);
    Coord eel1 = new Coord(-1,-1),eel2 =new Coord(1,0),eel3=new Coord(-1,1);
    Coord elephant1 = new Coord(-1,0),elephant2 =new Coord(1,0),elephant3=new Coord(-1,1),elephant4 = new Coord(1,1);
    Coord frog1 = new Coord(-2,0),frog2 =new Coord(-1,1),frog3=new Coord(1,-1);
    Coord goose1 = new Coord(1,0),goose2 =new Coord(-1,0),goose3=new Coord(-1,1),goose4 = new Coord(1,-1);
    Coord horse1 = new Coord(0,-1),horse2 =new Coord(-1,0),horse3=new Coord(0,1);
    Coord mantis1 = new Coord(0,-1),mantis2 =new Coord(-1,1),mantis3=new Coord(1,1);
    Coord monkey1 = new Coord(1,-1),monkey2 =new Coord(1,1),monkey3=new Coord(-1,1),monkey4 = new Coord(-1,-1);
    Coord ox1 = new Coord(0,1),ox2 =new Coord(0,-1),ox3=new Coord(1,0);
    Coord rabbit1 = new Coord(-1,-1),rabbit2 =new Coord(2,0),rabbit3=new Coord(1,1);
    Coord rooster1 = new Coord(-1,-1),rooster2 =new Coord(-1,0),rooster3=new Coord(1,0),rooster4 = new Coord(1,1);
    Coord tiger1 = new Coord(0,2),tiger2 =new Coord(0,-1);
    CarteConsole boar = new CarteConsole("boar",boar1,boar2,boar3,nulle);
    CarteConsole cobra = new CarteConsole("cobra",cobra1,cobra2,cobra3,nulle);
    CarteConsole crab = new CarteConsole("crab",crab1,crab2,crab3,nulle);
    CarteConsole crane = new CarteConsole("crane",crane1,crane2,crane3,nulle);
    CarteConsole dragon = new CarteConsole("dragon",dragon1,dragon2,dragon3,dragon4);
    CarteConsole eel = new CarteConsole("eel",eel1,eel2,eel3,nulle);
    CarteConsole elephant = new CarteConsole("elephant",elephant1,elephant2,elephant3,elephant4);
    CarteConsole frog = new CarteConsole("frog",frog1,frog2,frog3,nulle);
    CarteConsole goose = new CarteConsole("goose",goose1,goose2,goose3,goose4);
    CarteConsole horse = new CarteConsole("horse", horse1, horse2, horse3,nulle);
    CarteConsole mantis = new CarteConsole("mantis",mantis1,mantis2,mantis3,nulle);
    CarteConsole monkey = new CarteConsole("monkey",monkey1,monkey2,monkey3,monkey4);
    CarteConsole ox = new CarteConsole("ox",ox1,ox2,ox3,nulle);
    CarteConsole rabbit = new CarteConsole("rabbit",rabbit1,rabbit2,rabbit3,nulle);
    CarteConsole rooster = new CarteConsole("rooster",rooster1,rooster2,rooster3,rooster4);
    CarteConsole tiger = new CarteConsole("tiger",tiger1,tiger2,nulle,nulle);

 /**
     * Construit un plateau de jeu avec une grille, deux joueurs, une main de 5 cartes (range la main dans une arraylist)
     */
    public Plateau() {
        this.j1 = new Joueur("blue");
        this.j2 = new Joueur("red");
        this.Main = new ArrayList<CarteConsole>();
        this.grille = new Grille(taille);
//      initialiserPion();
        creerMain();
    }

 /**
     * Tirage aléatoire de 5 cartes sur 15 qui sont ensuite rangées dans une ArrayList
     */
    public void creerMain(){ 
        Random r = new Random();
        while (Main.size()<5){
            int a = r.nextInt(15);
            if (a==0){
                if (!Main.contains(boar)){
                    Main.add(boar);
                } 
            }
            if (a==1){
                if (!Main.contains(cobra)){
                    Main.add(cobra);
                }
            }
            if (a==2){
                if (!Main.contains(crab)){
                    Main.add(crab);
                }
            }
            if (a==3){
                if (!Main.contains(crane)){
                    Main.add(crane);
                }
            }
            if (a==4){
                if (!Main.contains(dragon)){
                    Main.add(dragon);
                }
            }
            if (a==5){
                if (!Main.contains(eel)){
                    Main.add(eel);
                }
            }
            if (a==6){
                if (!Main.contains(elephant)){
                    Main.add(elephant);
                }
            }
            if (a==7){
                if (!Main.contains(frog)){
                    Main.add(frog);
                }
            }
            if (a==8){
                if (!Main.contains(goose)){
                    Main.add(goose);
                }
            }
            if (a==9){
                if (!Main.contains(horse)){
                    Main.add(horse);
                }
            }
            if (a==10){
                if (!Main.contains(mantis)){
                    Main.add(mantis);
                }
            }
            if (a==11){
                if (!Main.contains(monkey)){
                    Main.add(monkey);
                }
            }
            if (a==12){
                if (!Main.contains(ox)){
                    Main.add(ox);
                }
            }
            if (a==13){
                if (!Main.contains(rabbit)){
                    Main.add(rabbit);
                }  
            }
            if (a==14){
                if (!Main.contains(rooster)){
                Main.add(rooster);}
            }
            if (a==15){
                if (!Main.contains(tiger)){
                Main.add(tiger);}
            }
        }
        j1.MainJ.add(Main.get(0));
        j1.MainJ.add(Main.get(1));
        j2.MainJ.add(Main.get(3));
        j2.MainJ.add(Main.get(4));
    }

 /**
     * Initialise les pions du joueur 1 et du joueur 2 qui sont ensuite rangés dans des listes. 
     */
    public void initialiserPion(){
        for (int j=0; j<taille;j++){
            if(j!=2){
                grille.grille[j][0].pion.addPion(j,0,"blue","non");
                Pion Pion1 = new Pion(new PionConsole(j,0,"blue","non"),110,110);
                j1.PionsJ.add(Pion1);
                grille.grille[j][4].pion.addPion(j,4,"red","non");
                Pion Pion2 = new Pion(new PionConsole(j,0,"red","non"),110,110);
                j2.PionsJ.add(Pion2);
            } else{
                grille.grille[j][0].pion.addPion(j,0,"blue","oui");
                Pion Roi1 = new Pion(new PionConsole(j,0,"blue","oui"),110,110);
                j1.PionsJ.add(Roi1);
                grille.grille[j][4].pion.addPion(j,4,"red","oui");
                Pion Roi2 = new Pion(new PionConsole(j,0,"red","oui"),110,110);
                j2.PionsJ.add(Roi2);
            }
        }
        creerMain();
    }

 /**
     *Calcul des coordonnées possibles en fonction du joueur, de la carte sélectionnée, des coordonnées initiales du pion sélectionné
     * @param Coordi
     * @param Carte
     * @param j
     * @return
     */
    public ArrayList<Coord> CoordPossible(Coord Coordi, CarteConsole Carte,Joueur j){
            ArrayList<Coord> CoordPossibles = new ArrayList<>();
            for (int i=0; i<4; i++){
                Coord f;
                int X;
                int Y;
                Coord c = Carte.deplacementAutorise.get(i);
                 if (j == j1) {
                    X = Coordi.coordonnees.get(0) + c.coordonnees.get(0);
                    Y = Coordi.coordonnees.get(1) + c.coordonnees.get(1);
                } else {
                    X = Coordi.coordonnees.get(0) - c.coordonnees.get(0);
                    Y = Coordi.coordonnees.get(1) - c.coordonnees.get(1);
                }
                f = new Coord(X,Y);
                CoordPossibles.add(f);
            }
     this.coordp=CoordPossibles;
        return CoordPossibles;
    }

     /**
     *Vide la liste des Coordonnees possibles  
     * @param CoordPossibles
     */
 public void ViderCoordPossibles(){
        for (int j=0; j<4; j++){
            coordp.remove(j);
        }
    }

 /**
     *Vérifie si les coordonnées de déplacement du pion sont vraiment possibles (par exemple : si le déplacement souhaité est dans la grille ou s'il y a un pion de son équipe) 
     * @param joueur
     * @param CoordPossibles
     */
    public void VerifCoordPossible(Joueur joueur, ArrayList<Coord> CoordPossibles){
        for (int j=0; j<4; j++){
                Coord c = CoordPossibles.get(j);
                int a = c.coordonnees.get(0);
                int b =c.coordonnees.get(1);
                if (a<5){
                    if (b<5){
                        if (a>-1){
                            if (b>-1){
                                if(joueur.Couleur!=grille.grille[a][b].pion.couleur){
                                        grille.grille[a][b].pion.Gris();
                                }
                            }
                        }
                    }
                }
        }
    }

 
    
    public void noGris(){
        for (int i=0; i<taille;i++){
            for (int j=0; j<taille;j++){
                grille.grille[i][j].pion.noGris();
            }
        }
    }


 /**
     *Déplace le pion placé en paramètre aux coordonnées X et Y souhaitées 
     * @param Pion
     * @param X
     * @param Y
     */
    public void DeplacerPion(Pion Pion,int X,int Y){
       grille.grille[X][Y].pion.couleur = Pion.pion.couleur;
       grille.grille[X][Y].pion.roi = Pion.pion.roi;
    }

 /**
     *Remplace le pion par un pion blanc 
     * @param Pion
     */
    public void EnleverPion(PionConsole Pion){
        this.grille.grille[Pion.X][Pion.Y].pion = new PionConsole(Pion.X,Pion.Y,"white","non");
    }

 /**
     *Fonction condition de Victoire (roi mangé ou pion sous l'arche) 
     * @param joueur
     * @return
     */
    public int Victoire(Joueur joueur){
        if (joueur.PionsJ.get(2) == null){ 
            if (joueur==j1){
            return 1;
            }
            else {
                return 2;
            }
        }
        if (grille.grille[4][2].pion.roi == joueur.PionsJ.get(2).pion.roi){
            if (joueur==j1){
            return 1;
            }
            else {
                return 2;
            }
        }
        else {
            return 0;
        }
    }

 /**
     *Actualise la main du joueur en échangeant une carte donnée avec la carte située à l'indice spécifié.
     * @param carte
     * @param indice
     */
    public void ActualiserMain(CarteConsole carte,int indice){
        CarteConsole x = Main.get(2);
        System.out.println("oppcarte" +carte);
        System.out.println("oppCartemillieu" + Main.get(2));
        Main.set(indice,x);
        Main.set(2,carte);
        System.out.println("oppMain" + Main);
    }
}
