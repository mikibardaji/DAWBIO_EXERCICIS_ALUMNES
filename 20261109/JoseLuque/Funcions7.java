/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions7;

import java.util.Scanner;

/**
 *
 * @author jlu1859
 */
public class Funcions7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner lector = new Scanner(System.in);
        System.out.println("Entra un numero: ");
        float preu = lector.nextFloat();
        System.out.println(preuAmbIva(preu));
    }
 public static float preuAmbIva(float preu){
     float preuAmbIva = (float) (preu * 1.21); 
     return preuAmbIva;
 }
}
