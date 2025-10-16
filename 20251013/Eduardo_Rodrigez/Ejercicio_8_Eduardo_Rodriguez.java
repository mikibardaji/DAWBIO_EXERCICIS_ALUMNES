import java.util.Scanner;

public class Ejercicio_8_Eduardo_Rodriguez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int contador = 0;
        while (contador < 20) {
            if (contador % 2 == 0) {
                System.out.println("A");
            } 
            else {
                System.out.println("T");
            }
            contador++;
        }
    }
}
