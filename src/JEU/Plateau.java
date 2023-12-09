/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JEU;

import java.util.ArrayList;

/**
 *
 * @author redou
 */
public class Plateau {
    int taille = 5;
    CaseConsole[][] grille;
    ArrayList<CarteConsole> carteP;
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
   

    public Plateau(int taille,  CaseConsole[][] grille) {
        this.taille = taille;
        grille = new CaseConsole[taille][taille];
        for (int i=0; i<taille;i++){
            for (int j=0; j<taille;j++){
                grille[i][j] =new CaseConsole(false);
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
    }
}
