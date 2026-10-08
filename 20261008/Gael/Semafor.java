/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semafor;
import java.util.Scanner;
/**
 *
 * @author gaelg
 */
public class Semafor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        System.out.print("De quin color esta el semafor? V-verd/T-Taronja/R-Roig: ");
        char Resposta = lector.next().charAt(0);
        
        switch (Resposta) {
            case 'V':
                System.out.println("passar");
                break;
            case 'T':
                System.out.println("córrer");
                break;
            case 'R':
                System.out.println("esperar");
                break;
            default:
                System.out.println("Error");
        }
    }
    
}
