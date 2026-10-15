/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author bca5802
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d = (int)(Math.random() * 6) + 1;
        System.out.println("Resultat: " + d);
        if (d == 6) System.out.println("Has tret un 6!");
        else if (d == 1) System.out.println("Quina mala sort!");
        else System.out.println("Resultat normal");
    }
    
}
