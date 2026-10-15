/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author bca5802
 */
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Tria la teva jugada (0: Pedra, 1: Paper, 2: Tisora): ");
        int tu = s.nextInt();
        int pc = (int)(Math.random() * 3);
        String[] o = {"Pedra", "Paper", "Tisora"};
        System.out.println("\nTu has triat: " + o[tu]);
        System.out.println("L'ordinador ha triat: " + o[pc]);
        if (tu == pc) System.out.println("Resultat: Empat!");
        else if ((tu == 0 && pc == 2) || (tu == 1 && pc == 0) || (tu == 2 && pc == 1)) 
            System.out.println("Resultat: Has guanyat tu!");
        else System.out.println("Resultat: Ha guanyat l'ordinador!");
    }
}
