/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5funcions;

import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class Ex5Funcions {

    /**
     * @param args the command line arguments
   
     5.Programa que demana a l’usuari una distància 
     mesurada en milles i mostra el seu equivalent 
     en quilòmetres (1 milla = 1,6093 km). 
     Ha d’implementar un mètode amb el prototip 
     double millesAKm(int milles).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double numeromillas, resultado;
        
        numeromillas = pedirmillas();
        
        resultado = millasKilometres((int) numeromillas);
        
        mostrarResultado(resultado);
        
        
    }
    
    public static double pedirmillas(){
        
        
        double millas;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime millas");
        millas = sc.nextDouble();
        
        return millas;
        
    }
    
    
    public static double millasKilometres(double millas){
        double resultado = millas * 1.6083;
        return resultado;
    }
    
    
    public static void mostrarResultado(double resultado){
        
        System.out.println("Tus millas, Equivalen a : " +resultado + " Kms");
        
    }
    
    
    
    
}
