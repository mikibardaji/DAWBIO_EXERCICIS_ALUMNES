import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pulsaciones;
        double suma = 0;
        
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce pulsaciones minuto " + i + ": ");
            pulsaciones = sc.nextDouble();
            suma += pulsaciones;
        }
        
        double media = suma / (i-1);
        System.out.println("Media = " + media + " bpm");
        
 }
    }


