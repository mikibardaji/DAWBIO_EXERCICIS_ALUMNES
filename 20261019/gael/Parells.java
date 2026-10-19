/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parells;
import java.util.Scanner;
/**
 *
 * @author gga2951
 */
public class Parells {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Diguem un número: ");
        N=lector.nextInt();
        
        for(int i=2;i<=N;i=i+2){
            System.out.println("Mostra"+i);
        }
    }
}
