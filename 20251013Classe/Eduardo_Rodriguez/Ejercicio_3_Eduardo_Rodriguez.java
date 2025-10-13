import java.util.Scanner;

public class Ejercicio_3_Eduardo_Rodriguez {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int intro;

        System.out.println("Dime el numero que deseas: ");
        intro = sc.nextInt();

        for (int contador = 0; contador < intro; contador+=2) {
            System.out.println("Estos son los pares: " + contador);
        }
    }
}
