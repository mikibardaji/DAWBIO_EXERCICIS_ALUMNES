
import java.util.Scanner;

public class GiovineEjercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.println("Cual es tu nota?");

        nota = sc.nextDouble();
        if (nota < 5 && nota >= 0) {
            System.out.println("Desaprobado"); 
        } else if (nota >= 5 && nota <= 10) {

            System.out.println("Aprobado");

        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}