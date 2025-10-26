import java.util.Scanner;

public class GuerreroMateoEx2 {
    public static void main(String[] args) {
        pedirNum();
        edad(0);
    }

    public static void pedirNum() {
        System.out.println("Ingresa tu edad");
    }

    public static boolean edad(int edad) {
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();
        boolean edat;
        sc.close();
        if (edad >= 18) {
            edat = true;
            System.out.println("Eres mayor de edad");
        } else {
            edat = false;
            System.out.println("Eres menor de edad");
        }
        return edat;
    }
}
