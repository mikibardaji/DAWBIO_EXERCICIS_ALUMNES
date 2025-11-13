import java.util.Random;
import java.util.Scanner;

public class ruleta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo = 0;
        int bola, aposta, tipus, puntsAposta;

        saldo = afegirPunts(saldo);
        pintaAsterisc(20);
        System.out.println("\nSaldo actual: " + saldo);

        puntsAposta = quantitatAposta(sc, saldo);
        tipus = tipusAposta(sc);
        bola = bola();

        System.out.println("Ha salido: " + bola);
        saldo = resultatJugada(tipus, saldo, puntsAposta, bola);

        System.out.println("Tu saldo final es: " + saldo);
    }

    public static int afegirPunts(int saldo) {
        Scanner sc = new Scanner(System.in);
        int punts;
        do {
            System.out.print("Cuantos puntos quieres anadir: ");
            punts = sc.nextInt();
        } while (punts < 0);
        return saldo + punts;
    }

    public static int quantitatAposta(Scanner sc, int saldo) {
        int aposta;
        do {
            System.out.print("Cuanto quieres apostar? ");
            aposta = sc.nextInt();
            if (aposta > saldo) {
                System.out.println("No puedes apuestar mas del saldo actual (" + saldo + ")");
            }
        } while (aposta < 0 || aposta > saldo);
        return aposta;
    }

    public static int tipusAposta(Scanner sc) {
        int tipus;
        System.out.println("\n--- Tipo de apuesta ---");
        System.out.println("-2 → Parell");
        System.out.println("-1 → Senar");
        System.out.println("0–36 → Número específico");
        do {
            System.out.print("Elige la opció: ");
            tipus = sc.nextInt();
            if (tipus < -2 || tipus > 36) {
                System.out.println("Opción no vàlida, torna a provar.");
            }
        } while (tipus < -2 || tipus > 36);
        return tipus;
    }

    public static int bola() {
        Random rd = new Random();
        return rd.nextInt(37); 
    }

    public static void pintaAsterisc(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static int resultatJugada(int tipusAposta, int saldo, int puntsAposta, int bola) {
        if (tipusAposta == -2 && bola % 2 == 0 && bola != 0) { 
            System.out.println("Has encertat (parell)!");
            saldo += puntsAposta;
        } else if (tipusAposta == -1 && bola % 2 != 0) {
            System.out.println("Has encertat (senar)!");
            saldo += puntsAposta;
        } else if (tipusAposta == bola) {
            System.out.println("Número exacte! Multiplicació x36!");
            saldo += puntsAposta * 35; 
        } else {
            System.out.println("Has perdut l'aposta...");
            saldo -= puntsAposta;
        }
        return saldo;
    }
}
