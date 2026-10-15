/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedrapapertisora;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author gaelg
 */
public class PedraPaperTisora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        int jugador, ordinador;
        String nomJugador = "", nomOrdinador = "";

        System.out.print("Tria la teva jugada (0: Pedra, 1: Paper, 2: Tisora): ");
        jugador = lector.nextInt();

        ordinador = random.nextInt(3);

        if (jugador < 0 || jugador > 2) {
            System.out.print("Opcio incorrecta!");

        } else {

            if (jugador == 0) {
                nomJugador = "Pedra";
            } else if (jugador == 1) {
                nomJugador = "Paper";
            } else {
                nomJugador = "Tisora";
            }

            if (ordinador == 0) {
                nomOrdinador = "Pedra";
            } else if (ordinador == 1) {
                nomOrdinador = "Paper";
            } else {
                nomOrdinador = "Tisora";
            }

            System.out.println("Tu has triat: " + nomJugador);
            System.out.println("L'ordinador ha triat: " + nomOrdinador);

            if (jugador == ordinador) {
                System.out.println("Resultat: Empat!");

            } else if ((jugador == 0 && ordinador == 2) ||
                       (jugador == 1 && ordinador == 0) ||
                       (jugador == 2 && ordinador == 1)) {

                System.out.println("Resultat: Has guanyat tu!");

            } else {
                System.out.println("Resultat: Ha guanyat l'ordinador!");
            }
        }
    }
    
}
