
package ejer10;

import java.util.Scanner;

public class Ejer10 {

    // Metodo que comprueba si la fecha es correcta
    public static boolean fechaCorrecta(int any, int mes, int dia) {

        // Comprobamos si el año, mes y dia son correctos
        if (any > 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= 30) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Creamos el Scanner para leer los datos
        Scanner entrada = new Scanner(System.in);

        // Pedimos el año
        System.out.print("Introduce el año: ");
        int any = entrada.nextInt();

        // Pedimos el mes
        System.out.print("Introduce el mes: ");
        int mes = entrada.nextInt();

        // Pedimos el dia
        System.out.print("Introduce el dia: ");
        int dia = entrada.nextInt();

        // Comprobamos si la fecha es correcta
        if (fechaCorrecta(any, mes, dia)) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha no es correcta.");
        }


    }
}
