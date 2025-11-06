import java.util.Scanner;

public class Ex6_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroA = pedirNumero(sc, "primero");
        int numeroB = pedirNumero(sc, "segundo");

        int resultado = compararNumeros(numeroA, numeroB);

        mostrarResultado(resultado, numeroA, numeroB);

        sc.close();
    }

    public static int pedirNumero(Scanner sc, String orden) {
        System.out.print("Introduce el " + orden + " número: ");
        return sc.nextInt();
    }

    public static int compararNumeros(int a, int b) {
        if (a > b) {
            return 1;
        } else if (b > a) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void mostrarResultado(int valor, int n1, int n2) {
        switch(valor) {
            case 1:
                System.out.println("El número más grande es: " + n1);
                break;
            case -1:
                System.out.println("El número más grande es: " + n2);
                break;
            default:
                System.out.println("Ambos números son iguales.");
        }
    }
}
