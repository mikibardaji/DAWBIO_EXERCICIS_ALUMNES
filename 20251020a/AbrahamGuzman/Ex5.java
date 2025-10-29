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
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de millas");
        
        double kilometros = millesAkm(sc.nextInt());
        
        System.out.println("Esta es su velocidad en kilometros " + Math.round(kilometros) +"Km");
    }
    public static double millesAkm(int milles){
    double kilometro;
    kilometro = milles * 1.6093;
    return kilometro;
    }
}
