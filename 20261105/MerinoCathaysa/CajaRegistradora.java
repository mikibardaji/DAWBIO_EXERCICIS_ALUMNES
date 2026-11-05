/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajaregistradora;

import java.util.Scanner;

/**
 *
 * @author Cathy
 */
public class CajaRegistradora {

    /**
     * Exercici 2: Caixa Registradora amb Bloqueig de Seguretat Escriu un
     * programa en Java per a una caixa registradora que sumi els preus dels
     * productes que l'usuari va introduint per consola.
     *
     * Per demanar el número, no ho farem amb nextDouble(). S'ha de demanar amb
     * nextLine() i transformar el String amb la instrucció
     * Double.parseDouble(entrada).
     *
     * Ús d'un bucle: El programa ha de demanar preus (double) i anar-los sumant
     * a un total. El bucle funcionarà normalment mentre no s'introdueixi un 0.
     * Condició de sortida normal: Si l'usuari introdueix un 0, el bucle
     * finalitza correctament i es mostra el total de la compra. Captura
     * d'excepcions i sortida forçada: Si l'usuari fica un text no vàlid (per
     * exemple, "gratis" o "hola"), el programa ha de capturar l'excepció
     * NumberFormatException. En aquest moment, s'ha de mostrar un missatge
     * crític ("Error de format. Operació cancel·lada per seguretat.") i el
     * bucle s'ha d'interrompre. Resultat final: Tant si el bucle acaba
     * normalment (amb un 0) com si es trenca per l'excepció, el programa ha de
     * mostrar el total acumulat fins a aquell moment.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String precio;
        double precioTransf, total = 0;

        try {

            do {
                System.out.println("Dime el precio del producto:");
                precio = sc.nextLine();

                precioTransf = Double.parseDouble(precio);
                total = precioTransf + total;
                
            } while (precioTransf != 0);
            
        } catch (NumberFormatException e) {
            System.out.println("Error de formato. Operación cancelada por seguridad.");
        }

        System.out.println("Precio total: " + total);

    }

}
