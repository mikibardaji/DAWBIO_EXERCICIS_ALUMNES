/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iteratiuex7;

import java.util.Scanner;

/**
 *
 * @author eal0493
 */
public class Iteratiuex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector =new Scanner(System.in);
        boolean numNegatiu=false;
        int contador=0;
        for(int i=0;i<10;i++){
            System.out.print((i+1)+".-Inserta tensio arterial: ");
            int tensio = lector.nextInt();
            
            if(tensio<0){
               contador=contador+1;
            }
                    
            if (tensio <0){
                numNegatiu=true;
            }
        }
        
         if(numNegatiu){
             System.out.println("Error");
             System.out.println("Hi havien "+contador+" numeros negatius");
         } else {
             System.out.println("Tot correcte");
         }
    }
    
}
