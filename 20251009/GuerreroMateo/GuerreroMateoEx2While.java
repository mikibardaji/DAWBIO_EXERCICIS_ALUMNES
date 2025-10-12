import java.util.Scanner;

public class GuerreroMateoEx2While {
    public static void main(String[] args) {
        int dosis;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas dosis necesitas?");
        dosis = sc.nextInt();
        sc.close();

        while (dosis >1) {
            System.out.println("Te quedan " + (dosis-1));
            --dosis;
        }

        System.out.println("Ya estás curado!");
    }
    
}
