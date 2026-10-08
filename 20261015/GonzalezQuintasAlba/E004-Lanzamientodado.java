/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lanzamientodado;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ago4635
 */
public class Lanzamientodado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*4. Llançament d’un dau
Fes un programa que simuli el llançament d’un dau de 6 cares.
Genera aleatòriament un número entre 1 i 6 i mostra el resultat.
A més:
•	Si surt un 6, mostra «Has tret un 6!».
•	Si surt un 1, mostra «Quina mala sort!».
•	En qualsevol altre cas, mostra «Resultat normal».
*/
        
        Random cara=new Random();
        int caraaleatoria=cara.nextInt(1,7);
        System.out.println("Ha salido el número "+caraaleatoria);
        if(caraaleatoria==6){
            System.out.println("Has tret un 6!");
        }
        else if (caraaleatoria==1){
            System.out.println("Quina mala sort!");
        }
        else{
            System.out.println("Resultat normal");
                }
    }
    
}
