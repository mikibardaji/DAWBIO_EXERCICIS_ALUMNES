/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tercer.año;


import java.util.Scanner;

/**
 *
 * @author Jackson
 */
public class TercerAño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cajaRegistradora();

    }

    public static void cajaRegistradora() {

        Scanner sc = new Scanner(System.in);
        double DineroAñadir;
        double cajaregistradora = 0;

        do {
            System.out.println("Introduzca un precio para añadirlo a la caja registradora: ");

            String DineroInPut = sc.nextLine();
            if (DineroInPut == null || DineroInPut.isEmpty()) {
                System.err.println("Error: No se ha introducido ningun valor");
                System.out.println("Total Acumulado: " + cajaregistradora);
                break;
            }

            try {
                DineroAñadir = Double.parseDouble(DineroInPut);
            } catch (NumberFormatException e) {
                System.err.println("Error de formato. Operación cancelada por seguridad.");   
                System.out.println("Total Acumulado: " + cajaregistradora)
                break;
            }

            if (DineroAñadir > 0) {
                cajaregistradora += DineroAñadir;
            }

            if (DineroAñadir == 0) {
                System.out.println("Precio Final: " + cajaregistradora);
            }

        } while (DineroAñadir != 0);

    }
}
