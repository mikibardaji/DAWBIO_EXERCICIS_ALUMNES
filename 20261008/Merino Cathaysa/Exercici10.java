/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici10;

import java.util.Scanner;

/**
 *
 * @author cme4538
 */
public class Exercici10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        /*Programa que rep com a dades d'entrada una hora expressada 
        en hores, minuts i segons i un temps expressat en segons i 
        que ens calcula i escriu l'hora, minuts i segons que seran, 
        transcorregut el temps especificat.*/
        
        Scanner sc = new Scanner(System.in);
        
        int horas, minutos, segundos, tiempo_transcurrido;
        
        System.out.println("Dime la hora:");
        horas = sc.nextInt();
        
        System.out.println("Dime los minutos:");
        minutos = sc.nextInt();
        
        System.out.println("Dime los segundos:");
        segundos = sc.nextInt();
        
        System.out.println("Dime el tiempo que ha transcurrido en segundos");
        tiempo_transcurrido = sc.nextInt();
        
        segundos = segundos + tiempo_transcurrido;
        
        if (segundos >= 60) {
            segundos -= 60;
            minutos += 1;
        }  if (minutos >= 60) {
            minutos -= 60;
            horas += 1;
        }
        String horaFormateada = String.format("%02d:%02d:%02d", horas, minutos, segundos);
        System.out.println("Son las " + horaFormateada);
    }   
    
}
