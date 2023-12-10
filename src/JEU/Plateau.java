/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JEU;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

/**
 *
 * @author redou
 */
public class Plateau {
    int taille = 5;
    CaseConsole[][] grille;
    ArrayList<CarteConsole> Main;
    Coord nulle = new Coord(0,0),boar1 =new Coord(0,1),boar2=new Coord(-1,0),boar3 = new Coord(0,-1);
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
    CarteConsole boat = new CarteConsole("boar",boar1,boar2,boar3,nulle);
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

    public Plateau(int taille,  CaseConsole[][] grille) {
        this.taille = taille;
        grille = new CaseConsole[taille][taille];
        for (int i=0; i<taille;i++){
            for (int j=0; j<taille;j++){
                grille[i][j] =new CaseConsole();
            }
        }
            
    }
    
    public void creerMain(){ 
        Random r = new Random();
        while (Main.size()<5){
            int a = r.nextInt(15);
            if (a==0){
                Main.add(boat);
            }
            if (a==0){
                Main.add(cobra);
            }
            if (a==0){
                Main.add(crab);
            }
            if (a==0){
                Main.add(crane);
            }
            if (a==0){
                Main.add(dragon);
            }
            if (a==0){
                Main.add(eel);
            }
            if (a==0){
                Main.add(elephant);
            }
            if (a==0){
                Main.add(frog);
            }
            if (a==0){
                Main.add(goose);
            }
            if (a==0){
                Main.add(horse);
            }
            if (a==0){
                Main.add(mantis);
            }
            if (a==0){
                Main.add(monkey);
            }
            if (a==0){
                Main.add(ox);
            }
            if (a==0){
                Main.add(rabbit);
            }
            if (a==0){
                Main.add(rooster);
            }
            if (a==0){
                Main.add(tiger);
            }
        }
    }
    
    public void initialiserPlateau(){
        for (int j=0; j<taille;j++){
            if(j!=2){
                grille[0][j].addPion(0,j,"blue",false);
            }
            else{
                grille[0][j].addPion(0,j,"blue",true);
            }
        }
        
         for (int j=0; j<taille;j++){
            if(j!=2){
                grille[0][j].addPion(4,j,"red",false);
            }
            else{
                grille[0][j].addPion(4,j,"red",true);
            }
        }
        creerMain();
    }
    
    public ArrayList<Coord> CoordPossible(Coord Coordi, CarteConsole Carte){
        Coord f = null;
        ArrayList<Coord> CoordPossibles = null;
        for (int j=0; j<2; j++){
            for (int i=1; i<5; i++){
                for (int x = 0; x < 2; x++) {
                    Coord c = Carte.get(x);
                     int plus = Coordi.coordonnees.get(x) + c.coordonnees.get(x);
                     f.coordonnees.add(plus);
                }
                CoordPossibles.add(f);
            }
        }
        return CoordPossibles;
    }
    
    public void Verif(ArrayList<Coord> CoordPossibles){
        for (Coord in CoordPossibles ){
            if (Coord.coordonnees.get(0)>5){
                if (Coord.coordonnees.get(1)>5){
                    break;
                }
            }
            else{
                grille[Coord.coordonnees.get(0)][Coord.coordonnees.get(1)].Gris;
            }
        }
    }
}
