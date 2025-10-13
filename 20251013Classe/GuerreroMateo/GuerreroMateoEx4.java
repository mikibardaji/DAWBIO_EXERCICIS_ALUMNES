import java.util.Scanner;

public class GuerreroMateoEx4 {
    public static void main(String[] args) {
        int numeroN;
        int numero = 1;
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, introduce un numero natural");
        numeroN = sc.nextInt();
        sc.close();

        while (numero < numeroN) {
            numero++;
            if (numero %2 == 0) {
                System.out.println(numero);
                
            }

            
        }
        
    }
}
