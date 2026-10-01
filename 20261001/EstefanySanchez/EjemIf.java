/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemif;
import java.util.Scanner;
/**
 *
 * @author esa7092
 */
public class EjemIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // programa que pregunte la edad
        //Declaramos variable
        
        int edad;
        Scanner lector = new Scanner(System.in);
        System.out.println("CUAL ES TU EDAD: ");
        
        edad = lector.nextInt();
        
        
        
        //uso de if y else
        if(edad>0 && edad<150){
            if(edad>=67){
                System.out.println("Estas jubilado");
            }else{
                System.out.println("No estas jubilado");
            }
            
        }else{
            System.out.println("Edad no valida");
    
    
        }
        
    

    }
    
}
