/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6;
import java.util.Scanner;
/**
 *
 * @author ago4635
 */
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.	El programa llegeix 10 valors de tensió arterial (no nuls) i, en acabar, mostra un missatge indicant si s’ha detectat algun valor crític —és a dir, si algun valor ha estat negatiu, cosa que indicaria un error de mesura o un pacient fictici
        
        Scanner lector=new Scanner(System.in);
        int tension=0;
        for (int i=0;i<10;i++){
            System.out.print("Introduzca medida "+(i+1)+" de tension : ");
            tension=lector.nextInt();
            if(tension<0){
                System.out.println("Ha introducido un valor negativo. Es una situación critica.");
            }
        }
        System.out.println("Gracias por introducir sus medidas de tension");
    }
    
}
