/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicis;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class BlascoJoelEx3mod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Posa un numero: ");

        int numero1 = sc.nextInt();

        System.out.print("Posa un altre: ");

        int numero2 = sc.nextInt();

        int menor = menor(numero1, numero2);

        System.out.println("El numero menor de " + numero1 + " i " + numero2 + " es el " + menor);
    }

    private static int menor(int x, int y){
        int menor;
        if(x < y){
            menor = x;
        }
        else if(y < x){
            menor = y;
        }
        else{
            menor = x;
            System.out.println("No hi ha menor, son iguals");
        }
        return menor;
    }
    
}
