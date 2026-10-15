/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package llançamentdau;
import java.util.Random;
/**
 *
 * @author ife5182
 */
public class LlançamentDau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Random aleatori = new Random();
        int numeroAleatori = aleatori.nextInt(1,6);
        if (numeroAleatori == 1){
            System.out.println("Que mala suerte!");
        }
        else if(numeroAleatori == 6){
            System.out.println("Has sacado un 6!");
        }
        else {
            System.out.println("Has sacado un: " + numeroAleatori);
        }
    }
    
}
