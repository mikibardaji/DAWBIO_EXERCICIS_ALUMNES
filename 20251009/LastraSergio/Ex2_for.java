import java.util.Scanner;

public class Ex2_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantes dosis necessites? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No calen dosis. Ja estàs curat");
        } else {
            for (int restants = n; restants > 0; restants--) {
                System.out.println("Dosis administrada t'en falten " + (restants - 1) + "...");
            }
            System.out.println("Ja estàs curat");
        }

        sc.close();
    }
}
