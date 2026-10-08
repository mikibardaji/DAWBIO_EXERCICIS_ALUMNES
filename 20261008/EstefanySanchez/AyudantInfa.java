/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayudantinfa;
import java.util.Scanner;
/**
 *
 * @author esa7092
 */
public class AyudantInfa {

    /**
     * 13. Desarrollamos un ayudante infantil para decidir qué hacer ante un semáforo.
     * El programa pedirá de qué color está el semáforo (V-verde/T-Naranja/Roig-Parar) 
     * y según la respuesta recomendará pasar, esperar, o correr.
     */
    public static void main(String[] args) {
        //declaramos variables
        Scanner teclado = new Scanner(System.in);
        char color;
        
        System.out.println("Introduce el color del semaforo (V/T/R)");
        color = teclado.next().toUpperCase().charAt(0);
        
        switch (color){
            case 'V':
                System.out.println("Puedes pasar. ");
                break;
             
            case 'T':
                System.out.println("Espera ");
                break;
                
            case 'R':
                  System.out.println("Hay que pararse. ");
                  break;
                  
            default:
                System.out.println("Color no valido.");
        }

        
        }
    }

        
        
        
    
