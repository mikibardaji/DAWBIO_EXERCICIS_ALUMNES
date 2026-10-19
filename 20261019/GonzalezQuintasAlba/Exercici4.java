/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;
import java.util.Scanner;
/**
 *
 * @author ago4635
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4.	Programa que entra un número natural N i mostra els números parells compresos entre 1 i N. Per fer-ho utilitzeu un comptador sumant d'1 en 1.
        
       Scanner lector=new Scanner(System.in);
       System.out.print("Introduzca un numero N ");
       int num=lector.nextInt();
       for (int i=2;((i<=num));i=i+1){
           if(i%2==0){
           System.out.println("este es un numero entero: "+i);
           }
       }
       System.out.println("Ya hemos acabado. Aqui tienes todos los pares");
    }
    
    
}
