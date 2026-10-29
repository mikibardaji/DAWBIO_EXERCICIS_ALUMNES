/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author DIEGO ESTUDIOS
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int taula;
        int i;

        // Recorrem les taules de l'1 al 9
        for (taula = 1; taula <= 9; taula++) {
            System.out.println("Taula del " + taula);

            // Recorrem els números de l'1 al 10
            for (i = 1; i <= 10; i++) {
                System.out.println(taula + " x " + i + " = " + taula * i);
            }

            System.out.println();
        }
    }
}
