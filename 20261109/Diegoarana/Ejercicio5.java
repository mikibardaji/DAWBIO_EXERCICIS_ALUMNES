package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DIEGO ESTUDIOS
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 5. Programa que pide al usuario una distancia en millas y muestra su equivalente en kilómetros (1 milla = 1,6093 km).
        // Hay que implementar un método con el prototipo double millesAKm(int milles).
        Scanner lector = new Scanner(System.in);
        
        try{
            System.out.println("Introduce una distancia en millas y te dire cuantos kilometros son: ");
            System.out.print("Millas: ");
            int milles = lector.nextInt();
            
            double resultat = millesAKm(milles);
            
            System.out.println(milles + " millas son " + resultat + " km.");
            
        }catch(InputMismatchException e){
            System.out.println("Tienes que introducir un numero entero.");
        }
        
    }
    
    public static double millesAKm(int milles){
        double km;
        km = milles * 1.6093;
        return km;
    }
    
}
