/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacient;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ife5182
 */
public class Pacient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("Quin es el teu nom? ");
        String nom = s.nextLine();
        
        System.out.print("Quina es la teva temperatura? ");
        double temp = s.nextDouble();
        
        
        while (temp < 30 || temp > 45){
            System.out.print("Temperatura erronea, ha de ser entre 30 y 40 graus, siusplau torna-ho a escriure: " );
            temp = s.nextDouble();
        }
        System.out.println("Pacient registrat: "+nom+", " +temp);
    }
    
}
