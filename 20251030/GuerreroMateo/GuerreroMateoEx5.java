import java.util.Scanner;

public class GuerreroMateoEx5 {
    public static void main(String[] args) {
        int milles = demanarMilles();
        double km = millesAKm(milles);
        System.out.println(milles + " milles equivalen a " + km + " quilòmetres.");
    }

    public static int demanarMilles() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la distància en milles: ");
        int milles = sc.nextInt();
        sc.close();
        return milles;
    }

    public static double millesAKm(int milles) {
        return milles * 1.6093;
    }
}
