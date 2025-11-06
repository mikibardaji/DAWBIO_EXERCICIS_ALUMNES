/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2;

import java.util.Scanner;

/**
 *
 * @author jbl3198
 */
public class BlascoJoelEx5mod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double distancia = pedirDistanciaMilles();
        
        double distancia_km = millesAKm(distancia);

        resultado(distancia, distancia_km);
    }

    private static double millesAKm(double x){
        final double km = 1.6093;
        double dis_km = x * km;
        return dis_km;
    }
    
    private static double pedirDistanciaMilles(){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Posa la distancia en milles: ");

        double dist = sc.nextDouble();
        
        return dist;
        
    }
    
    private static void resultado(double x, double y){
        System.out.println("La distancia en de " + x + " milles en kilometres es de " + y + "km");
    }
}
    
    

