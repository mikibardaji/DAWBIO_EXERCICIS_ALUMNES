import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introdueix pulsacions minut " + i + ": ");
            int pulsacions = sc.nextInt();
            suma += pulsacions;
        }

        double mitjana = suma / 5.0;
        System.out.println("Mitjana = " + mitjana + " bpm");

        sc.close();
    }
}
