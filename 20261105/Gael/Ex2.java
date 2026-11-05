/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;
import java.util.Scanner;
/**
 *
 * @author gga2951
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
