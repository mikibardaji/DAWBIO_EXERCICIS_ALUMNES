/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici8;

import java.util.Scanner;

/**
 *
 * @author cme4538
 */
public class Exercici8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Programa que demani dues notes d’una assigantura (amb decimals). 
        //Si alguna de les dues es mes petita que 5 ha de sortir el text 
        //«Has d’anar a segona convocatoria». Si no ha de dir «Felicitats,
        //modul superat»
        
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2;
        
        System.out.println("Dime la primera nota: ");
        nota1 =sc.nextDouble();
        
        System.out.println("Dime la segunda nota: ");
        nota2 = sc.nextDouble();
        
        if (nota1 < 5 || nota2 < 5) {
            System.out.println("Has de ir a segunda convocatoria.");
        } else {
            System.out.println("Felicidades, módulo superado");
        }
    }
    
}
