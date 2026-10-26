/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexiteratives9;

import java.util.Random;

/**
 *
 * @author dsa1845
 */
public class DSMExIteratives9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 9.Generar valors aleatorios entre 30 y 150 simulara les pulsacions (batecs per minut) d’un pacient durant 5 minuts, i calcula la mitjana. 
        // Exemple de sortida:
        //Introdueix pulsacions minut 1: 80
        //...
        //Mitjana = 78.6 bpm
        
        Random generaLatidosAleatoris = new Random();
        
        int latidos;
        double bpmTotal = 0;
        double mitjana;
        
        System.out.println("Anem a simular la mitja dels batecs per minuts d'un pacient durant 5 minuts: ");
        
        for (int i = 1; i <= 5; i++){
            latidos = generaLatidosAleatoris.nextInt(30, 151);
            bpmTotal = bpmTotal + latidos;
            System.out.println("Minuto " + i + ": BPM = " + latidos);                     
            
        }
        
        mitjana = bpmTotal/5;
        System.out.println("Mitjana: " + mitjana);
        
        
    }
    
}
