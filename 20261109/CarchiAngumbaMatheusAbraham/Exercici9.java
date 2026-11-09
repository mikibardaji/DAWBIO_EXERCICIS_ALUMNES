/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcio2;
import java.util.Scanner;
import java.util.InputMismatchException;
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
        int num1 = preguntarNum("Digues un número: ");
        int num2 = preguntarNum("Ara digues un altre: ");
        int num3 = preguntarNum("I ara digues un altre: ");
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
    
    public static int preguntarNum(String frase) {
        Scanner lector = new Scanner(System.in);
        boolean valido = false;
        int resposta = 0;
        while (!valido) {
            try {
                System.out.print(frase);
                resposta = lector.nextInt();
                if (resposta >= 0) {
                    valido = true;
                } else {
                    System.out.println("Valor no valid, ha de ser positiu");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Carácter no valid, has de posar un número");
                lector.nextLine();
                valido = false;
            }
        }
        return resposta;
    }
    
}
