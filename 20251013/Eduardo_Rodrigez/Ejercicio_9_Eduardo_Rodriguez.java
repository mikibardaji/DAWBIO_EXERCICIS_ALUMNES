
import java.util.Scanner;
public class Ejercicio_9_Eduardo_Rodriguez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumulador =0;
        double media, pulsaciones;
 
        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Coloca tus pulsaciones por minuto :");
            pulsaciones = sc.nextDouble();
            acumulador += pulsaciones;
        }
 
        media = (double) acumulador / 5;
        System.out.println("La media de pulsaciones es de " + media + " bpm ");
 
    }
}
 

