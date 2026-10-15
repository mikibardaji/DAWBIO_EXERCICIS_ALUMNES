/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleatoriotodo;

import java.util.Random;

/**
 *
 * @author jat0264
 */
public class AleatorioTodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatori = new Random();
        int numeroAleatori = aleatori.nextInt(1,7);
        if (numeroAleatori == 1){
            System.out.println("Que mala suerte!");
        }
        else if(numeroAleatori == 6){
            System.out.println("Has sacado un 6!");
        }
        else {
            System.out.println("Has sacado un: " + numeroAleatori);
        }
    }
    
}
