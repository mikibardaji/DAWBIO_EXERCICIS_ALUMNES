/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package importeuro;

import java.util.Scanner;

/**
 *
 * @author esa7092
 */
public class ImportEuro {

    /**
     * 14. Desarrolle un programa que entre un importe en euros, 
     * muestre un menú con diferentes monedas, lea el nombre de la moneda y 
     * muestre la conversión a la moneda escogida.
     */
    public static void main(String[] args) {
        // declaramos variables
        
        Scanner teclado = new Scanner(System.in);
        double euros;
        char opcion;
        
        
        System.out.print("¿Cuántos euros tienes? ");
        euros = teclado.nextDouble();

        System.out.println("a - Dólar");
        System.out.println("b - Libra");
        System.out.println("c - Yen");

        System.out.print("Esperando opción: ");
        opcion = teclado.next().toLowerCase().charAt(0);

        switch (opcion) {

            case 'a':
                double dolares = euros * 1.10;
                System.out.println(euros + " € son " + dolares + " dólares.");
                break;

            case 'b':
                double libras = euros * 0.86;
                System.out.println(euros + " € son " + libras + " libras.");
                break;

            case 'c':
                double yenes = euros * 160;
                System.out.println(euros + " € son " + yenes + " yenes.");
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }

}
    

