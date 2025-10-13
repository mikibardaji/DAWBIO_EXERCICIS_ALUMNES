import java.util.Scanner;

public class Ejercicio_4_Eduardo_Rodriguez {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int intro;

        System.out.println("Dime el numero que deseas: ");
        intro = sc.nextInt();

        for (int contador = 1; contador < intro; contador++) {
            if (contador % 2 == 0){
            System.out.println("Estos son los pares: " + contador);
            }
        }
    }
}
