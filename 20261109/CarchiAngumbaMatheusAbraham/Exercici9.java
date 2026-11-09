/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcio2;
import java.util.Scanner;
/**
 *
 * @author mca3765
 */
public class Funcio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digues un número: ");
        int num1 = preguntarNum();
        System.out.println("Ara digues un altre: ");
        int num2 = preguntarNum();
        System.out.println("I ara digues un altre: ");
        int num3 = preguntarNum();
        int gran = major(num1,num3);
        gran = major(gran,num2);
        System.out.println("El numero més gran es: "+ gran);
    }
    
    public static int major(int x, int y) {
        if (x>=y) {
            return x;
        } else {
            return y;
        }
    }
    
    public static int preguntarNum() {
        Scanner lector = new Scanner(System.in);
        int resposta = lector.nextInt();
        return resposta;
    }
    
}
