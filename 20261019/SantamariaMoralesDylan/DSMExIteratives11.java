/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexiteratives11;

import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExIteratives11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 11. El programa demana el nom d’un pacient i la seva temperatura corporal.
        // Ha de comprovar que la temperatura sigui numèrica i raonable, és a dir, entre 30 °C i 45 °C (ambdós inclosos).
        // Si la temperatura introduïda no és vàlida, el programa la torna a demanar fins que ho sigui.
        // Finalment, mostra un missatge amb el nom del pacient i la temperatura validada.
        Scanner lector = new Scanner (System.in);
        
        double temperatura;
        String nom; //No sale en azul, pero esta bien asi.
        
        System.out.print("Introdueix nom del pacient: ");
        nom = lector.nextLine();
        
        System.out.print("Introdueix temperatua (ºC) corporal del pacient: ");
        temperatura = lector.nextDouble();
        
        while(temperatura<30 || temperatura>45){ //Continuo mentre la temperatura esta incorrecte.
            System.out.println("Temperatura corporal fora de rang correcte (30ºC - 45ºC).");
            System.out.print("Torna a intoduir la temperatura: ");
            temperatura = lector.nextDouble();
        }
        
        System.out.println("Pacient " + nom + " registrat amb temperatura corporal de " + temperatura + "ºC.");
     }
    
}
