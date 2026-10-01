/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elmesgran;
import java.util.Scanner;
/**
 *
 * @author albagonzalezquintas1985
 */
public class Elmesgran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2=0;
        int max=0;
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca el numero 1");
        num1=lector.nextInt();
        System.out.println("Introduzca el numero 2");
        num2=lector.nextInt();
        if (num1<num2){
            max=num2;
            System.out.println("El número más grande de los dos es "+max);

        }
        else if (num2<num1){
            max=num1;
            System.out.println("El número más grande de los dos es "+max);

        }
        else{
            System.out.println("Los dos números son iguales.");
        }
    
    
}
}
