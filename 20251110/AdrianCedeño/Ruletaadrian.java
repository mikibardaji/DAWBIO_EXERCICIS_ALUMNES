import java.util.Random;
import java.util.Scanner;

public class Ruletaadrian {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int saldoActual = 0;
        int numeroBola, tipusAposta, quantitatApostada;

        saldoActual = afegirSaldo(saldoActual);
        separador(25);
        System.out.println("Saldo disponible: " + saldoActual);
        System.out.println();

        quantitatApostada = demanarAposta(entrada, saldoActual);
        tipusAposta = seleccionarTipus(entrada);
        numeroBola = girarRuleta();

        System.out.println("Ha sortit el número: " + numeroBola);
        saldoActual = calcularResultat(tipusAposta, saldoActual, quantitatApostada, numeroBola);

        System.out.println("Saldo final: " + saldoActual);
    }

    public static int afegirSaldo(int saldoActual) {
        Scanner entrada = new Scanner(System.in);
        int punts;
        do {
            System.out.print("Introdueix els punts que vols afegir: ");
            punts = entrada.nextInt();
        } while (punts < 0);
        return saldoActual + punts;
    }

    public static int demanarAposta(Scanner entrada, int saldoActual) {
        int aposta;
        do {
            System.out.print("Quant vols apostar? ");
            aposta = entrada.nextInt();
            if (aposta > saldoActual) {
                System.out.println("No pots apostar més del teu saldo actual (" + saldoActual + ")");
            }
        } while (aposta < 0 || aposta > saldoActual);
        return aposta;
    }

    public static int seleccionarTipus(Scanner entrada) {
        int tipus;
        System.out.println();
        System.out.println("--- Tipus d’aposta ---");
        System.out.println("-2 → Números parells");
        System.out.println("-1 → Números senars");
        System.out.println("0–36 → Número concret");
        do {
            System.out.print("Selecciona una opció: ");
            tipus = entrada.nextInt();
            if (tipus < -2 || tipus > 36) {
                System.out.println("Opció invàlida. Torna-ho a intentar.");
            }
        } while (tipus < -2 || tipus > 36);
        return tipus;
    }

    public static int girarRuleta() {
        Random random = new Random();
        return random.nextInt(37);
    }

    public static void separador(int longitud) {
        for (int i = 0; i < longitud; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static int calcularResultat(int tipusAposta, int saldoActual, int quantitatApostada, int numeroBola) {
        if (tipusAposta == -2 && numeroBola % 2 == 0 && numeroBola != 0) {
            System.out.println("Has encertat (parell)");
            saldoActual += quantitatApostada;
        } else if (tipusAposta == -1 && numeroBola % 2 != 0) {
            System.out.println("Has encertat (senar)");
            saldoActual += quantitatApostada;
        } else if (tipusAposta == numeroBola) {
            System.out.println("Número exacte. Guanyes x36");
            saldoActual += quantitatApostada * 35;
        } else {
            System.out.println("Has perdut l’aposta");
            saldoActual -= quantitatApostada;
        }
        return saldoActual;
    }
}
