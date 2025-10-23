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
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero y te dire si es positivo, negativo o zero");
        int usuario = sc.nextInt();
        
        int detector = obteSigne(usuario);
        
        switch (detector) {
            case 1:
                System.out.println("Es positivo " + usuario);
                break;
            case 0: 
                System.out.println("Su numero es 0");
                break;
            case -1: 
                System.out.println("Es negativo " + usuario);
                break;
            default:
                System.out.println("Opcion no valida");;
        }
    }
    public static int obteSigne(int x){
       int nose = 0;
        if (x < 0) {
            nose = -1;
        } else if (x > 0) {
            nose = 1;
        } else {
            nose = 0;
        }
        return nose;
    }
}
