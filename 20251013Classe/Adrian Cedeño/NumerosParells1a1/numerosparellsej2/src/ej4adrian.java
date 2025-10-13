import java.util.Scanner;
 
public class ej4adrian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int Numero1 = sc.nextInt();
 
        for (int numero2 = 1; numero2 <= Numero1; numero2++) {
            if (numero2 % 2 == 0) {
                System.out.println(numero2 + " es par");
            } else {
                System.out.println(numero2 + " es impar");
            }
        }
    }
}
 