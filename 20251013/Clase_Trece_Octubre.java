/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_trece_octubre;

import java.util.Random;

/**
 *
 * @author guill
 */
public class Clase_Trece_Octubre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        Random rd = new Random(); //creo un ramdon para hacer aleatoriedad
        double temperatura; // double para decimelas
        int contador=0; // contador para actualizar en 0 para empezar en 1

        do{ //hacer
            temperatura = 35 + rd.nextFloat(35, 46); 
            
            System.out.println("la Temperatura es: " + temperatura);
            contador ++;
        }while (temperatura<36.5);
        System.out.println("Han pasado:  "  + contador + "intentos.");
    }
}
    
    

