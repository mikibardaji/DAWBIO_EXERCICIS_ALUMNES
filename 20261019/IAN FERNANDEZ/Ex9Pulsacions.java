/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9pulsacions;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ife5182
 */
public class Ex9Pulsacions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        double suma = 0; //variable per guardar la suma dels numeros aleatoris
        
        
        for(int i=1; i<=5; i++){
            int pulsacions = r.nextInt(30, 150);
            System.out.println(i+". Pulsacions " +pulsacions);
            suma = suma + pulsacions; 
            // en aquest bucle van apareixent numeros aleatoris i es van guardant i sumant a la variable
        }
        double mitjana = suma/5; //una vegada sumats tots els numeros es fa la mitjana
        System.out.println("La mitjana d'aquest pacient es: " + mitjana);
        
        
    }
    
}
