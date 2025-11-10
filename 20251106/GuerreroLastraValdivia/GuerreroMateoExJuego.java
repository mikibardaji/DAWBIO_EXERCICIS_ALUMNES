
import java.util.Scanner;

public class GuerreroMateoExJuego {

    public static void main(String[] args) {
        int jugadaJugador = jugada();
        imp_jugada("Jugador", jugadaJugador);
    }

    public static int jugada() {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        
        while (num < 0 || num > 2) {
            System.out.print("¿Qué sacas? (0 piedra, 1 papel, 2 tijera): ");
            
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num < 0 || num > 2) {
                    System.out.println("Valor no válido, intenta de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida, introduce un número entero.");
                sc.next();
            }
        }

        return num;
    }

    public static void imp_jugada(String quien_juega, int choose) {
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        System.out.println(quien_juega + " saca " + opciones[choose]);
    }
}


