/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexiteratives14;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dylan Santamaria
 */
public class DSMExIteratives14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 14. Programa on l'usuari pensa un número de l'1 al 100 i l'ordinador intenta endevinar-lo. 
        // És a dir, l'ordinador anirà proposant números una vegada i una altra fins a endevinar-lo 
        // (l'usuari haurà d'indicar-li a l'ordinador si és més gran, menor o igual al número que ha pensat). 
        Scanner lector = new Scanner(System.in);
        Random aleatori = new Random();
        char tamany;
        int pensat, intent, contador;
        
        System.out.println("Has de pensar un numero del 1 al 100 i l'ordinador intentara endevinar-ho.");
        System.out.println("Si la maquina falla, hauras de dir-li si el nombre era mes grans o mes petit posant G o P respectivament.");
        System.out.println("O si endivina li has de dir que correcte amb una C.");
        System.out.print("En quin numero estas pensant? ");
        pensat = lector.nextInt();
        
        while(pensat<1 || pensat>100){
            System.out.println("Nombre no valid! Ha de ser un del 1 al 100.");
            System.out.println("En quin numero estas pensant? ");
            pensat = lector.nextInt();
            lector.nextLine();
        }
        
        intent = aleatori.nextInt(1, 101);
        contador = 1;
        
        do{
            System.out.println("L'ordinador diu que el nombre es: " + intent + " .");            
            System.out.print("El nombre que has pensat es mes gran (G), mes petit (P) o es correcte(C)? ");
            tamany = lector.next().charAt(0);
                        
            switch (tamany){
                case 'G':
                case 'g':
                    intent=aleatori.nextInt(intent + 1, 101);
                    contador ++;
                    break;
                case 'P':
                case 'p':
                    intent=aleatori.nextInt(1, intent);
                    contador ++;
                    break;
                case 'C':
                case 'c':
                    intent = 555;
                    break;
                default:
                    System.out.println("LLetra no valida, ha de ser G, P o C.");
            }
            
        }while(intent != 555);
       
        
        System.out.println("LA MAQUINA HO HA ENDEVINAT");
        System.out.println("El numero era: " + pensat + " .");
        System.out.println("La maquina ha trigat " + contador + " intents.");

        
    }
    
}
