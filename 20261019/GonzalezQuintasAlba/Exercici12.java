/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici12;
import java.lang.Math;
/**
 *
 * @author ago4635
 */
public class Exercici12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 12.	Comptador de cèl·lules dividides
Una cèl·lula es divideix en dues cada hora. Mostra quantes cèl·lules hi ha després de 1, 2, 3, ..., 10 hores.
Hora 1 → 2 cèl·lules
Hora 2 → 4 cèl·lules
Hora 3 → 8 cèl·lules
...*/
      double celulas=0;
      for(int i=1;i<=10;i++){
          celulas=Math.pow(2,i);
          System.out.println("El numero de celulas despues de "+i+"hores es "+celulas);
      }

    }
    
}
