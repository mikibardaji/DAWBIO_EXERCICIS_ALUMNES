package objetos;

import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        boolean terminar = true;
        char letra;
        while (terminar == true) {
            System.out.println("");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor.");
            System.out.println("c. Salir.");

            letra = sc.nextLine().charAt(0);

            if (letra == 'a') {
                Mostrar(numeros);
            }
            else if (letra == 'b') {
                introducir(numeros);
            }
            else if (letra == 'c') {
                terminar = false;
            }

        }
        
    }

    public static void Mostrar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }

    public static void introducir(int[] numeros) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el numero a introducir");
        int intro = sc.nextInt();

        System.out.println("Dime la posicion en la que lo vas a introducir (1 - 10)");
        int posi = sc.nextInt();
        posi -= 1;
        if (numeros[posi] != 0) {
            System.out.println("Ya hay un numero guardado en esa posicion");
            System.out.println("Seguro que quieres sobreescribir? si = s / no = n ");
            
            char conf = sc.nextLine().charAt(0);

            if (conf == 's') {
                numeros[posi] = intro;
            }
            else {
                System.out.println("No se va a sobreescribir");
            }
        }
        else {
            numeros[posi] = intro;
        }
    }
}
