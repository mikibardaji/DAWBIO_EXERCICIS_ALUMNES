import java.util.Scanner;

public class exercici2for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantes dosis necessites? ");
        int dosis = sc.nextInt();

        for (int i = dosis; i > 0; i--) {
            System.out.println("Dosi administrada t'en falten " + (i - 1) + "...");
        }

        System.out.println("Ja estàs curat!!!");
        sc.close();
    }
}