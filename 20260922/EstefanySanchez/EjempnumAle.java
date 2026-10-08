/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejempnumale;

import java.util.Random;//importar random

/**
 *
 * @author esa7092
 */
public class EjempnumAle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatori = new Random();
        
        int numeroAleatorio = aleatori.nextInt(3);//entre 0 uno y dos
        System.out.println("Numero: " + numeroAleatorio);
        
        //numeo entre 0 y 10
        int num = aleatori.nextInt(10);
        System.out.println("numero 0 y 10 : " + num);
        
        //numero entre 0 y 3
        num = aleatori.nextInt(5,10);
        System.out.println("numero entre 5 y 10: " + num );
        
        
        //aleatori and decimal entre 0 y 1
        double decimal = aleatori.nextDouble();
        System.out.println("Decimal : " + decimal);
        System.out.printf("muestra dos decimales: %.2f ",  decimal);
        
        
    }
    
}
