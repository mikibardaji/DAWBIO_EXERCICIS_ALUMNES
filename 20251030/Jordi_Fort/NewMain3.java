/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg30.pkg10_funciones;

import java.util.Scanner;

/**
 *
 * @author jfo9565
 */
public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int miles;
        double km;
        
        miles = pedirMillas();
        km = milesToKilometers(miles);
        mostrarResultado(miles, km);
        
    }
    
    public static int pedirMillas()
    {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.print("Dime las millas: ");
        numero = sc.nextInt();
        
        while (numero < 0) {
            System.out.println("Las millas deben ser positivas: ");
            numero = sc.nextInt();
        }
        
        return numero;
    }
    
    public static double milesToKilometers(int miles)
    {
        double mileToKm = 1.6093;
        
        mileToKm *= miles; 
        
        return mileToKm;
    }
    
    public static void mostrarResultado(double miles, double km)
    {
        System.out.println(miles + " millas son iguales a " + km + "km");
    }
    
}
