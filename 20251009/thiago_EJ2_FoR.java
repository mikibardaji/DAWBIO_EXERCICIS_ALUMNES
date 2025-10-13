import java.util.Scanner;

public class thiago_EJ2_FoR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas dosis necesitas? ");
        int dosis = sc.nextInt();

        for (int horas = dosis; horas > 0; horas--) {
            System.out.println("Dosis administrada, te faltan " + (horas - 1) + "...");
        }

        System.out.println("ya estas curado!!");
    }
}






















