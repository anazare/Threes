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
    Coord boar1 =new Coord(0,1),boar2=new Coord(-1,0),boar3 = new Coord(0,-1);
    Coord cobra1 = new Coord(0,-1),cobra2 =new Coord(1,-1),cobra3=new Coord(1,1);
    Coord crab1 = new Coord(-2,0),crab2 =new Coord(2,0),crab3=new Coord(0,-1);
    Coord crane1 = new Coord(0,-1),crane2 =new Coord(1,1),crane3=new Coord(1,-1);
    Coord dragon1 = new Coord(1,-1),dragon2 =new Coord(1,1),dragon3=new Coord(-1,2),dragon4 = new Coord(-1,2);
    Coord eel1 = new Coord(1,-1),eel2 =new Coord(0,1),eel3=new Coord(-1,-1);
    Coord elephant1 = new Coord(0,-1),elephant2 =new Coord(0,1),elephant3=new Coord(-1,-1),elephant4 = new Coord(-1,1);
    Coord frog1 = new Coord(0,-2),frog2 =new Coord(-1,-1),frog3=new Coord(1,1);
    Coord goose1 = new Coord(0,1),goose2 =new Coord(0,-1),goose3=new Coord(-1,-1),goose4 = new Coord(1,1);
    Coord horse1 = new Coord(0,-1),horse2 =new Coord(1,0),horse3=new Coord(-1,0);
    Coord mantis1 = new Coord(1,0),mantis2 =new Coord(-1,-1),mantis3=new Coord(-1,1);
    Coord monkey1 = new Coord(1,-1),monkey2 =new Coord(1,1),monkey3=new Coord(-1,1),monkey4 = new Coord(-1,-1);
    Coord ox1 = new Coord(0,1),ox2 =new Coord(-1,0),ox3=new Coord(1,0);
    Coord rabbit1 = new Coord(1,-1),rabbit2 =new Coord(0,2),rabbit3=new Coord(-1,1);
    Coord rooster1 = new Coord(1,-1),rooster2 =new Coord(-1,1),rooster3=new Coord(0,1),rooster4 = new Coord(0,-1);
    Coord tiger1 = new Coord(-2,0),tiger2 =new Coord(1,0); 
    CarteConsole boat = new CarteConsole("boar",boar1,boar2,boar3,null);
    CarteConsole cobra = new CarteConsole("cobra",cobra1,cobra2,cobra3,null);
    CarteConsole crab = new CarteConsole("crab",crab1,crab2,crab3,null);
    CarteConsole crane = new CarteConsole("crane",crane1,crane2,crane3,null);
    CarteConsole dragon = new CarteConsole("dragon",dragon1,dragon2,dragon3,dragon4);
    CarteConsole eel = new CarteConsole("eel",eel1,eel2,eel3,null);
    CarteConsole elephant = new CarteConsole("elephant",elephant1,elephant2,elephant3,elephant4);
    CarteConsole frog = new CarteConsole("frog",frog1,frog2,frog3,null);
    CarteConsole goose = new CarteConsole("goose",goose1,goose2,goose3,goose4);
    CarteConsole horse = new CarteConsole("horse", horse1, horse2, horse3,null);
    CarteConsole mantis = new CarteConsole("mantis",mantis1,mantis2,mantis3,null);
    CarteConsole monkey = new CarteConsole("monkey",monkey1,monkey2,monkey3,monkey4);
    CarteConsole ox = new CarteConsole("ox",ox1,ox2,ox3,null);
    CarteConsole rabbit = new CarteConsole("rabbit",rabbit1,rabbit2,rabbit3,null);
    CarteConsole rooster = new CarteConsole("rooster",rooster1,rooster2,rooster3,rooster4);
    CarteConsole tiger = new CarteConsole("tiger",tiger1,tiger2,null,null);

    public Plateau() {
        this.j1 = new Joueur("blue");
        this.j2 = new Joueur("red");
        this.Main = new ArrayList<CarteConsole>();
        this.grille = new Grille(taille);
        initialiserPlateau();
        creerMain();
    }

    public void creerMain(){ 
        Random r = new Random();
        while (Main.size()<5){
            int a = r.nextInt(15);
            if (a==0){
                if (!Main.contains(boat)){
                    Main.add(boat);
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
    
    public void initialiserPlateau(){
        for (int j=0; j<taille;j++){
            if(j!=2){
                grille.grille[j][0].addPion(0,j,"blue","non");
                PionConsole Pion1 = new PionConsole(0,j,"blue","non");
                j1.PionsJ.add(Pion1);
            }
            else{
                grille.grille[j][0].addPion(0,j,"blue","oui");
                PionConsole Roi1 = new PionConsole(0,j,"blue","oui");
                j1.PionsJ.add(Roi1);
            }
        }
        
         for (int j=0; j<taille;j++){
            if(j!=2){
                grille.grille[j][4].addPion(4,j,"red","non");
                PionConsole Pion2 = new PionConsole(0,j,"red","non");
                j2.PionsJ.add(Pion2);
            }
            else{
                grille.grille[j][4].addPion(4,j,"red","oui");
                PionConsole Roi2 = new PionConsole(0,j,"red","oui");
                j2.PionsJ.add(Roi2);
            }
        }
        creerMain();
    }
    
    public ArrayList<Coord> CoordPossible(Coord Coordi, CarteConsole Carte){
        Coord f = null;
        ArrayList<Coord> CoordPossibles = null;
        for (int j=0; j<2; j++){
            for (int i=0; i<4; i++){
                for (int x = 0; x < 2; x++) {
                     Coord c = Carte.deplacementAutorise.get(i);
                     int plus = Coordi.coordonnees.get(x) + c.coordonnees.get(x);
                     f.coordonnees.add(plus);
                }
                CoordPossibles.add(f);
            }
        }
        return CoordPossibles;
    }
    
    public void VerifCoordPossible(Joueur joueur, ArrayList<Coord> CoordPossibles){
        for (int j=0; j<CoordPossibles.size(); j++){
                Coord c = CoordPossibles.get(j);
                int a = c.coordonnees.get(0);
                int b =c.coordonnees.get(1);
                CaseConsole cc = grille.grille[a][b];
                if (a > 5) {
                    if (b > 5) {
                    }
                }
                if (cc.etat == true) {
                    String Color1 = joueur.Couleur;
                    PionConsole pioncase = cc.pion;
                    String Color2 = pioncase.couleur;
                    if (Color1 != Color2) {
                    }
                }
                else {
                grille.grille[a][b].Gris();
                }
        }
    }
    
    public void DeplacerPion(PionConsole Pion,int X,int Y,Joueur Joueur2){
        grille.grille[X][Y].SuppPion();
        Joueur2.PionsJ.remove(grille.grille[X][Y].pion);
        grille.grille[X][Y].addPion(Pion.X,Pion.Y, Pion.couleur, Pion.roi);
    }
    
    public boolean Victoire(Joueur joueur){
        if (joueur.PionsJ.get(2) == null){ 
            return true;
        }
        if (grille.grille[5][3].pion == joueur.PionsJ.get(4)){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void ActualiserMain(Joueur joueur,CarteConsole carte,int indice){
        CarteConsole x = Main.get(3);
        joueur.MainJ.set(indice,x);
        Main.set(3,carte);
    }
}
