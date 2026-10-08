/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dau_1_6;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author gga2951
 */
public class Dau_1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,dau;
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Escogeix un numero del dau de l'1 al 6: ");
        
        dau = scan.nextInt();
        num = ran.nextInt(1,7);
        System.out.println(num);
        
        if (dau == num){
            System.out.println("Has tret un 6!");
        }else{
            if (dau == 1){
                System.out.println("Quina mala sort!");
            }else{
                System.out.println("Resultat normal");
            }
        }
    }
    
}
