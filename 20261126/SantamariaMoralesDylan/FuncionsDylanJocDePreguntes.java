/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dylanjocdepreguntes;

import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class FuncionsDylanJocDePreguntes {

    public static String PrimeraPregunta() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Quin d'aquest personatges de videojocs es més antic?");
        System.out.println("A: Mario");
        System.out.println("B: Pac-man");
        System.out.println("C: Donkey Kong");
        System.out.println("D: Sonic");
        System.out.print("Escriu la teva resposta sense posar la lletra: ");
        String resposta = lector.nextLine();
        String mayusculaResposta = resposta.toUpperCase();
        return mayusculaResposta;
    }

    public static int respostaPrimera(String resposta) {
        int encertat = 0;
        if (resposta.equals("PAC-MAN") || resposta.equals("PAC MAN") || resposta.equals("PACMAN")) {
            System.out.println("RESPOSTA CORRECTE!! Va sortir en 1980.");
            encertat = 1;
        } else if (resposta.equals("MARIO") || resposta.equals("DONKEY KONG")) {
            System.out.println("Resposta incorrecte, va sortir en 1981");
            encertat = 0;
        } else if (resposta.equals("SONIC")) {
            System.out.println("Resposya incorrecte, va sortir en 1991");
            encertat = 0;
        } else {
            System.out.println("Has posat una resposta fora de les opcions, per tant es incorrecte.");
        }

        return encertat;
    }

}
