/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexmodular7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExModular7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 7. Programa que pregunta a l’usuari preus d’articles fins que decideix no continuar 
        // (cal preguntar a cada iteració) i mostra el preu amb IVA (21 %). 
        // Implementa el mètode float preuAmbIva(float preu).
        
        boolean salir = false;
        double preu, ambIva, total=0;
        do{
            try{
                preu = pedirPreu();
                ambIva = preuAmbIva(preu);
                System.out.println("El preu amb iva es: " + ambIva);
                total = total + ambIva;
            }catch(InputMismatchException e){
                salir = true;
            }
            
        }while(salir == false);
        
        System.out.println("El total es de: " + total);
        
    }
    
    public static double pedirPreu(){
        Scanner lector = new Scanner(System.in);
        System.out.println("(si vols sortir escriu qualsevol cosa menys un numero)");
        System.out.print("Introdueix un Preu: ");
        double num = lector.nextDouble();
        return num;
    }
    
    public static double preuAmbIva(double preu){
        double preuAmbIva = preu * 1.21;
        return preuAmbIva;        
    }
    
}
