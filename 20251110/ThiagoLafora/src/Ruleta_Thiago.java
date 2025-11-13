import java.util.Random;
import java.util.Scanner;

public class Ruleta_Thiago {

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

        System.out.println("Ha sortit la bola: " + bola);
        saldo = resultatJugada(tipus, saldo, puntsAposta, bola);

        System.out.println("Saldo final: " + saldo);
    }

    public static int afegirPunts(int saldo) {
        Scanner sc = new Scanner(System.in);
        int punts;
        do {
            System.out.print("Introdueix quants punts vols afegir: ");
            punts = sc.nextInt();
        } while (punts < 0);
        return saldo + punts;
    }

    public static int quantitatAposta(Scanner sc, int saldo) {
        int aposta;
        do {
            System.out.print("Quant vols apostar? ");
            aposta = sc.nextInt();
            if (aposta > saldo) {
                System.out.println("No pots apostar més del teu saldo actual (" + saldo + ")");
            }
        } while (aposta < 0 || aposta > saldo);
        return aposta;
    }

    public static int tipusAposta(Scanner sc) {
        int tipus;
        System.out.println("\n--- Tipus d'aposta ---");
        System.out.println("-2 → Parell");
        System.out.println("-1 → Senar");
        System.out.println("0–36 → Número específic");
        do {
            System.out.print("Tria la teva opció: ");
            tipus = sc.nextInt();
            if (tipus < -2 || tipus > 36) {
                System.out.println("Opció no vàlida, torna-ho a provar.");
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
