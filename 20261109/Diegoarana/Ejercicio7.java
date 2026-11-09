/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DIEGO ESTUDIOS
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 7. Programa que pregunta al usuario precios de artículos hasta que decide no continuar (hay que preguntar en cada iteración)
        // y muestra el precio con IVA (21 %). Implementa el método float preuAmbIva(float preu).
        Scanner lector = new Scanner(System.in);
        String resposta;
        
        try{
            do{
                System.out.print("Introduce el precio del articulo: ");
                float preu = lector.nextFloat();
                
                float resultat = preuAmbIva(preu);
                
                System.out.println("El precio con IVA es: " + resultat + " euros.");
                
                System.out.print("Quieres continuar? (s/n): ");
                resposta = lector.next();
                
            }while(resposta.equals("s"));
            
            System.out.println("Fin del programa.");
            
        }catch(InputMismatchException e){
            System.out.println("Tienes que introducir un precio correcto.");
        }
        
    }
    
    public static float preuAmbIva(float preu){
        float preuFinal;
        preuFinal = preu * 1.21f;
        return preuFinal;
    }
    
}
