/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apostadau;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ife5182
 */
public class ApostaDau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random aleatori = new Random();
        
        int A1 = aleatori.nextInt(1,6);
        int A2 = aleatori.nextInt(1,6);
        
        System.out.println("Cuanto dinero apuestas? ");
        
        int Apuesta = sc.nextInt();
        System.out.println( "ha salido " + (A1) + " y " + (A2));
        
        if ((A1 + A2) == 7){
            System.out.println("Ganas " + Apuesta + " Euros");
        }
        else if (A1 == A2){
            int B1 = aleatori.nextInt(1,6);
            int B2 = aleatori.nextInt(1,6);
            System.out.println("ahora ha salido " + (B1) + " y " + (B2));
            if (B1 == B2){
                System.out.println("Ganas " + (Apuesta * 3) + " Euros");
            }
            else{
                System.out.println("Ganas " + (Apuesta * 2) + " Euros");
            }
        }
        else {
            System.out.println("Pierdes la apuesta");
        }
        
        
    }
    
}
