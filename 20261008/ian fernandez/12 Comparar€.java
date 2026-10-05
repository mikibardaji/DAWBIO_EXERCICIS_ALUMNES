/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparar€;

import java.util.Scanner;

/**
 *
 * @author ife5182
 */
public class Comparar€ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        /*
      Desenvolupeu un programa que demani a l’usuari que introdueixi un preu en € 
     i la quantitat de € que paga. El programa compararà les dues quantitats i escriurà els €
      que li falten per pagar o bé els que li han de tornar. Ex. Si l’usuari introdueix preu=102€ i paga=150€, 
      el programa li dirà “Sobren 48€”. Si l’usuari introdueix preu=102€ i paga=100€, el programa li dirà “Falten 2€”.
*/
        
        double preu, pagar;
        
        System.out.println("introdueix un preu: "  );
        preu = sc.nextDouble();
        
        System.out.println("has de pagar... ");
        pagar = sc.nextDouble();
        
        if (preu>=pagar){
            double sobra = preu - pagar;
            System.out.println("et sobren " + sobra + "€");
        }
        else if(preu<pagar){
            double falta = pagar - preu;
            System.out.println("et falten " + falta + "€");
        }
        
    }
    
}
