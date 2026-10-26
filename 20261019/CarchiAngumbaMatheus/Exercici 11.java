/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

import java.util.Scanner;

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
        float mesuresTemperatura;
        String nom = "";
        System.out.print("Introdueix el nom del pacient: ");
        nom = lector.next();
        System.out.print("Introdueix la temperatura corporal: ");
        mesuresTemperatura = lector.nextFloat();
        while (mesuresTemperatura<30 || mesuresTemperatura>40){
            System.out.println("Temperatura no vàlida. Torna-ho a provar.");
            System.out.print("Introdueix la temperatura corporal: ");
            mesuresTemperatura = lector.nextFloat();
        }
        System.out.println("Pacient registrat: "+nom+", "+ mesuresTemperatura + " ºC" );


    }

}
