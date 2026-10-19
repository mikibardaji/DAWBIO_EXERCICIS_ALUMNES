/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iteratiuex3;

import java.util.Scanner;

/**
 *
 * @author eal0493
 */
public class Iteratiuex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector =new Scanner(System.in);
        boolean numNegatiu=false;
        for(int i=0;i<10;i++){
            System.out.print((i+1)+".-Inserta tensio arterial: ");
            int tensio = lector.nextInt();
            
            if (tensio <0){
                numNegatiu=true;
            }
        }
        
         if(numNegatiu){
             System.out.println("Error");
         } else {
             System.out.println("Tot correcte");
         }
            
        
    }
    
}
