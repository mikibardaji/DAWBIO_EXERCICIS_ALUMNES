/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinanum;
import java.util.Random;
/**
 *
 * @author esa7092
 */
public class AdivinaNum {

    /**
     * Adivina el número
    Realiza un programa que genere aleatoriamente un número entre 1 y 10.
    Pide al usuario que introduzca un número y comprueba:
    Si ha acertado, muestra «¡Has acertado!».
    Si el número introducido es mayor, muestra «¡Te has pasado!».
    Si es menor, muestra «¡El número es mayor!».
    Ayuda: Para probarlo, primero haz que muestre el valor aleatorio, 
    para poder fallar o acertar cuanto quieras, después cuando 
    ya funcione, quita el chivato.
    * 
    * 
    * 
    * 
    * 
    * 
    * 
     */
    public static void main(String[] args) {
        // 
        Random aleatori = new Random();
        int numAl = aleatori.nextInt(1,11);
        
        System.out.println("Numero aleatorio entre el 1 y 10: " + numAl);
    
    
    
    
    
    
    }
    
}
