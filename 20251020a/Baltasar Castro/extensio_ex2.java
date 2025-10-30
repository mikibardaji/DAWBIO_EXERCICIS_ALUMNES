import java.util.Scanner;

public class extensio_ex2 {

    public static boolean esMajorEdat(int edat) {
        return edat >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix la teva edat: ");
        int edat = input.nextInt();

        if (esMajorEdat(edat)) {
            System.out.println("Ets major d'edat.");
        } else {
            System.out.println("No ets major d'edat.");
        }
    }
}
