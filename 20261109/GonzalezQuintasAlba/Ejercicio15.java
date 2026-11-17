/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;

public class Ejercicio15 {

    public static int demanaenter(int i) {
        int num = 0;
        boolean ok = false;
        Scanner lector = new Scanner(System.in);
        do {
            try {
                System.out.println("Introduzca numero " + i + " : ");
                num = lector.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("No es un numero");
                lector.nextLine();
            }
        } while (!ok);
        return num;
    }
    public static boolean desigualdadtriangular(int nu1,int nu2, int nu3){
        boolean desigualdad=false;
        if(nu1+nu2>nu3 && nu1+nu3>nu1 && nu2+nu3>nu1){
            desigualdad=true;
        }
        return desigualdad;
    }

    
    
    
    public static void main(String[] args) {
        int n1=0;
        int n2=0;
        int n3=0;
        boolean des;
        n1= demanaenter(1);
        n2=demanaenter(2);
        n3=demanaenter(3);
        des=desigualdadtriangular(n1,n2,n3);
        if(des==true){
            System.out.println("cumple desigualdad triangular");
        }
        else{
            System.out.println("No cumple desigualdad triangular");
        }
    }

}
