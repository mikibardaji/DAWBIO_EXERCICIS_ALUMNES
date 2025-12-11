import objectes.*;

import java.util.Random;
import java.util.Scanner;

public class joc {
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    System.out.println("Quin és el teu nom?");
    String nom = sc.nextLine();
    System.out.println("En quina dificultat vols jugar?");
    System.out.println("Fàcil o Dificil");
    String dificultat=sc.nextLine().toLowerCase();
    jugador j1 =new jugador(nom);
    if (dificultat=="dificil"){
        //no s'ha de fer
    }
    else{
    
    do{
    jugar(j1);

    }while (j1.getEnergia()>0);
    
    }
    
    System.out.println("Has recorregut "+j1.getDistanciaAcumulada());
    System.out.println("Has obtingunt una puntuació de  "+j1.getPuntuacio());
    System.out.println("Has esgotat la teva energia ");

    System.out.println("     _.--\"\"--._");
    System.out.println("    /  _    _  \\");
    System.out.println(" _ (  (_\\  /_) )  _");
    System.out.println("{ \\._\\   /\\   /_./ }");
    System.out.println("/_\"=-.}______{.-\"=_\\");
    System.out.println(" _  _.=(\"\"\"\")=._  _");
    System.out.println("(_'\"_.-\"`~~`\"-._\"'_)");
    System.out.println(" {_\"            \"_}");
    

    }
    public static void jugar(jugador j1){
    Random rd= new Random();
    j1.correr();
    if (rd.nextBoolean()==true){ //llançem un boolea per veure si es troba o no un objecte
        obstacle o =new obstacle();
        j1.xocarObstacle(o);
    }
    if (rd.nextBoolean()==true){ //llançem un boolea per veure si es troba o no moneda
        moneda m =new moneda();
        j1.recollirMoneda(m);
    }


    }

}
