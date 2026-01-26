package objetos;

import java.util.Random;

public class 2E {

    public static void main(String[] args) {

        int[] numeros = new int[20];

        rellenarAleatorios(numeros);
        contarYMostrar(numeros);
    }

    public static void rellenarAleatorios(int[] numeros) {
        Random rd = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rd.nextInt(-50, 101);
        }
    }

    public static void contarYMostrar(int[] numeros) {

        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);

            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            }
        }

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
    }
}

