/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions;
import java.util.Scanner;
/**
 *
 * @author mca3765
 */
public class Funcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroPetit = menor(2,3);
        System.out.println("El numero més petit es: " +numeroPetit);
    }
    
    public static int menor(int x,int y) {
        int petit = 0;
        if (x>y) {
           petit = y;
        } else {
           petit = x;
        }
        return petit;
    }
    /**
     * mètode 1 paràmetre i retorna 1 valor
     */
    
}
