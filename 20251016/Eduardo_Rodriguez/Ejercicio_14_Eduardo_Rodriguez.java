import java.util.Scanner;

public class Ejercicio_14_Eduardo_Rodriguez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Max = 100, Min = 1, pedir, ale, contador = 0;

        System.out.println("Introduce el numero que quieres que la maquina adivine: ");
        pedir = sc.nextInt();

        do {
            ale = (int)(Math.random() * (Max - Min + 1)) + Min; 
            if (ale > pedir) {
                System.out.println("\nEste es el numero que puso la maquina: " + ale + " El numero en menor");
                Max = ale - 1;
            }
            else if (ale < pedir) {
                System.out.println("\nEste es el numero que puso la maquina: " + ale + " El numero en mayor");
                Min = ale + 1;
            }
            contador++;
        } while (pedir != ale);
        System.out.println("\nLa maquina adivino el numero " + ale);
        System.out.println("Numero de intentos: " + contador);
    }
}

