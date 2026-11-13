/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexmodular10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dylan Santamaria
 */
public class DSMExModular10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 10. Programa que demana a l’usuari una data (any, mes, dia) i informa de si és o no correcta. 
        // Per simplificar, suposarem que tots els mesos tenen 30 dies. Cal implementar un mètode que rebi les dades i retorni un booleà.
        Scanner lector = new Scanner(System.in);
        int dia, mes, año;
        boolean resultado;

        try {
            System.out.println("Introdueix una data i et dire si es veritat (pensant en que es una data de naixament).");
            System.out.print("Quin dia? ");
            dia = lector.nextInt();
            System.out.print("Quin mes? ");
            mes = lector.nextInt();
            System.out.print("Quin any? ");
            año = lector.nextInt();
            resultado = comprobantData(dia, mes, año);

            if (resultado == false) {
                System.out.println("La data es incorrecta.");
            } else {
                System.out.println("La data es correcta!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Ha de posar numeros enters.");
        }

    }

    public static boolean comprobantData(int dia, int mes, int año) {
        boolean resultado = true;

        if (dia > 30 || dia < 1) {
            resultado = false;
            return resultado;
        }
        if (mes > 12 || mes < 1) {
            resultado = false;
            return resultado;
        }
        if (año < 1900 || año > 2026) {
            resultado = false;
            return resultado;
        }

        return resultado;
    }

}
