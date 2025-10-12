public class Baltasar_Castro_ex2_for {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Dosi de medicament (for) ===");
        System.out.print("Quantes dosis necessites? ");
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            System.out.println("Dosi administrada, t'en falten " + (i - 1) + "...");
        }

        System.out.println("Ja estàs curat!!!");
        sc.close();
    }
}

