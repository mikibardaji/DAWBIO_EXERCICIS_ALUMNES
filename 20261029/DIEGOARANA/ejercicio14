/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESTUDIOS
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner teclat = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int proposta;
        int resposta;
        int intents = 0;

        System.out.println("Pensa un número de l'1 al 100.");

        do {
            // L'ordinador proposa el número del mig
            proposta = (min + max) / 2;
            intents++;

            System.out.println("És el " + proposta + "?");
            System.out.println("1 = el meu número és més gran");
            System.out.println("2 = el meu número és més petit");
            System.out.println("3 = és igual, l'has encertat");
            resposta = teclat.nextInt();

            if (resposta == 1) {
                // Si és més gran, descartem els números menors
                min = proposta + 1;
            } else if (resposta == 2) {
                // Si és més petit, descartem els números majors
                max = proposta - 1;
            }
        } while (resposta != 3);

        System.out.println("L'he encertat en " + intents + " intents!");
    }
}
