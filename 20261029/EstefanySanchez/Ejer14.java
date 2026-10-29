package ejer14;
import java.util.Scanner;
/**
 *
 * @author Estefany.SS
 */
public class Ejer14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Creamos scanner y variables
        Scanner lector = new Scanner(System.in);
        
        int min = 1;
        int max = 100;
        int intentos = 0;
        char respuesta;

        System.out.println("Piensa un número entre el 1 y el 100.");
        System.out.println("Responde según las siguientes opciones:");
        System.out.println(" '>' si tu número es MAYOR que el propuesto");
        System.out.println(" '<' si tu número es MENOR que el propuesto");
        System.out.println(" '=' si el ordenador ha ACERTADO");
        System.out.println("----------------------------------------");

        do {
            // El ordenador calcula la propuesta (punto medio del intervalo)
            int propuesta = (min + max) / 2;
            intentos++;

            // Petición al usuario sin usar format (usamos System.out.print y el operador +)
            System.out.print("Intento " + intentos + ": ¿Es el " + propuesta + "? (>, <, =): ");
            respuesta = lector.next().charAt(0);

            if (respuesta == '>') {
                min = propuesta + 1;
            } else if (respuesta == '<') {
                max = propuesta - 1;
            } else if (respuesta != '=') {
                System.out.println("Opción no válida. Por favor introduce '>', '<' o '='.");
            }

        } while (respuesta != '='); // Bucle do-while: se repite mientras no haya acertado

        
        System.out.println("\n¡El ordenador ha adivinado tu número en " + intentos + " intentos!");
        
        
    }
}
    
    
    
    
    
    
