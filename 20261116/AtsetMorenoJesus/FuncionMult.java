/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionmult;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class FuncionMult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();
        multiplicacion(numero);
    }
    
   public static int pedirNumero() {
        Scanner lector = new Scanner(System.in);
        int num = 0;
        boolean valido = false;

        do {
            System.out.print("Dime un número para hacer la tabla de multiplicar de este: ");
            try {
                num = lector.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Tienes que escribir un número");
                lector.next();
            }
        } while (!valido);
        return num;
    }

    public static void multiplicacion(int numero) {
        int mult;
        for (int i = 1; i <= 10; i++) {
            mult = numero * i;
            System.out.println(numero + " x " + i + " = " + mult);
        }
    }
}

 
