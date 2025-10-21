import java.util.Scanner;
import java.util.Random;

public class bucles9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // importo  java.util.Random
        // declaro las variables pulsacion, promedioPulsaciones
        // creo un bucle que repita 5 veces
        // dentro del bucle recopilo los datos de las pulsaciones con  la variable declarada numero de numeros random entre 30, 150
        // mueestro cada minuto y pulsacion recopilada
        // almaceno las pulsaciones
        // las pulsaciones las divido entre 5 y lo almaceno en pulsaciones promedio y le muestro al usuario el resultado

        int pulsaciones = 0;
        int promedioPulsaciones = 0;

        for (int i = 1; i <= 5; i = i + 1){
            int numero = rand.nextInt(30, 150);
            System.out.println("minuto " + i + " pulsaciones " + numero);
            pulsaciones = pulsaciones + numero;
        };

        promedioPulsaciones = pulsaciones / 5;
        
        System.out.println("el promedio de las pulsaciones totales es de " + promedioPulsaciones);

        sc.close();
    }   
}
