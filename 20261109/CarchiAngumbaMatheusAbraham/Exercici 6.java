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
        System.out.print("Dona'm un valor sencer: ");
        int valor1 = lector.nextInt();
        System.out.print("I ara un altre: ");
        int valor2 = lector.nextInt();
        int resultat = compara(valor1,valor2);
        switch (resultat) {
            case -1:
                System.out.println("El primer numero es mes petit");
                break;
            case 0:
                System.out.println("Son igual");
                break;
            case 1:
                System.out.println("El primer numero es mes gran");
                break;
        }
    }
    
    public static int compara(int x, int y){
        if (x==y) {
            return 0;
        } else if (x>y) {
            return 1;
        } else {
            return -1;
        }
    }

}
