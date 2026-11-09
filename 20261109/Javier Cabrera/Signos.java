/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package signos;
import java.util.Scanner;
/**
 *
 * @author jncr5
 */
public class Signos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame un numero entero: ");
        int numero = sc.nextInt();
        
        int signo = damesigno(numero);
        
        System.out.println("El signo del numero que me diste, es "+signo);
    }
    public static int damesigno(int x){
        if (x < 0) {
            return -1;
        } else if (x == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
