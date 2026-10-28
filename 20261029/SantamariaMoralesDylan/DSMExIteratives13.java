/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexiteratives13;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExIteratives13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 13. Programa on l’ordinador pensa un número (aleatòriament) entre 1 i 100 i l’usuari intenta endevinar-lo. 
        // El programa demanarà de forma iterativa a l’usuari que entri números i indicarà si el número a endevinar és més gran o més petit. 
        // El programa acaba quan l’usuari endevina el número i s’haurà de mostrar el nombre d’intents que s’han utilitzat.
        Random aleatori = new Random();
        Scanner lector = new Scanner(System.in);
        
        int numUsuari, numAleatori, contador=0;
        
        numAleatori = aleatori.nextInt(1, 101);
                
        System.out.println("Has d'endevinar en quin numero estic pensant! Primera pista... es del 1 al 100 sense decimals...");
        System.out.print("En quin numero creus que estic pensant? ");
        numUsuari = lector.nextInt();
        contador ++;
        
        while(numUsuari != numAleatori){
            if(numUsuari<numAleatori){
                System.out.println("Un altre pista... Es mes gran el numero.");
            }else{
                System.out.println("Un altre pista... Es mes petit el numero.");
            }
            System.out.println("Intenta-ho un altre cop vinga!");
            System.out.print("En quin numero creus que estic pensant? ");
            numUsuari = lector.nextInt();
            contador ++;
        }
        
        System.out.println("Enorabona!!! HAS ENCERTAT!!!");
        System.out.println("El numero era: " + numAleatori + ".");
        System.out.println("Has trigat: " + contador + " intents en endevinar-ho");
        if (contador ==1){
            System.out.println("!!!!! EN NOMES 1 INTENT ES MOLT BONA SORT !!!!!");
        }
    }
    
}
