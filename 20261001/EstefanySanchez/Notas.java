/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;

import java.util.Scanner;

/**
 *
 * @author esa7092
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        System.out.println("Diga el nombre:");
        String nom = lector.next();
        System.out.println("Tu nombre es:" + nom);
        System.out.println("nota: A/B/C/D/F/G/H");
        
        char calif = lector.next().charAt(0);
        
        switch(calif){
            case 'A':
                System.out.println("excelente");
                break;
            case 'B':
            case 'C': 
                System.out.println("bien");
                break;
            case 'D':
                System.out.println("Aprobado");
               
                break;
            case 'E':
                System.out.println("Insuficiente");
                break;
            case 'F':
                System.out.println("vuelve a intentar");
                break;
            default:
                System.out.println("Calificacion no valida");
                   
        
    }
        
        
        
         
     
     
     
      
        
        
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
