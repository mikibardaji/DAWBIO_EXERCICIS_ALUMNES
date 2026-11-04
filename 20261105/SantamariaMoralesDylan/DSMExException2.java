/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexexception2;

import java.util.Scanner;

/**
 *
 * @author Dylan Santamaria
 */
public class DSMExException2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercici 2: Caixa Registradora amb Bloqueig de Seguretat
        // Escriu un programa en Java per a una caixa registradora que sumi els preus dels productes que l'usuari va introduint per consola.
        // Per demanar el número, no ho farem amb nextDouble(). S'ha de demanar amb nextLine() i transformar el String amb la instrucció Double.parseDouble(entrada).
        // - Ús d'un bucle: El programa ha de demanar preus (double) i anar-los sumant a un total. El bucle funcionarà normalment mentre no s'introdueixi un 0.
        // - Condició de sortida normal: Si l'usuari introdueix un 0, el bucle finalitza correctament i es mostra el total de la compra.
        // - Captura d'excepcions i sortida forçada: Si l'usuari fica un text no vàlid (per exemple, "gratis" o "hola"), 
        //   el programa ha de capturar l'excepció NumberFormatException. En aquest moment, 
        //   s'ha de mostrar un missatge crític ("Error de format. Operació cancel·lada per seguretat.") i el bucle s'ha d'interrompre.
        // - Resultat final: Tant si el bucle acaba normalment (amb un 0) com si es trenca per l'excepció, 
        //   el programa ha de mostrar el total acumulat fins a aquell moment.
        Scanner lector = new Scanner(System.in);
        String dinersEscrits;    
        double  suma, dinersAcomulats = 0;
        boolean salir = false;
        
        System.out.println("Caixa registradora:");
        System.out.println("Per sortir introdueix 0.");
        System.out.println("----------------------------------------");
        
        try{
            do{
            System.out.print("Introdueix el preu del producte: ");
            dinersEscrits = lector.nextLine();
            suma = Double.parseDouble(dinersEscrits);
            dinersAcomulats = dinersAcomulats + suma;
            
            if (suma == 0){
                salir = true;                
            }
            
            } while (salir == false);            
        }catch(NumberFormatException e){
            System.out.println("Error de format. Operació cancel·lada per seguretat.");
        }
        System.out.println("Preu total: " + dinersAcomulats + " €.");
        
    }
    
}
