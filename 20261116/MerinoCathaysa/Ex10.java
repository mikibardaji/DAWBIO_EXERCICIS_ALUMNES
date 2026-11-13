/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10;

import java.util.Scanner;

/**
 *
 * @author Cathy
 */
public class Ex10 {

    /**
     * Programa que demana a l’usuari una data (any, mes, dia) i informa de si
     * és o no correcta. Per simplificar, suposarem que tots els mesos tenen 30
     * dies. Cal implementar un mètode que rebi les dades i retorni un
     * booleà.Programa que demana a l’usuari una data (any, mes, dia) i informa
     * de si és o no correcta. Per simplificar, suposarem que tots els mesos
     * tenen 30 dies. Cal implementar un mètode que rebi les dades i retorni un
     * booleà.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia, mes, anyo;

        do {
            System.out.println("Introduce el día:");
            dia = sc.nextInt();

            System.out.println("Introduce el mes:");
            mes = sc.nextInt();

            System.out.println("Introduce el año:");
            anyo = sc.nextInt();

        } while (!validarFecha(dia, mes, anyo));
        System.out.println("Fecha correcta.");
    }

    public static boolean validarFecha(int dia, int mes, int anyo) {

        boolean fechaCorrecta = true;

        if (dia > 30 || dia < 1) {
            fechaCorrecta = false;
            System.out.println("Día no válido, ha de ser del 1 al 30.");
        }
        if (mes > 12 || mes < 1) {
            fechaCorrecta = false;
            System.out.println("Mes no válido, ha de ser del 1 al 12.");
        }
        if (anyo != 2026) {
            fechaCorrecta = false;
            System.out.println("Año no válido, no hemos viajado en el tiempo.");
        }

        return fechaCorrecta;
    }
}
