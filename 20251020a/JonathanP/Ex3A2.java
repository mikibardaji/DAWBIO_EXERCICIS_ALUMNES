package Funciones;

import java.util.Scanner;

public class Ex3A2 {
    
        public static int menor(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Introduce el primer número entero: ");
        int num1 = entrada.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = entrada.nextInt();

     
        int resultado = menor(num1, num2);

        System.out.println("El número menor es: " + resultado);
}
}
