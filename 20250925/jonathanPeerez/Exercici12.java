
import java.util.Scanner;

public class exercici12 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("De quin color està el semàfor? (V-verd / T-taronja / R-roig)");
        char color = sc.next().trim().toUpperCase().charAt(0);

        if (color == 'V') {
            System.out.println("Pots passar.");
        } else if (color == 'T') {
            System.out.println("Preacausió");
        } else if (color == 'R') {
            System.out.println("No pots pasar.");
        } else {
            System.out.println("Color no reconegut. ERROR.");
        }
    }
}
