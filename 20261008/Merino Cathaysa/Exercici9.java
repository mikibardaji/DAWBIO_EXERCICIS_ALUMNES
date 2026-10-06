/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9;

import java.util.Scanner;

/**
 *
 * @author cme4538
 */
public class Exercici9 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Programa que llegeix una qualificació numèrica decimal x 
        entre 0 i 10 i la transforma en qualificació
        alfabètica, escrivint-ne el resultat.
        • 0<=x<3 Molt Deficient
        • 3<=x<5 Insuficient
        • 5<=x<6 Suficient
        • 6<=x<7 Bé
        • 7<=x<9 Notable
        • 9<=x<=10 Excel·lent*/
        
        Scanner sc = new Scanner(System.in);
        
        double nota;
        
        System.out.println("Dime tú nota y te diré tu calificación:");
        nota = sc.nextDouble();
        
        if (nota >= 0 && nota < 3) {
            System.out.println("Muy deficiente.");
        } else if (nota >= 3 && nota < 5) {
            System.out.println("Insuficiente.");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Suficiente.");
        } else if (nota >=6 && nota < 7) {
            System.out.println("Bien.");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable.");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Excelente.");
        } else {
            System.out.println("Nota no válida.");
        }
        
    }
    
}
