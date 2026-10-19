/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciteratives3;
import java.util.Scanner;
/**
 *
 * @author jlu1859
 */
public class ExercIteratives3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scan  = new Scanner(System.in);
    int numero;
        System.out.print("Introdueix el teu numero:");
        numero = scan.nextInt();
   int numero2 = numero % 2;
   int contador = 2;
   if(numero2 == 0){
       while( contador<numero){
           System.out.println(contador);
           contador = contador + 2;
           
       } 
       
   } else {
       numero = numero - 1;
       while(contador<numero){
           System.out.println(contador);
           contador = contador + 2;
           
       } 
       System.out.println("hi ha "+ (contador) + " parells");
   }
    }
    
}
