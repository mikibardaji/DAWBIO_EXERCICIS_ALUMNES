/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1_n;
import java.util.Scanner;
/**
 *
 * @author gga2951
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        Scanner lector = new Scanner(System.in);
        System.out.println("Diguem un número: ");
        N = lector.nextInt();
        
        for(int i=1;i<=N;i++){
            if(i%2==0){
                System.out.println("numero "+i);
            }
        }
    }
    
}
