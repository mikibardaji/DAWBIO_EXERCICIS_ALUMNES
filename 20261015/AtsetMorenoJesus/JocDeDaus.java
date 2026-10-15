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
        Random aleatori = new Random();
        int numeroAleatori1 = aleatori.nextInt(1,7);
        int numeroAleatori2 = aleatori.nextInt(1,7);
        System.out.println("""
                           Juego de dados:
                           - Si en ambos dados sacas una suma igual a 7, no pierdes nada.
                           - Si salen los mismos n\u00fameros en ambos dados, se vuelve a tirar.
                           - Si en esta segunda tirada vuelven a salir los mismos n\u00fameros, triplicas la apuesta; si no, solo la duplicas.
                           - Si en la primera tirada no sacas una suma igual a 7 o los mismos n\u00fameros, pierdes la apuesta.""");
        System.out.println("Cuanto quieres apostar?");
        int dinero = lector.nextInt();
        int sumaAl = numeroAleatori1 + numeroAleatori2;
        System.out.println("Ha salido un " + numeroAleatori1 + " y un " + numeroAleatori2);
        if (sumaAl == 7){
            System.out.println("Bravo! Has ganado " + dinero + " euros");
        } else if(numeroAleatori1 == numeroAleatori2){
             System.out.println("Números iguales, volvemos a tirar");
             int numeroAleatori3 = aleatori.nextInt(1,7);
             int numeroAleatori4 = aleatori.nextInt(1,7);
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
