/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_iteraciones;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guill
 */
public class ExCatorce {

    /*Programa donde el usuario piensa un número del 1 al 100 y el ordenador intenta adivinarlo. Es decir,
    el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el usuario deberá indicarle al 
    ordenador si es mayor, menor o igual al número que ha pensado). Se le indicara con =(igual) +(mes grande) 
    o -(mes pequeño). A cada vuelta el ordenador debe acotar el limit. Ejemplo: El usuario piensa el 56 Ejecucio:
    El ordenador piensa el 78 (es el numero aleatorio que le ha salido entre 1 y 100) ¿He acertado?
    - (el usuario le dice más pequeño) El ordenador piensa 37 (es el numero aleatorio que le ha salido entre 1 y 77) 
    ¿He acertado? + (el usuario le indica más grande) El ordenador piensa 47 (es el numero aleatorio que le ha salido entre 38 y 77) 
    ¿He acertado? + (el usuario le indica más grande) El ordenador piensa 52 (es el numero aleatorio que le sale entre 48 y 77) ¿He acertado? 
    = (ha acertado se acaba el juego) Te lo he acertado con 3 golpes, 2 veces he dicho un numero más grande y 1 vez más pequeño
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*
        Ordenador: introduce el numero que has pensado.
        Persona: 100
        Ordenador: He pensado en este numero 80
        Ordenador: he acertado?
        Persona: >

        Ordenador: He pensado en este numero 90
        Ordenador: he acertado?
        Persona: >
        Ordenador: He pensado en este numero 100
        Ordenador: he acertado?
        Persona: =
    en pantalla sale : este es el numero he acertado?
    Si o No es mayor o menor    
        */
    
        int numero= 0, aleatorio, limite_Maximo= 100, limite_Minimo= 1, intentos =0;
        char caracter;
        Scanner lector = new Scanner(System.in);
        System.out.println("Piensa un numero del 1 al 100 e introducelo:  ");
        numero = lector.nextInt();
        lector.nextLine();
        Random rd = new Random(); 
        do{
            System.out.println("El limite maximo es: "+limite_Maximo+ " y el limite minimo es: "+limite_Minimo);
            aleatorio = rd.nextInt(limite_Maximo-limite_Minimo+1)+ limite_Minimo; // uso un rango minimo y maximo para acortar numeros en rangos segun respuestas
            System.out.println("He pensado en este numero:  "+aleatorio+"\n");
            
            System.out.println("He acertado? Responde con: \n >, \n <, \n =. ");
            caracter = lector.nextLine().charAt(0); //aqui indico que devuelva el primer caracter por teclado.
            intentos ++;
            switch (caracter) {
                case '=':
                    System.out.println("Has acertado");
                    break;
                case '>':
                    System.out.println("Es mayor");
                    
                    // tengo que acortar el rango por ejemplo de 80 a 100
                    limite_Minimo = aleatorio +1; // para que aleatorio acorte el rango de numeros
                    break;
                case '<':
                    System.out.println("Has menor");
                    limite_Maximo = aleatorio -1;
                    break;
                default:
                    System.out.println("No se ha introducido un caracter valido");
                    throw new AssertionError();
            }
  
            
        }while(aleatorio != numero);
        
        System.out.println("He intentando estas veces: "+intentos);
        
                
    
    }
    
}
