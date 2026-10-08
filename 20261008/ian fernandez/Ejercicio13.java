/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author ife5182
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
      System.out.println("¿De quin color esta el semafor?");
        System.out.println("verde");
        System.out.println("naranja");
        System.out.println("rojo");
        
        String color = sc.nextLine();
        String v = "verde";
        String r = "rojo";
        String t = "naranja";
        
        if (color.equals(v)){
            System.out.println("pots passar");
        }
        else if (color.equals(r)){
            System.out.println("No passis");
        }
        if (color.equals(t)){
            System.out.println("passa corrents o espera");
        }
        else{
            System.out.println("error, possa una de les opcions tal cual esta escrita");
        }
    }
    
}
