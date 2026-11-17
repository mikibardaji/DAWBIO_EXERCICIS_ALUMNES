/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio11 {
    public static void tablamultiplicacio (int num){
        System.out.println("Tabla de multiplicar del numero "+num);
        for (int i=0;i<=10;i++){
            System.out.println(num+" x "+i+" = " + (num*i));                   
        }
        
    }
    public static void main(String[] args) {
   int number=0;
    Scanner lector=new Scanner(System.in);
    boolean ok=false;
    do{
    try{
    System.out.println("Introduce un numero: ");
    number=lector.nextInt();
    ok=true;
    }catch(InputMismatchException e){
        System.out.println("No es un numero");
        lector.nextLine();
    }
    tablamultiplicacio(number);
    }while (!ok);
    
    
}
}
