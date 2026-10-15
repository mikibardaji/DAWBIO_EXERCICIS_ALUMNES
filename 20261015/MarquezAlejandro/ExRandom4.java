/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4random;

import java.util.Random;

/**
 *
 * @author AlejandroMarquez
 */
public class Ex4Random {

    /**
     * @param args the command line arguments
     * 4. Llançament d’un dau
Fes un programa que simuli el llançament d’un dau de 6 cares.
Genera aleatòriament un número entre 1 i 6 i mostra el resultat.
A més:
•	Si surt un 6, mostra «Has tret un 6!».
•	Si surt un 1, mostra «Quina mala sort!».
•	En qualsevol altre cas, mostra «Resultat normal».

     */
    public static void main(String[] args) {
        
        //Importar random y variables
        Random rd = new Random();
        int numaleatorio = 0;
        
        //Calculo de numero random
        numaleatorio = rd.nextInt(1, 7);
        
        //Diferentes situaciones segun el resultado
        if (numaleatorio == 6){
            System.out.println("Has tret un 6!");
        }
        else if (numaleatorio == 1){
            System.out.println("Quina mala sort! un 1");
        }
        else System.out.println("Resultat normal: " + numaleatorio);
           
    }
    
}
