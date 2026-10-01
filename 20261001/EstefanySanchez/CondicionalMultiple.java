/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalmultiple;
import java.util.Scanner;
/**
 *
 * @author esa7092
 */
public class CondicionalMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menu
        int op ;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("num 1:");
        int num1;
        System.out.println("num 2:");
        int num2;
        int result;
        
        op = lector.nextInt();
        num1 = lector.nextInt();
        num2 = lector.nextInt();
        
        
        System.out.println("Menu; ");
        System.out.println("suma");
        System.out.println("division: ");
        System.out.println("multi:");
        System.out.println("resta:");
        System.out.println("opcion:");
        
    
        
        switch (op){
            case 1 :
                System.out.println("SUMA");
                result = num1 + num2;
                System.out.println("Total resultado:" + result);
                
           
                
                break;
            case 2 :
                System.out.println("Resta:");
                result = num1 - num2;
                System.out.println("Total de resultado:" + result);
                
            case 3 :
                System.out.println("Division:");
                result = num1 / num2;
                System.out.println("Total de la divison:" + result);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //if(ff<1 || ff>4)
            //System.out.println("opcion no valida");
    
    
    
    //ejercicio vermelo
    
    
    
    }
    
}
