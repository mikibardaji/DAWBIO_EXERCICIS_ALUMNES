/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exmillesametres;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class ExMillesaMetres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double metres, milles;
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un valor en millas náuticas y se hará la conversión a metros");
        milles = lector.nextDouble();
        metres = milles*1852;
        System.out.println("Total metros: " + metres);
        // TODO code application logic here
    }
    
}
