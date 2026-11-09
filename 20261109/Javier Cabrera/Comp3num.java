/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comp3num;
import java.util.Scanner;
/**
 *
 * @author jncr5
 */
public class Comp3num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame un numero: ");
        int x = sc.nextInt();
        
        System.out.println("Dame un segundo numero: ");
        int y = sc.nextInt();
        
        System.out.println("Dame un tercer numero: ");
        int z = sc.nextInt();
        
        int mayor1 = mayor(x,y);
        int mayor2 = mayor(mayor1, z);
        
        System.out.println("El numero mas grande entre los introducidos es "+mayor2);
    }
    
    public static int mayor (int x, int y){
        if (x > y ){
            return x;
        } else {
            return y;
        }
    }
    }

