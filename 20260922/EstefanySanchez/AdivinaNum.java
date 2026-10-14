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
     */
    public static void main(String[] args) {
        //Declaramos variables
        //Llamamos a Random
       Scanner lector = new Scanner(System.in);
       int num ;
       int user;
       
       //generar numero aleatorio entre 1 y 10
       Random ran = new Random();//crear un objeto aleatorio
       num = ran.nextInt(1, 11);//
       //System.out.println("Numero generado: " + num);// prueba
       
       System.out.println("Escribe un numero");
       user = lector.nextInt();
       
       //else else if
       if(num == user) {
           System.out.println("¡Has acertado");
       }else if(num > user){
           System.out.println("Te has pasado");
       }else if(num < user){
           System.out.println("El numero es mayor");
           
       }
        
    }
    
}
