/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caraocruz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class CaraOCruz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatori = new Random();
        int numeroAleatori = aleatori.nextInt(2);
        if(numeroAleatori == 1){
            System.out.println("Cruz");
        }
        else {
            System.out.println("Cara");
        }
    }
    
}
