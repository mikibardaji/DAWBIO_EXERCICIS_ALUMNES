import java.util.Scanner;
import java.util.Random;

public class bucles10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        double temperatura = 0;
        int vecesTemp = 0;

        do {
            double numero = rand.nextDouble(32, 42);
            temperatura = numero;
            vecesTemp = vecesTemp + 1;
            System.out.println(temperatura);

        } while (temperatura < 36.5);       
        System.out.println("se tomo la temperatura " + vecesTemp);

        sc.close();
    }   
}