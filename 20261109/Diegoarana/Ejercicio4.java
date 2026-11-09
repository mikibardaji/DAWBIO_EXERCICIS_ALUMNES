package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DIEGO ESTUDIOS
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4. Programa que pide al usuario un número entero y muestra si es positivo, cero o negativo.
        // Hay que crear el método int obteSigne(int x), que devuelve -1, 0, +1 según el número sea negativo, cero o positivo.
        Scanner lector = new Scanner(System.in);
        
        try{
            System.out.println("Introduce un numero y te dire si es positivo, cero o negativo: ");
            System.out.print("Numero x: ");
            int x = lector.nextInt();
            
            int resultat = obteSigne(x);
            
            if(resultat == -1){
                System.out.println("El numero " + x + " es negativo.");
            }else if(resultat == 0){
                System.out.println("El numero es cero.");
            }else{
                System.out.println("El numero " + x + " es positivo.");
            }
            
        }catch(InputMismatchException e){
            System.out.println("Tienes que introducir un numero entero.");
        }
        
    }
    
    public static int obteSigne(int x){
        int signe;
        if (x<0){
            signe = -1;
        }
        else if (x==0){
            signe = 0;
        }
        else {
            signe = 1;
        }
        return signe;
    }
    
} 
