/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerc.iteratives2;

import java.util.Scanner;

/**
 *
 * @author jlu1859
 */
public class ExercIteratives2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scan  = new Scanner(System.in);
    int numero;
        System.out.println("Quantes dosis necessites?");
        numero = scan.nextInt();
    while(numero>0){

        System.out.println("Dosis administrada t’en falten " + (numero-1));
        numero--;
    }
        System.out.println("Ja estas curat!!!");
    Scanner scan1  = new Scanner(System.in);
    int numero2;
        System.out.println("Quantes dosis necessites?");
        numero2 = scan1.nextInt();
    for(int i=numero2; i>0; i--){
        System.out.println("Dosis administrada t’en falten " + (numero2-1));
        numero2--;
    }
      System.out.println("Ja estas curat!!!");
    }
    
}
