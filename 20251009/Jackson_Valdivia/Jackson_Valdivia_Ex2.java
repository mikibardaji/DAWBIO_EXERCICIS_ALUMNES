
import java.util.Scanner;

public class pro1{

    public static void main(String[] args) {
        System.out.println("Cuantas dosis necesitas? ");
        Scanner sc = new Scanner(System.in);
        int respuesta = sc.nextInt();
        for (int i = respuesta; i > 0; i--) {
            System.out.println("Dosis administrada t’en falten" + i);
            if (respuesta == 0) {
                System.out.println("ya estas curado!!");
            }
        }
    }
}