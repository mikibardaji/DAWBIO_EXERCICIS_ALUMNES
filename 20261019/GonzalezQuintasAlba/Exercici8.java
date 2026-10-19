/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici8;

/**
 *
 * @author ago4635
 */
public class Exercici8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 8.	Mostra per pantalla una cadena de 20 lletres alternant A i T (adenina i timina):
 
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
