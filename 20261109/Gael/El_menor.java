/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package el_menor;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author gga2951
 */
public class El_menor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
        boolean i = false;
        
        while(i==false){
        try{
        int x,y;
        
        System.out.println("Escull el primer numero: ");
        x = lector.nextInt();
        
        System.out.println("Escull el segon numero: ");
        y= lector.nextInt();
            Menor(x, y, i);
            i=true;
        }
        catch(InputMismatchException ex){
            System.out.println("No valid");
            lector.next();
            i = false;
        }
        
    }
    }
    
    public static void Menor(int x, int y, boolean i){
               
        if (x < y){
            System.out.println("Es mes peit "+x);
        i = true;
        }else
            System.out.println("Es mes petit "+y);
         i = true;
    }
    
}
