/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cond3i4;
import java.util.Scanner;
/**
 *
 * @author mca3765
 */
public class Cond3i4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double num1, num2 ;
        int positiu = 0;
        String digues1,digues2;
        System.out.print("Digues un número: ");
        num1 = lector.nextDouble();
        System.out.print("Ara digues un altre: ");
        num2 = lector.nextDouble();
        if (num1 == num2 ){
            System.out.println("Pero si es el mateix número!! Son iguals.");
        } else {
            if (num1>num2) {
                System.out.println("El primer número (" + num1 + ") es més gran que el segon (" + num2 + ") !");
            }
            else {
                System.out.println("El segon número (" + num2 + ") es més gran que el primer (" + num1 + ") !");
            }
        }
        
        if (num1 != 0){
            if (num1>0) {
                positiu += 1;
                digues1 = "positu";
            } else {
                positiu += 10;
                digues1 = "negatiu";
            }
        } else {
            digues1 = "zero";
        }
        
        if (num2 != 0){
            if (num2>0) {
                positiu += 1;
                digues2 = "positu";
            } else {
                positiu +=10;
                digues2 = "negatiu";
            }
        } else {
            digues2 = "zero";
        }
        
        switch (positiu) {
            case 2:
                System.out.println("Els dos números son positius :)");
                break;
            case 20:
                System.out.println("Els dos números son negatius :(");
                break;
            case 0:
                System.out.println("Els dos números son zero :O");
                break;
            default:
                System.out.println("El primer número és " + digues1 + " i el segon es " + digues2 + "!!" );
        }
        
        
        // TODO code application logic here
    }
    
}
