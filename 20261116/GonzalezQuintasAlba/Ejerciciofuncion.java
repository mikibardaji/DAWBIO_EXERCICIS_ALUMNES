/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class Ejerciciofuncion {


    public static boolean esDataCorrecta(int any, int mes, int dia) {
        if (any <= 0) {
            return false;
        }
        
        if (mes < 1 || mes > 12) {
            return false;
        }
        
        if (dia < 1 || dia > 30) {
            return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Validador de Dates ---");
        System.out.print("Introdueix l'any: ");
        int any = scanner.nextInt();

        System.out.print("Introdueix el mes (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Introdueix el dia: ");
        int dia = scanner.nextInt();

        if (esDataCorrecta(any, mes, dia)) {
            System.out.println("La data introduïda és **correcta**.");
        } else {
            System.out.println("La data introduïda **NO és correcta**.");
        }

        scanner.close();
    }
}
