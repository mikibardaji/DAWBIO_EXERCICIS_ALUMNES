/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to edit this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivoonegativo;

import java.util.Scanner;

/**
 * 4. Programa que pide al usuario un número entero y muestra si es positivo,
 * cero o negativo. Es necesario crear el método int obteSigne(int x), el cual
 * devuelve -1, 0, +1 según el número es negativo, cero o positivo,
 * respectivamente.
 *
 * @author iva7943
 */
public class PositivoOnegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num = pedirNumero("Dime un numero entero: ");
        
        int resultado = obteSigne(num);
        mostrarResultado(resultado);
    }

   
    public static int pedirNumero(String frase) {
        Scanner sc = new Scanner(System.in);
        System.out.print(frase);
        return sc.nextInt();
    }


    public static void mostrarResultado(int resultado) {
        if (resultado == 1) {
            System.out.println("Es positivo");
        } else if (resultado == -1) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }
    }


    public static int obteSigne(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
