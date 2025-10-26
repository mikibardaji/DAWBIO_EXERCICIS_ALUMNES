import java.util.Random;
import java.util.Scanner;

public class Examen1 {
    public static void main(String[] args) {
        int num_menu = 1;
        int num_tirades = 0;
        int num_adivinar;
        int num_usuario = 0;

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        while (num_menu != 0) {
            System.out.println("--------------------------");
            System.out.println("0 - Salir                |");
            System.out.println("1 - Instruccions de lloc |");
            System.out.println("2 - Tirades              |");
            System.out.println("3 - Jugar                |");
            System.out.println("--------------------------");

            num_menu = sc.nextInt();
            if (num_menu == 0) {
                System.out.println("Fins la propera!");

            } else if (num_menu == 1) {
                System.out.println(
                        "Primer accedeix a 2 per indicar nombre de tirades i després a 3 per començar a jugar");

            } else if (num_menu == 2) {
                System.out.println("Ingresa el nombre d'intents:");
                num_tirades = sc.nextInt();

            } else if (num_menu == 3) {
                if ((num_tirades <= 0)) {
                    System.out.println("No hi ha nombre d'intents especificats.");

                } else {

                    num_adivinar = rd.nextInt(1, 11);
                    System.out.println("Adivina un numero del 1 al 10:");

                    while (num_adivinar != num_usuario) {

                        num_usuario = sc.nextInt();
                        if (num_adivinar != num_usuario) {

                            --num_tirades;
                            System.out.println("no has encertat et queden " + num_tirades + " intents");

                        } else if (num_adivinar == num_usuario) {
                            System.out.println("has guanyat!");
                            num_menu = 0;
                        }

                        if (num_tirades <= 0) {
                            System.out.println("Has perdut");
                            break;

                        }

                    }

                }

            }
        }
        sc.close();
    }
}
