/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;
import java.util.Scanner;
/**
 *
 * @author bca5802
 */
public class ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cuantos euros tienes? ");
        double euros = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("a - Dolar");
        System.out.println("b - Libra");
        System.out.println("c - Yen");

        System.out.print("Esperando opción: ");
        char opcion = teclado.nextLine().charAt(0);

        switch (opcion) {
            case 'a':
                System.out.println("Dolares: " + (euros * 1.17));
                break;

            case 'b':
                System.out.println("Libras: " + (euros * 0.87));
                break;

            case 'c':
                System.out.println("Yenes: " + (euros * 172.00));
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
}
