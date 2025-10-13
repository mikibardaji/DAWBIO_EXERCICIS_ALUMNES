import java.util.Scanner;
public class Ex2While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas dosis necesitas? ");
        int dosis = sc.nextInt();

        int restante = dosis;

        while (restante > 0) {
            System.out.println("Dosis administrada, te quedan " + (restante - 1) + "...");
            restante--;
        }

        System.out.println("Ya estas sanado!");
    }
}