/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positiu_negatiu_0;
import java.util.Scanner;
/**
 *
 * @author gaelg
 */
public class Positiu_Negatiu_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num;
        Scanner lector = new Scanner(System.in);
        System.out.println("Diguem un numero: ");
        num = lector.nextDouble();
        
        if (num == 0){
            System.out.println("El teu numero es 0");
        }else if (num < 0){
            System.out.println("El teu numero es negatiu");
        }else if (num > 0){
            System.out.println("El teu numero es positiu");
        }
        
    }
    
}
