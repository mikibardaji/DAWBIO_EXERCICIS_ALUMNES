/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menorkfuncion;

import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class MenorKFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2;
        System.out.print("Dime un número: ");
        num1 = lector.nextInt();
        System.out.print("Dime otro número: ");
        num2 = lector.nextInt();
        System.out.println("El número menor es " + menor(num1,num2));
    }
    
    public static int menor(int x, int y){
       int min;
       if (x<y){
           min = x;
       } else {
           min = y;
       }
       return min;
    }
    
}
