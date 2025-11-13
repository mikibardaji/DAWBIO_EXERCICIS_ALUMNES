import java.util.Scanner;

public class Ruleta_Eduardo_Rodriguez {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    }

    static int AfegirPunts(int saldo) {
        System.out.print("Introduce cuántos puntos quieres añadir: ");
        int afegir = sc.nextInt();
        saldo += afegir;
        return saldo;
    }

    static int apostaPunts(int puntosTotal, int puntosApuesta) {
        if (puntosApuesta > puntosTotal) {
            System.out.println("no tienes suficientes puntos para apostaR: ");
            return puntosTotal;
        } else {
            puntosTotal -= puntosApuesta;
            return puntosTotal;
        }
    }

    static int bola() {
        return (int) (Math.random() * 37);
    }

    static void pintaAsterisc(int numero) {
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static int QuantitatAposta() {
        System.out.print("introduce la cantidad que quieres apostar: ");
        return sc.nextInt();
    }

    static int resultatJugada(int tipoApuesta, int saldo, int puntosApuesta, int bola) {
        boolean ganado = false;
        int ganancia = 0;

        if (tipoApuesta == 1) {
            System.out.print("elige un numero del 0 al 36): ");
            int numero = sc.nextInt();
            if (bola == numero) {
                ganancia = puntosApuesta * 35;
                ganado = true;
            }

        } else if (tipoApuesta == 2) {
            System.out.print("elige el color (1 = rojo, 2 = negro): ");
            int color = sc.nextInt();
            if ((bola % 2 == 0 && color == 2) || (bola % 2 != 0 && color == 1)) {
                ganancia = puntosApuesta * 2;
                ganado = true;
            }

        } else if (tipoApuesta == 3) {
            System.out.print("elige (1 = par, 2 = impar): ");
            int par = sc.nextInt();
            if ((bola % 2 == 0 && par == 1) || (bola % 2 != 0 && par == 2)) {
                ganancia = puntosApuesta * 2;
                ganado = true;
            }

        } else {
            System.out.println("no es valido");
            return saldo;
        }

        System.out.println("ha salido la bola: " + bola);
        if (ganado) {
            System.out.println("has ganado " + ganancia + " puntos");
            saldo += ganancia;
        } else {
            System.out.println("Has perdido la apuesta.");
        }

        return saldo;
    }

    static int tipusAposta() {
        System.out.println("elige el tipo de apuesta:");
        System.out.println("1. numero exacto");
        System.out.println("2. color (rojo/negro)");
        System.out.println("3. par o impar");
        System.out.print("Opción: ");
        return sc.nextInt();
    }
}
