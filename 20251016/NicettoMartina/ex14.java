import java.util.Random;
import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int min = 1, max = 100;
        int intentos;
        int numMaquina;
        char respuesta;
        char direccion;
        int mas = 0, menos = 0;

        System.out.println("Piensa en un número entre 1 y 100!");
        System.out.print("Cuántos intentos tengo? ");
        intentos = sc.nextInt();

        while (intentos > 0) {
            System.out.println("Rango actual: " + min + " - " + max);
            numMaquina = rd.nextInt(min, max + 1);

            System.out.print("¿Tu número es " + numMaquina + "? (S/N): ");
            respuesta = sc.next().charAt(0);

            if (respuesta == 'S' || respuesta == 's') 
            {
                System.out.println("Adivinado!");
            }
            else if (respuesta=='n'|| respuesta == 'N' )
               {
                 System.out.print("¿El número es mayor (+) o menor (-)? ");
                direccion = sc.next().charAt(0);
            
            if (direccion == '+') 
            {
                
                min = numMaquina + 1;
                mas++;
            } 
            else if (direccion == '-') 
            {
                max = numMaquina - 1;
                menos++;
            } else {
                System.out.println("Opción no válida");
            }

            }

            intentos--;

            System.out.println("Me quedan " + intentos + " intentos.");
        }


    }
}
