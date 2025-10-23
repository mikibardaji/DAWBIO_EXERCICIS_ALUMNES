package Funciones;

import java.util.Scanner;

public class Ex4A2 {
        public static int obteSigne(int x) {
        if (x < 0) {
            return -1;
        } else if (x == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int num = teclado.nextInt();

        int signo = obteSigne(num);

        System.out.println("Resultado: " + signo);
}
}
