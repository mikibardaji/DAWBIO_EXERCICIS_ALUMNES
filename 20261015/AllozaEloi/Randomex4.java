/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomex4;

import java.util.Random;

/**
 *
 * @author
 */
public class Randomex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Random aleatori = new Random();

        int dau = aleatori.nextInt(6) + 1;

        System.out.println("Has tret un " + dau);

        if (dau == 6) {
            System.out.println("Has tret un 6!");
        } else if (dau == 1) {
            System.out.println("Quina mala sort!");
        } else {
            System.out.println("Resultat normal");
        }
    }
}
    
