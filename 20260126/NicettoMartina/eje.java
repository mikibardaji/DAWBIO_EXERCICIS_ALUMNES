import java.util.Scanner;

public class eje {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] valores = new int[10];
        char opcion;

        do {
            menu();
            opcion = sc.next().charAt(0);

            if (opcion == 'a') {
                mostrar(valores);
            }
            else if (opcion == 'b') {
                introducir(valores);
            }
        } while (opcion != 'c');
    }

    public static void menu() {
        System.out.println("a) Mostrar valores");
        System.out.println("b) Introducir valor");
        System.out.println("c) Salir");
        System.out.print("Elige la opcion: ");
    }

   public static void mostrar(int[] valores) {
        for (int i = 0; i < valores.length; i++)
            System.out.println((i) + ": " + valores[i]);
    }

    public static void introducir(int[] valores) {
        int posicion;
            System.out.print("La posicion es: ");
            posicion = sc.nextInt();
    }
}