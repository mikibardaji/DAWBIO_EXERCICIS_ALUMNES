/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2_valors;
import java.util.Scanner;

/**
 *
 * @author gga2951
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double multi,suma,resta,divi;
        Scanner lector = new Scanner(System.in);
        System.out.print("Introdueix el primer valor:");
        double valor1 = lector.nextInt();
        System.out.print("Introdueix el segon valor:");
        double valor2 = lector.nextInt();
        suma = valor1 + valor2;
        resta = valor1 - valor2;
        divi = valor1 / valor2;
        multi = valor1 * valor2;
        System.out.println("la seva suma "+ suma +" La seva resta "+ resta +" La seva multiplicació "+ multi + " La seva divisió " + divi);
        
    }
    
}
