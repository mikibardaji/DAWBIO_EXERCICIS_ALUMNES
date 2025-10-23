package Funciones;

import java.util.Scanner;

public class Ex1A2 {
  public static double producte(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Introdueix el primer número : ");
        double num1 = entrada.nextDouble();

        System.out.print("Introdueix el segon número : ");
        double num2 = entrada.nextDouble();

       
        double resultat = producte(num1, num2);

        
        System.out.println("El producte és: " + resultat);
}
}
     
    
    
