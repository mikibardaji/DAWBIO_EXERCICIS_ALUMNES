/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positiuonegatiu;
import java.util.Scanner;
/**
 *
 * @author albagonzalezquintas1985
 */
public class PositiuONegatiu {
    public static void main(String[] args) {
        double num;
        Scanner lector=new Scanner(System.in);
        System.out.println("Escribe un número");
        num=lector.nextDouble();
        if(num>0){
            System.out.println("El número es positivo");
        }
        else if(num<0){
            System.out.println("El número es negativo");
        }
        else{
            System.out.println("El número es 0");
        }

    }
    
}
