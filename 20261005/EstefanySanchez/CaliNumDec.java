/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calinumdec;
import java.util.Scanner;

/**
 *
 * @author esa7092
 */
public class CaliNumDec {
    /**
     * 9. Programa que lee una calificación numérica decimal x entre 0 y 10 y 
     * la transforma en calificación alfabética, escribiendo el resultado.
    0<=x<3 Muy Deficiente
    3<=x<5 Insuficiente
    5<=x<6 Suficiente
    6<=x<7 Bien
    7<=x<9 Notable
    9<=x<=10 Excelente
     * 
     * 
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        //declaramos variables
        Scanner lector = new Scanner(System.in);
        double x;
      
        
       //escribimos
        System.out.println("calificacion: ");
        x = lector.nextDouble();
        
       //else if else
       if(x <= 0 && x <3){
           System.out.println("Muy deficiente: ");
       }else if(x <=3 && x < 5){
           System.out.println("Insuficiente: ");
       }else if (x <= 5 && x <6){
           System.out.println("Suficiente: ");
       }else if(x <= 6 && x < 7){
           System.out.println("Bien: ");
       }else if (x <=7 && x < 9){
           System.out.println("Notable:");
       }else if(x <= 9 && x <= 10){
           System.out.println("Exelente");
       
       
       
       //corregir
       
       
               
       }
        
    
    
    
    
    
    
    }
    
}
