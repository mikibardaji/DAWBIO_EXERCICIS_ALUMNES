import java.util.Scanner;

public class adrianforej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas dosis necesitas? ");
        int dosis = sc.nextInt();

        for (int tiempo = dosis; tiempo > 0; tiempo--) {
            System.out.println("Dosis administrada, te falta: " + (tiempo - 1));
        }

        System.out.println("Ya esta administrado");
        sc.close();
    }
}



