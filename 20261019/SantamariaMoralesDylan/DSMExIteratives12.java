/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexiteratives12;

/**
 *
 * @author dsa1845
 */
public class DSMExIteratives12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 12. Comptador de cèl·lules dividides
        // Una cèl·lula es divideix en dues cada hora. Mostra quantes cèl·lules hi ha després de 1, 2, 3, ..., 10 hores.
        int acumCelulas=1;
        for (int horas = 1; horas <= 10; horas++){
            acumCelulas = acumCelulas * 2;
            System.out.println("Hora: " + horas + ", numero de celulas: " + acumCelulas);
        }
    }
    
}
