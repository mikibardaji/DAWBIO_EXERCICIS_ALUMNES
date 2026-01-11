import java.util.Random;

import Objectes.*;


public class AppPokemon {
    
    public static void main(String[] args)  {

        int i=0; //comptador de rondes de lluita
        Aigua aig1 = new Aigua(LlistaNom.nomAleatori());
        System.out.println("Nom " + aig1.getNom());
        Electric el1 = new Electric(LlistaNom.nomAleatori());
        System.out.println("Nom " + el1.getNom());
        Veri ver1 = new Veri(LlistaNom.nomAleatori());
        System.out.println("Nom " + ver1.getNom());
        Veri ver2 = new Veri();
        System.out.println("Nom " + ver2.getNom());

    Random rd=new Random();
        int pokeball= rd.nextInt(0,4);

    Pokemon p1 = null;
    Pokemon p2 = null;

        switch (pokeball) {
        case 0 -> p1 = aig1;
        case 1 -> p1 = el1;
        case 2 -> p1 = ver1;
        case 3 -> p1 = ver2;
}
    pokeball= rd.nextInt(0,3);

    switch (pokeball) {
        case 0 -> p2 = aig1;
        case 1 -> p2 = el1;
        case 2 -> p2 = ver1;
        case 3 -> p2 = ver2;
    }
    if (p1.getNom().equals(p2.getNom())) {
    System.out.println("El Pokemon no pot lluitar contra si mateix");
    }
    else{
    do{
    i++;
    System.out.println(" ");
    System.out.println("-------------Ronda " + i+"-----------------");
    p2.rebreImpacte(p1);
    p1.mostrarEstatPokemon();
    p1.rebreImpacte(p2);
    p2.mostrarEstatPokemon();
    }while(p1.isViu()&&p2.isViu());
    }
}


    }
