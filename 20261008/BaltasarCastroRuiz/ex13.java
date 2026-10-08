/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;
import java.util.Scanner;
/**
 *
 * @author bca5802
 */
public class ex13 {
      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriu una lletra: ");
        char lletra = teclado.nextLine().charAt(0);

        System.out.println("Has introduit la lletra: " + lletra);
    }
}

