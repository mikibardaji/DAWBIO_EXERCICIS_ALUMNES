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
        float mesuresTemperatura = 0;
        float totalBatecs = 0;
        int intents = 0;
        do {
            System.out.println("Pulsa per obtenir una mesura de temperatura");
            lector.nextLine();
            mesuresTemperatura = aleatori.nextFloat(35, 46);
            System.out.printf("Temperatura: %.1f%n", mesuresTemperatura);
            intents++;
        }while (mesuresTemperatura <=40.5);
        
        System.out.println("Han calgut "+intents+ " intents");

    }

}
