import java.util.Scanner;
public class modular5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double millas = 0;

        System.out.println("dame una medida en millas ");
        millas = sc.nextDouble();

        millas = millasAKm(millas);

        System.out.println("las millas ingresadas son " + millas + "Km");

        sc.close();
    }

    public static double millasAKm(double millas) {
        final double KM_A_MILLA = 1.6093;
        millas = millas * KM_A_MILLA;
        return millas;
    }

} 
