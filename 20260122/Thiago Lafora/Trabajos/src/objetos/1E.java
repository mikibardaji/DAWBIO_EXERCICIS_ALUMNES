package objetos;

import java.util.Scanner;

public class 1E {

    public static void main(String[] args) {

        double[] numeros = new double[10];

        introducirDatos(numeros);
        mostrarArrayYExtremos(numeros);
    }

    public static void introducirDatos(double[] numeros) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + ": ");
            numeros[i] = sc.nextDouble();
        }
    }

    public static void mostrarArrayYExtremos(double[] numeros) {

        double minimo = numeros[0];
        double maximo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);

            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }

            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        System.out.println("El valor mínimo es: " + minimo);
        System.out.println("El valor máximo es: " + maximo);
    }
}
