/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2;

import java.util.Scanner;

/**
 * Llegeix una distància en milles marines i la converteix a metres.
 * Llega una distancia a miles marinas y la convierte a metros.
 * @author esa7092
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // comentario de una linea
        
        final double MILLES_A_METRES = 1852;  //factor conversió constant final quiere decir que realmente es un aconstante
         
        Scanner lector = new Scanner(System.in);
        
        
       // leer distancia en millas
        System.out.println("Entra la distancia en millas: ");
        double distanciaEnMillas = lector.nextDouble();
        
      //calcular conversión de milles a metros
      double distanciaEnMetros = 
              distanciaEnMillas * MILLES_A_METRES;
      
      //IMPRIMIR RESULTADO AL USUARIO
        System.out.println(distanciaEnMillas + "millas equivalen a " + distanciaEnMetros + "metros");
         
        
        
         
        
    }
    
}
  