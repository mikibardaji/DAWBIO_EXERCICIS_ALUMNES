/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;
public class Ejercicio14 {

    public static double demanadecimal(int i){
        double num=0;
        boolean ok=false;
        Scanner lector=new Scanner(System.in);
        do{
            try{
            System.out.println ("Introduzca valor catet "+i+" : ");
            num=lector.nextDouble();
            ok=true;
            }catch(InputMismatchException e){
                System.out.println("No es un numero");
                lector.nextLine();
            }
        }while(!ok);
        return num;
    }
    public static double hipotenusa(double catet1,double catet2){
        double h=0;
        double x=0;
        x=(catet1*catet1) + (catet2*catet2);
        h=Math.sqrt(x);
        return h;
    }

    public static void main(String[] args) {
        double c1,c2=0;
        double hipotenusa=0;
        c1=demanadecimal(1);
        c2=demanadecimal(2);
        hipotenusa=hipotenusa(c1,c2);
        System.out.println("Hipotenusa : "+hipotenusa);
    }
    
}
