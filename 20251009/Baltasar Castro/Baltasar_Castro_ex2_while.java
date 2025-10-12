public class Baltasar_Castro_ex2_while {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Dosi de medicament (while) ===");
        System.out.print("Quantes dosis necessites? ");
        int n = sc.nextInt();

        while (n > 0) {
            n--;
            System.out.println("Dosi administrada, t'en falten " + n + "...");
        }

        System.out.println("Ja estàs curat!!!");
        sc.close();
    }
}

