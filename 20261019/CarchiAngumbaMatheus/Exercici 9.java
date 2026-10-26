/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author mca3765
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random aleatori = new Random();
        int batecsMinut = 0;
        float totalBatecs = 0;
        int min=1;
        for (;min<=5;){
            batecsMinut = aleatori.nextInt(30,151);
            System.out.println("Pulsacions minut "+min+": " + batecsMinut);
            totalBatecs += batecsMinut;    
            min ++;
        }
        System.out.println("Mitjana de pulsacions = "+ (totalBatecs/(min-1)));
        
        }
        
    }

