/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9;
import java.util.Random;
/**
 *
 * @author ago4635
 */
public class Exercici10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El programa ha de demanar valors (float) fins que la temperatura sigui 36.5 o més, i després mostrar quants intents han calgut. Valores aleatorios entre 35 y 45.
        int i=0;
        float temperatura=0;
        Random aleatori=new Random();
        do{
            temperatura=aleatori.nextFloat(35,46);
            System.out.println("Medida "+i+ "ºC: "+temperatura);
            i++;
        }while(temperatura<36.5);
        System.out.println("Listo. Se han necesitado "+i+" intentos");
    }
    
}
