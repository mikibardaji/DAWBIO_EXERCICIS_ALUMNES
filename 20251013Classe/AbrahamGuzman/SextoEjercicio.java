 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3.AbrahamGuzman;

import java.util.Scanner;

/**
 *
 * @author agu3018
 */
public class SextoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); 
        int errores = 0 ; 
        double tensionA; 
        
        for (int i = 1; i <= 5; i++) {
            
            System.out.println("Ingrese valores de tension no nulos");
            tensionA = sc.nextDouble();
            
            if(tensionA <= 0){
                errores++;
                System.out.println("Se ha detectado un valor no nulo ");
            }
            
        }
            
        if(errores > 0){
            System.out.println("Se encontraron valores no validos " +errores);
        }
        
    }
    
}
