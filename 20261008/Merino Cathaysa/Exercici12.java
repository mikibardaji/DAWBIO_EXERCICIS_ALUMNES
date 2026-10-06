/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici12;

import java.util.Scanner;

/**
 *
 * @author Cathy
 */
public class Exercici12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Desenvolupeu un programa que demani a l’usuari que 
        introdueixi un preu en € i la quantitat de € que paga. 
        El programa compararà les dues quantitats i escriurà 
        els € que li falten per pagar o bé els que li han de tornar. 
        Ex. Si l’usuari introdueix preu=102€ i paga=150€, el programa 
        li dirà “Sobren 48€”. Si l’usuari introdueix preu=102€ i 
        paga=100€, el programa li dirà “Falten 2€”.*/
        
        Scanner sc = new Scanner(System.in);
        
        double precio, eurosPagados, dinero;
        
        System.out.println("Dime el precio del artículo:");
        precio = sc.nextDouble();
        
        System.out.println("Dime con cuánto dinero estás pagando:");
        double euros =sc.nextDouble();
        
        if (precio > euros) {
            dinero = precio - euros;
            System.out.println("Te falta por pagar " + dinero + "€");
        } else if (euros > precio) {
            dinero = euros - precio;
            System.out.println("Te sobra/n " + dinero + "€");
        } else {
            System.out.println("El impporte es exacto.");
        }
    }
    
}
