package ejer5fun;
import java.util.Scanner;

/**
 *
 * @author Estefany.SS
 */
public class Ejer5Fun {

    /**
     * 5. Programa que pide al usuario una distancia medida en millas y muestra
     * su equivalente en kilómetros (1 milla = 1,6093 km). Debe implementar un método
     * con el prototipo double millasAKm(int millas).
     */
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        
        //pedimos distancia en millas
        System.out.println("Introduce una distancia en millas: ");
        int millas = lec.nextInt();
        
        //llamamos a la función para convertir a kilometros
        double resultado = millesAKm(millas);
        
        //mostramos resul
        System.out.println("la distancia en kilometro es: " + resultado + "km");
        
    }
    //función que convierte millas a kilometros
    public static double millesAKm(int milles){
        double kilometros = milles * 1.6093;
        return kilometros;
    }
    
}
