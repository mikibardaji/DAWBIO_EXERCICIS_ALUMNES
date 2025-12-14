/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subwaysurf;
import java.util.Scanner;
/**
 *
 * @author claud
 */
public class Subwaysurf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el nom del jugador: ");
        String nom = sc.nextLine();

        System.out.print("Tipus de nivell (facil/dificil): ");
        String nivell = sc.nextLine();

        Joc joc = new Joc(nom, nivell);

        joc.jugar();
    }
}

