/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exrandom5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class ExRandom5 {

    /**
     * @param args the command line arguments
     * 5. Joc de daus
        Simula un joc de dos daus. Genera aleatoriament dos números entre 1 y 6.
        El programa et demanarà quants diners vols apostar.
        * 
        • Si la suma dels dos numeros es 7 guanyaràs el mateix que has apostat. Mostra: “Bravo! Has guanyat X euros” (canvia la X pel valor aconseguit)
        • Si els dos numeros son iguals tornarà a tirar un altre cop:
        ◦ Si torna a sortir un doble (dos numeros iguals) guanyes el triple que has apostat. Mostra: “COMBO! Tripliques ganacies, has guanyat X euros”
        ◦ Qualsevol altre resultat guanyes el doble. Mostra “Has doblat el valor: guanyes X euros”
    • Si no la suma no es 7 ni es un doble mostra: “Has perdut l’aposta”.
     */
    public static void main(String[] args) {
        
        //importar scanner y variables 
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        int dado1, dado2, dinero;
        
        //pedir al usuario cuanto apuesta
        
        System.out.println("Cuanto quieres apostar: ");
        dinero = sc.nextInt();
        
        // ahora generamos los numeros aleatorios
        
        dado1 = rd.nextInt(1, 7);
        dado2 = rd.nextInt(1, 7);
        
        // ahora creamos situaciones
        
        if (dado1 + dado2 == 7){
            System.out.println("Bravo! Has guanyat " + (dinero * 2) + "euro");
        }
        else if (dado1 == dado2){
        System.out.println("tornan a tirar un altre cop daus iguals...");
        
        dado1 = rd.nextInt(1, 7);
        dado2 = rd.nextInt(1, 7);
        
            if (dado1 == dado2){
                System.out.println("COMBO! Tripliques ganacies, has guanyat " + (dinero * 3) + " euros" );
            }
            else System.out.println("Has doblat el valor: guanyes " + (dinero * 2) + " euros");
        }
        
        else System.out.println("Has perdut l aposta");
        
        
        
        
        
        
    }
    
}
