/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jocdedaus;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class JocDeDaus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random aleatori1 = new Random();
        Random aleatori2 = new Random();
        int numeroAleatori1 = aleatori1.nextInt(1,7);
        int numeroAleatori2 = aleatori2.nextInt(1,7);
        System.out.println("Juego de dados:\n"
                + "- Si en ambos dados sacas una suma igual a 7, no pierdes nada.\n"
                + "- Si salen los mismos números en ambos dados, se vuelve a tirar.\n"
                + "- Si en esta segunda tirada vuelven a salir los mismos números, triplicas la apuesta; si no, solo la duplicas.\n"
                + "- Si en la primera tirada no sacas una suma igual a 7 o los mismos números, pierdes la apuesta.");
        System.out.println("Cuanto quieres apostar?");
        int dinero = lector.nextInt();
        int sumaAl = numeroAleatori1 + numeroAleatori2;
        System.out.println("Ha salido un " + numeroAleatori1 + " y un " + numeroAleatori2);
        if (sumaAl == 7){
            System.out.println("Bravo! Has ganado " + dinero + " euros");
        } else if(numeroAleatori1 == numeroAleatori2){
             System.out.println("Números iguales, volvemos a tirar");
             Random aleatori3 = new Random();
             Random aleatori4 = new Random();
             int numeroAleatori3 = aleatori1.nextInt(1,7);
             int numeroAleatori4 = aleatori2.nextInt(1,7);
             System.out.println("Ha salido un: " + numeroAleatori3 + " y un " + numeroAleatori4);
             if (numeroAleatori3 == numeroAleatori4){
                 int triple = dinero*3;
                 System.out.println("Has triplicado el dinero!!!! Ahora tienes " + triple + " euros");
             } else {
                 int doble = dinero*2;
                 System.out.println("Has duplicado tu dinero!! Ahora tienes " + doble + " eruos");
            }
        }else {
            System.out.println("Has perdido todo tu dinero pringao");
        }
    }
    
}
