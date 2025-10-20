import java.util.Random;
import java.util.Scanner;

public class GuerreroMateoEx14 {
    public static void main(String[] args) {
        int num_min = 1;
        int num_max = 100;
        int num_maquina;
        char respuesta;
        // CONTADORES
        int contador_intentos = 0;
        int mas_grande = 0;
        int mas_pequeño = 0;
        
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        do
        { num_maquina = rd.nextInt(num_min, num_max + 1);
            ++contador_intentos;
            System.out.println("El numero es: " + num_maquina + "?");
            respuesta = sc.next().charAt(0);
            if (respuesta == '+') {
                ++mas_grande;
                num_min = num_maquina + 1;
                
            } else if (respuesta == '-') {
                ++mas_pequeño;
                num_max = num_maquina -1;
                
            }

        } while (respuesta != '=');
        
        sc.close();
        System.out.println("He acertado en " + contador_intentos + " intentos");
        System.out.println(mas_grande + " veces dije un numero más grande y " + mas_pequeño + " más pequeño.");

    
        
        
        
    }
}
