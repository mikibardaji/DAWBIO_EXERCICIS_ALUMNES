/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positiu.negatiu.zero;
import java.util.Scanner;
/**
 *
 * @author gga2951
 */
public class PositiuNegatiuZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int x;
        System.out.println("Diguem un número: ");
        x=lector.nextInt();
        signe(x);
    }
    
    public static int signe(int x){
       if (x>0)
            System.out.println(+1);
       else if (x==0)
            System.out.println(0);
       else
            System.out.println(-1);
       return x;
    }
    
}
