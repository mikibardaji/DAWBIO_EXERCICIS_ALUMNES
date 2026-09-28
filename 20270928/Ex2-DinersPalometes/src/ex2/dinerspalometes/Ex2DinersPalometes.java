/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2.dinerspalometes;

import java.util.Scanner;

/**
 *Exercici Palometes
 * @author ace6601
 */
public class Ex2DinersPalometes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        
       //Preguntar dinero inicial
       System.out.println("Quants diners inicials tens?");
       
       //Esperar respuesta dinero inicial
       double dinersInicials = lector.nextDouble(); 
       
       //Preguntar precio entrada
       System.out.println("Quin es el preu de la entrada?");
       
       //Esperar preu_entrada
       double preuEntrada = lector.nextDouble();
       
       //Preguntar quantitatEntrades
       System.out.println("Quina es la quantitat d'entrades?");
      
       double quantitatEntrades = lector.nextDouble();
       
       //Calcular dinersRestants
       double dinersRestants = dinersInicials - preuEntrada * quantitatEntrades;
       
       System.out.println("Et queda un total de" + dinersRestants + "euros");      
    }           
    }
    
