

    import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        double milles = (double)
        millesAKm(0);
        System.out.println("Milles convertides a Km: " + milles);
    }

    public static double millesAKm (double milles){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantes milles vols convertir a Km? ");

        milles = sc.nextInt();
        sc.close();
        
        return milles * 1.60934;
    }
}

