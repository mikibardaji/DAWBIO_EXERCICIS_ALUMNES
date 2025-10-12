import java.util.Scanner;

public class Ex2Iteratiu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantes dosis necessites? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No calen dosis. Ja estàs curat");
        } else {
            int restants = n;
            do {
                restants--;
                System.out.println("Dosis administrada t'en falten " + restants + "...");
            } while (restants > 0);
            System.out.println("Ja estàs curat");
        }

        sc.close();
    }
}
