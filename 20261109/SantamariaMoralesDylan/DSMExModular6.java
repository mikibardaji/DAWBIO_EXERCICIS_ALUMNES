/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexmodular6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExModular6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.Programa que demana a l’usuari dos números enters i diu si són iguals o, cas que no ho siguin, quin és el valor del més gran. 
        // Ha d’implementar un mètode amb el prototip int compara(int x, int y) que retorna -1, 0, +1 segons que x sigui més petit, igual o major que y.
        Scanner lector = new Scanner(System.in);
        try {
            System.out.print("Escriu el primer nombre enter: ");
            int x = lector.nextInt();
            System.out.print("Escriu el segon nombre enter: ");
            int y = lector.nextInt();

            int resultat = compara(x, y);
            
            if (resultat == 1){
                System.out.println("El valor " + x + " es el més gran.");
            }
            else if (resultat == 0){
                System.out.println("Els dos valors valen el mateix: " + x + " .");
            }
            else{
                System.out.println("El valor " + y + " es el més gran.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Introdueix nombres enters.");
        }

    }

    public static int compara(int x, int y) {
        if (x == y) {
            return 0;
        } else if (x < y) {
            return -1;
        } else {
            return 1;
        }
    }

}
