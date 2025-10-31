/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author agu3018
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                 // TODO code application logic here
       
        
        double kilometros = millesAkm(Pedir());
        mostrar(kilometros);
        
    }
    public static double millesAkm(int milles){
    double kilometro;
    kilometro = milles * 1.6093;
    return kilometro;
    }
    public static int Pedir(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de millas");
        
        return  sc.nextInt();
    }
    
   public static void mostrar(double kilometors){
   System.out.println("Esta es su velocidad en kilometros " + Math.round(kilometors) +" Km");
           }
}

