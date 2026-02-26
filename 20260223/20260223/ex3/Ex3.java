/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

/**
 *
 * @author iso7500
 */
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int valor1 = rd.nextInt(1,101);
        int[ ] datos = new int[n];
        
        for (int i = 0; i < n; i++) {
            datos[i] = rd.nextInt(1,11);
        }
        
        System.out.print("Vector de tamany " + n + ".");
        
        int pos = 0;
        
        while (pos >= 0) {
            try {
                System.out.print("Quina posició vols buscar?: ");
                pos = entrada.nextInt();
                
                if (pos >= 0) {
                    System.out.println("En la " + pos + " hay un " + datos[pos]);
                }
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Aquesta posició no existeix.);
                e.printStackTrace();
            } catch (InputMismatchException e) {
                System.out.println("Error: Fica-hi un valoe enter. .");
                e.printStackTrace();           
            }
        }
    }
}
