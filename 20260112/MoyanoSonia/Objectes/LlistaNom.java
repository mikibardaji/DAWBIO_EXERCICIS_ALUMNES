package Objectes;
import java.util.Random;

public enum LlistaNom {

PIKACHU, CHARIZARD, BULBASAUR, SQUIRTLE,  JIGGLYPUFF;

public static LlistaNom nomAleatori() {
    LlistaNom[] valors = LlistaNom.values();
    Random rd = new Random();
    return valors[rd.nextInt(valors.length)];
    }
}