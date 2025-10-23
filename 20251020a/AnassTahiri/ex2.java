import java.util.Scanner;

public class ex2 {
    static boolean esMajorEdat(int edat) {
        return edat >= 18;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edat = sc.nextInt();

        if (esMajorEdat(edat))
            System.out.println("Eres mayor de edad.");
        else
            System.out.println("No eres mayor de edad.");
    }
}

