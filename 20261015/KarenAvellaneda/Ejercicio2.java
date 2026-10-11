import java.util.Scanner;

import java.util.Random;

public class ejercicio2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        // Genera un número entre 0 y 1.
        int moneda = aleatorio.nextInt(2);

        if (moneda == 0) {
            System.out.println("Cara");
        } else {
            System.out.println("Creu");
        }
    }
}
