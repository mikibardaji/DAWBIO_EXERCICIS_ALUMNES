
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cme4538
 *
 * 3.Programa que demana a l’usuari dos números enters i mostra
 * quin és el menor. Cal implementar i usar el mètode int menor(
 * int x, int y), el qual retorna el menor dels dos passats com a paràmetres.
 */
public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double valor1, valor2;
        System.out.println("Dime dos números y te diré cual es mayor.");
        System.out.println("Dime el primer valor:");
        valor1 = sc.nextDouble();
        System.out.println("Dime el segundo valor");
        valor2 = sc.nextDouble();
        
        System.out.println("El valor que es más grande es: " + maximo(valor1, valor2));
        
    }

    public static double maximo(double valor1, double valor2) {
        double max;

        if (valor1 > valor2) {
            max = valor1;
        } else {
            max = valor2; // si son iguales entrará por el else porque es en el resto de casos
        }
        return max;

    }
}
