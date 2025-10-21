import java.util.Scanner;
import java.util.Random;

public class bucles14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int Max = 100;
        int Min = 0;
        int miNumero = 0;
        

        do {       
            int numeroIA = rand.nextInt(Min, Max);  
            System.out.println("el numeron es " + numeroIA);
            System.out.println("1) mas");
            System.out.println("2) menos");
            System.out.println("3) igual");
            miNumero = sc.nextInt();

            if (miNumero == 1) {
                Min = numeroIA + 1;
            } else if (miNumero == 2) {
                Max = numeroIA - 1;
            }

        } while (miNumero != 3);
        
        System.out.println("Adivine!!");
          
        sc.close();
    }   
}
