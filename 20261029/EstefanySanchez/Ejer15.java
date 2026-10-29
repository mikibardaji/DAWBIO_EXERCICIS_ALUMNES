/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer15;

/**
 *
 * @author Estefany.SS
 */
public class Ejer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // Bucle externo: recorre las tablas del 1 al 9
        for (int i = 1; i <= 9; i++) {
            System.out.println("===========================");
            System.out.println("   TABLA DEL " + i);
            System.out.println("===========================");

            // Bucle interno: multiplica del 1 al 10 para cada tabla
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                
                // Opción alternativa sin usar format:
                System.out.println(i + " x " + j + " = " + resultado);
            }
            System.out.println(); // Línea en blanco entre tablas
        }
    }
}
    

