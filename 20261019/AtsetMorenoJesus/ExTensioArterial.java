/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extensioarterial;

import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class ExTensioArterial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int tensio;
        int errores = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digame su tensión: ");
            tensio = lector.nextInt();
            if (tensio < 0){
                errores++;
            }
        }
        if (errores > 0){
            System.out.println("Ha habido un dato negativo!");
        }
    }
    
}
