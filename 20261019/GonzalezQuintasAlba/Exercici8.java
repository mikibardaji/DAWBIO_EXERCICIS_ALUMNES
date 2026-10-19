/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici8;
import java.util.Scanner;
/**
 *
 * @author ago4635
 */
public class Exercici8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 9.	Demana a l’usuari les pulsacions (batecs per minut) d’un pacient durant 5 minuts, i calcula la mitjana. Valores aleatorios entre 30 y 150.
        Scanner lector=new Scanner(System.in);
        for (int i=0;i<20;i++){

            if(i%2==0){
                System.out.println("A");
            }
            else{
                System.out.println("T");
            }
        }
    }
    
}
