/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parellosenar;

import java.util.Random;

/**
 *
 * @author jat0264
 */
public class ParelloSenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatori = new Random();
        int numeroAleatori = aleatori.nextInt(1,101);
        if (numeroAleatori % 2 == 0) {
            System.out.println("Parell");
        }
        else {
            System.out.println("Senar");
        }
    }
    
}
