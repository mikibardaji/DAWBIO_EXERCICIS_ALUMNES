import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp;
        int mesures = 0;

        do {
            System.out.print("Introdueix la teva temperatura: ");
            temp = sc.nextFloat();
            mesures++;
        } while (temp < 36.5f);

        System.out.println("Han calgut " + mesures);
        sc.close();
    }
}
