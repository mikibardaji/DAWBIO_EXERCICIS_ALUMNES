/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package el.més.gran;
import java.util.Scanner;
/**
 *
 * @author gaelg
 */
public class ElMésGran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1,n2;
        Scanner lector = new Scanner(System.in);
        System.out.print("Escoguiex el primer numero: ");
        n1 = lector.nextDouble();
        System.out.print("Escoguiex el primer segon: ");
        n2 = lector.nextDouble();
        if (n1 > n2){
            System.out.println("Aquest es mes gran " + n1);
        }else if(n2>n1){
        System.out.println("Aquest es mes gran " + n2);
    }
    }
    
}
