/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gambling;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jncr5
 */
public class Gambling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ram = new Random();
        
        int SecNum = ram.nextInt(100) +1;
        int tries;
        int TryCount = 0;
        
        System.out.println("He pensado en un numero entre el 1 y 100. Trata de adivinar.");
        
        do {
            System.out.println("Dime un numero: ");
            tries = sc.nextInt();
            TryCount++;
            
            if (tries < SecNum){
                System.out.println("Muy chiquito, el numero secreto es MAS GRANDE");
            }else if (tries > SecNum){
                System.out.println("Muy grande, el numero secreto es MAS PEQUEÑO");
            }
        }while( tries != SecNum);
            System.out.println("WAOS, adivinaste el numero secreto. Yippie");
            System.out.println("Cantidad de intentos: "+TryCount+" intentos");
    }
    
}
