/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici13condicionals;

import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class Exercici13Condicionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    char colorSemaforo;
    
    System.out.println("Que color esta el semaforo solo la letra (V-verde/A-Amarillo/R-Rojo): ");
    //Lee la qualificacion alfabetica una letra
    colorSemaforo = sc.next().toUpperCase().charAt(0);
   
    
    System.out.print("El semaforo dice que: ");
    
    switch(colorSemaforo){
        case 'V':
            System.out.println("Puedes pasar");
        break;
        
        case 'A':
            System.out.println("Tienes que esperar");
        break;
        
        case 'R':
            System.out.println("Tienes que detenerte");
        break;
        
        default:
            System.out.println("Color de semaforo no valido");
    }
    

    }
       
    
    
    
}
