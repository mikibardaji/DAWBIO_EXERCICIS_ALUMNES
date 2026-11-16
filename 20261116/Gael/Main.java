import java.util.Scanner;

public class Main {

    public static boolean comprobarFecha(int any, int mes, int dia) {
        return any > 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= 30;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el año: ");
        int any = sc.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();

        if (comprobarFecha(any, mes, dia)) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha es incorrecta");
        }

        sc.close();
    }
}
