/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication.pkg2;
import java.util.Scanner;


/**
 *
 * @author msh6189
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        double costat, area;
       
        System.out.println("Introdueix el costat:");
        costat = sc.nextDouble();
       
        area = costat * costat;
       
        System.out.println("L'àrea del quadrat és:" + area);
       
       
    }
   
}
