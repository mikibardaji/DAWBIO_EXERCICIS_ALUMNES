/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici7;
import java.util.Scanner;
/**
 *
 * @author ago4635
 */
public class Exercici7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 7.	Un cop realitzat el 6, també al acabar te que dir quants negatius hi havia. (A l’exercici anterior sol te que avisar que n’hi hagut algún..).
    Scanner lector=new Scanner(System.in);
        int tension=0;
        int cont=0;
        for (int i=0;i<10;i++){
            System.out.print("Introduzca medida "+(i+1)+" de tension : ");
            tension=lector.nextInt();
            if(tension<0){
                System.out.println("Ha introducido un valor negativo. Es una situación critica.");
                cont++;
            }
        }
        System.out.println("Gracias por introducir sus medidas de tension");
        System.out.println("El numero de medidas de tension negativas han sido "+cont);
    }
    
}
