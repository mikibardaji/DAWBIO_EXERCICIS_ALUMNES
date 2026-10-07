/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexcond12;

import java.util.Scanner;

/**
 *
 * @author Dylan Santamaria
 */
public class DSMExCond12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desenvolupeu un programa que demani a l’usuari que introdueixi un preu en € i la quantitat de € que paga. 
        // El programa compararà les dues quantitats i escriurà els € que li falten per pagar o bé els que li han de tornar. 
        // Ex. Si l’usuari introdueix preu=102€ i paga=150€, el programa li dirà “Sobren 48€”. 
        // Si l’usuari introdueix preu=102€ i paga=100€, el programa li dirà “Falten 2€”.
        Scanner lector = new Scanner(System.in);
        
        double preu, pagar, sobren, falten;
        
        System.out.println("Anem a veure si et falten o sobren diner...");
        
        System.out.print("Quants diners has de pagar? ");
        preu = lector.nextDouble();
        
        System.out.print("Quant has pagat? ");
        pagar = lector.nextDouble();
        
        if (preu>pagar){
            falten = preu - pagar;
            System.out.println("Et falten: " + falten + " €");                    
        }else{
            if (preu == pagar){
                System.out.println("Has pagat la xifra exacta.");
            }else{
                sobren = pagar - preu;
                System.out.println("Et sobren: " + sobren + " €");                        
            }
        }
        
        
    }
    
}
