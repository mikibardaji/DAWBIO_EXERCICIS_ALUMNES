/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexcond14;

import java.util.Scanner;

/**
 *
 * @author Dylan Santamaria
 */
public class DSMExCond14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 14.	Desenvolupeu un programa que entri un import en euros, mostri un menú amb diferents monedes, 
        // llegeixi el nom de la moneda i mostri la conversió a la moneda escollida.
        
        Scanner lector = new Scanner(System.in);
        
        double euros, dolar, libra, yen, yuanes;
        final double canvioDolar = 1.12;
        final double canvioLibra = 0.8555;
        final double canvioYen = 176.99;
        final double canvioYuanes = 7.55;                
        
        System.out.print("Quant es el teu impost en euros? ");
        euros = lector.nextDouble();
        
        System.out.println("A quina moneda ho vols passar? ");
        System.out.println("a - Dolar");
        System.out.println("b - Libra");
        System.out.println("c - Yen");
        System.out.println("d - Yuanes");
        System.out.print("Introdueix la lletra de la moneda: ");
        char moneda = lector.next().charAt(0);
        
        switch (moneda){
            case 'a':
                dolar = euros * canvioDolar;
                System.out.println("Ara tens: " + dolar + " $.");
                break;
            case 'b':
                libra = euros * canvioLibra;
                System.out.println("Ara tens: " + libra + " £.");
                break;
            case 'c':
                yen = euros * canvioYen;
                System.out.println("Ara tens: " + yen + " JP¥.");
                break;
            case 'd':
                yuanes = euros * canvioYuanes;
                System.out.println("Ara tens: " + yuanes + " CN¥.");
                
            default:
                System.out.println("LLetra no valida.");
        }
             
        
        
    }
    
}
