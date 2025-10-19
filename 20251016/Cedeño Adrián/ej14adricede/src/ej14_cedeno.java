package bucles;
import java.util.Random;
import java.util.Scanner;

public class ej14_cedeno {
    public static void main(String[] args) {
        // Joc on l'ordinador intenta encertar el número que pensa l'usuari
        Scanner entrada = new Scanner(System.in);
        Random aleatori = new Random();

        int intents = 0;
        int limitInferior = 1;
        int limitSuperior = 100;
        int numeroPensat, respostaUsuari, proposta;
        int copsMesGran = 0;
        int copsMesPetit = 0;

        System.out.print("Pensa un número del 1 al 100: ");
        numeroPensat = entrada.nextInt();

        do {
            proposta = aleatori.nextInt(limitSuperior - limitInferior + 1) + limitInferior;
            System.out.println("Crec que el número és: " + proposta);
            intents++;

            if (proposta == numeroPensat) {
                System.out.println("He encertat el número!");
                break;
            }

            System.out.println("Dona’m una pista: 1 si és més petit, 2 si és més gran");
            respostaUsuari = entrada.nextInt();

            if (respostaUsuari == 1) {
                limitSuperior = proposta - 1;
                System.out.println("D’acord, és més petit.");
                copsMesPetit++;
            } else if (respostaUsuari == 2) {
                limitInferior = proposta + 1;
                System.out.println("Entesos, és més gran.");
                copsMesGran++;
            }

        } while (proposta != numeroPensat);

        System.out.println("He necessitat " + intents + " intents en total.");
        System.out.println("He pensat números massa grans " + copsMesPetit + " vegades.");
        System.out.println("He pensat números massa petits " + copsMesGran + " vegades.");
        System.out.println("Fi del joc. Gràcies per jugar!");
    }
}
