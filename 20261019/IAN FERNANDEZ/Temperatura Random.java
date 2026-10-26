/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temp;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ife5182
 */
public class Temp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        int intents = 1;
        double temp = r.nextDouble(35, 45);
        System.out.printf(intents+ ". La temperatura es: %.2f%n", temp);
       while (temp<=36.5){
             temp = r.nextDouble(35, 45);
             intents++;
             System.out.printf(intents+ ". La temperatura es: %.2f%n", temp);
            
        }
          System.out.println("Han calgut "+intents+ " intents");
        
    }
    
}
