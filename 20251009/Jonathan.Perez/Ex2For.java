import java.util.Scanner;

public class Ex2For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas dosis nesesitas? ");
        int dosis = sc.nextInt();

        for (int horas = dosis; horas > 0; horas--) {
            System.out.println("Dosis administrada, te faltan " + (horas - 1) + "...");
        }

        System.out.println("ya estas sanado!!");
    }
}


