/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cond3i4;
import java.util.Scanner;
/**
 *
 * @author mca3765
 */
public class Cond13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double euros, sortida;
        sortida = 0;
        String divisa;
        final double ARS_CONV, DOLARS_CONV, LIBRAS_CONV, BITCOIN_CONV;
        ARS_CONV = 1711.98;
        DOLARS_CONV = 1.13;
        LIBRAS_CONV = 0.85;
        BITCOIN_CONV = 0.000013;
        System.out.print("Digues una quantitat en euros: ");
        euros = lector.nextDouble();
        System.out.print("Ara digues una divisa: 'ARS','Dolars','Libras','Bitcoin' ");
        divisa = lector.next();
        switch (divisa) {
            case "ARS":
                sortida = euros*ARS_CONV;
                break;
            case "Dolars":
                sortida = euros*DOLARS_CONV;
                break;
            case "Libras":
                sortida = euros*LIBRAS_CONV;
                break;
            case "Bitcoin":
                sortida = euros*BITCOIN_CONV;
                break;
            default:
                System.out.print("Introdueix una divisa de les opcions si us plau.");
        }
        System.out.print("Els teus "+ euros + " euros equivalen a " + sortida + divisa +" !!");

        // TODO code application logic here
    }
    
}
