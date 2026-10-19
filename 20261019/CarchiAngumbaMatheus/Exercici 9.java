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
        float batecsMinut = 0;
        float totalBatecs = 0;
        int min=1;
        for (;min<=5;){
            System.out.println("Introdueix pulsacions minut "+min+":");
            batecsMinut = lector.nextFloat();
            if (batecsMinut >= 30 && batecsMinut <= 150 ){
                totalBatecs += batecsMinut;    
                min ++;
                System.out.println(totalBatecs + " " + min);
            } else {
                System.out.println("Introdueix un valor valid (entre 30 i 150)");
            }
                 
        }
        System.out.println("Mitjana = "+ (totalBatecs/(min-1)));
        
        }
        
    }
    

