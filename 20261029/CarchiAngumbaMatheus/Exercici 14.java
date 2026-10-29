/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author mca3765
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random aleatori = new Random();
        int numMaquina = aleatori.nextInt(1, 101);
        System.out.println("Pensa un número del 1 al 100, a veure si l'endivino.");
        int numUsuari;
        int intents = 0;
        char veredicte = 'O';
        boolean charIncorrecte = true;
        int limitSuperior =101;
        int limitInferior =1;
        int mentida=0;
        do {
            System.out.println("El meu número es: "+numMaquina);
            while (charIncorrecte == true) {
                System.out.println("Indica si el teu número es major, menor o igual:");
                System.out.println("Major (+) | Menor (-) | Igual (=)");
                veredicte = lector.next().charAt(0);
                intents++;
                System.out.println("");
                switch (veredicte) {
                    case '+':
                        limitInferior = numMaquina+1;
                        numMaquina = aleatori.nextInt(limitInferior,limitSuperior);
                        charIncorrecte = false;
                        break;
                    case '-':
                        limitSuperior = numMaquina;
                        numMaquina = aleatori.nextInt(limitInferior,limitSuperior);                   
                        charIncorrecte = false;
                        break;
                    case '=':
                        charIncorrecte = false;
                        break;
                    default:
                        System.out.println("Introdueix un dels carácters válids");
                        intents--;
                        break;
                }
            }
            System.out.println("Entesos, pensant en un numero entre " + limitInferior+ " - "+ (limitSuperior-1) );
            if (limitInferior==limitSuperior || limitInferior>=100 || limitSuperior<=1){
                if (mentida>1) {
                    System.out.println("No pot ser... En algo m'estás mentint");
                    veredicte = '=';    
                }
            }
            charIncorrecte = true;
        } while (veredicte != '=');
        System.out.println("He encertat!! El teu número era: "+numMaquina );
        System.out.println("He trigat " +intents+ " intents válids.");
    }
}
