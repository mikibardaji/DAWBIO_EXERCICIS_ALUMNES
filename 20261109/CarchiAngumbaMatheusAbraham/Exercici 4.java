/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions;
import java.util.Scanner;
/**
 *
 * @author mca3765
 */
public class Funcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime un valor entero: ");
        int valor = lector.nextInt();
        int resultat = obteSigne(valor);
        switch (resultat) {
            case -1:
                System.out.println("El numero es negativo");
                break;
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es positivo");
                break;
        }
    }
    
    public static int obteSigne(int x){
        if (x>0) {
            return 1;
        } else if (x==0) {
            return 0;
        } else {
            return -1;
        }
    }

}
