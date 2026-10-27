*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer13;

import java.util.Random;
import java.util.Scanner;



/**
 *Programa on l’ordinador pensa un número (aleatòriament) entre 1 i 100 i l’usuari intenta endevinar-lo. El programa demanarà de forma iterativa a l’usuari que entri números i indicarà si el número a endevinar és més gran o més petit. El programa acaba quan l’usuari endevina el número i s’haurà de mostrar el nombre d’intents que s’han utilitzat.
 * @author iviss
 */
public class Exer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd =new Random();
        Scanner teclado =new Scanner(System.in);
        int numAleatorio; 
        numAleatorio = rd.nextInt(100)+1;
        
        int numero;
        int intentos = 0;
        
        do {
            System.out.println("Adivina el numero entre 1 y 100: ");
            numero = teclado.nextInt(); 
            intentos++;
            
            if (numero < numAleatorio){
                System.out.println("El numero aleatorio es mayor");
            } else if (numero > numAleatorio){
                System.out.println("El numero aleatorio es menor"); 
               
            
                
            }
        } while (numero != numAleatorio);
        System.out.println("Acertaste " + intentos);
        System.out.println("Has necesitado " + intentos + "intentos");
            
            
        }
        
        
        
        
        
    }
    

