import java.util.Scanner;

public class GuerreroMateoEx9 {
    public static void main(String[] args) {
        int pulsaciones = 0;
        int contador = 1;
        int suma = 0;
        double media;

        Scanner sc = new Scanner(System.in);

        while (contador <=5) {
            System.out.println("Introduce pulsaciones minuto " + contador);
            pulsaciones = sc.nextInt();
            suma = suma + pulsaciones;
            contador++;  
        }

        media = suma/5.0;
        System.out.println("Media = " + media);
        sc.close();


    }
    
}
