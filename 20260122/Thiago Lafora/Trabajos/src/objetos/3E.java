package objetos;

import java.util.Random;

public class 3E {

    public static void main(String[] args) {

        int[] numeros = new int[20];

        generarAleatorios(numeros);
        sumarYMostrar(numeros);
    }

    public static void generarAleatorios(int[] numeros) {
        Random rd = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rd.nextInt(-50, 101);
        }
    }

    public static void sumarYMostrar(int[] numeros) {

        int sumaPositivos = 0;
        int sumaNegativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);

            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
            }
        }

        System.out.println("Suma de valores positivos: " + sumaPositivos);
        System.out.println("Suma de valores negativos: " + sumaNegativos);
    }
}
