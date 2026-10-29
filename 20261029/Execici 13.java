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
        System.out.println("He pensat un número del 1 al 100, a veure si l'endivines.");
        int numUsuari;
        int intents = 0;
        do {
            System.out.println("");
            System.out.print("Introdueix la teva predicció: ");
            numUsuari = lector.nextInt();
            if (numMaquina < numUsuari && numUsuari <= 100) {
                System.out.println("Massa gran, prova un més petit");
            } else if (numUsuari > 100) {
                System.out.println("T'has passat massa, ha de ser un número fins a 100 com a máxim.");
            } else if (numUsuari < numMaquina && numUsuari >= 1) {
                System.out.println("Massa petit, prova un més gran");
            } else if (numUsuari < 1) {
                System.out.println("Molt petit, ha de ser un número entre 1 i 100.");
            }
            intents ++;
            
        } while (numMaquina != numUsuari);
        
        System.out.println("");
        System.out.println("Has encertat! Era " + numMaquina + ".");
        if(intents==1) {
            System.out.println("Etss un béstia, ho has encertat a la primera");
        } else {
            System.out.println("Has necessitat " +intents +" intents.");
        }
        

    }

}
