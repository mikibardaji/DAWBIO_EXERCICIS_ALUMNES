/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areacuadrado;

import java.util.Scanner;


/**
 *
 * @author esa7092
 */
public class AreaCuadrado {

    /**
     * @param args the command line arguments
     * 
     * Mostrar cuanto mide el lado del cuadrado
       Esperar logintud_lado
       Calcular areaCuadrado = longitud_Lado x longitudLado
       Mostrar La area del cuadrado es: + areaCuadrado
     * 
     */
    public static void main(String[] args) {
        //declaramos variables
        double longitud_lado ;
        double areaCuadrado;
    
        
        Scanner lector = new Scanner(System.in);
        
        //Mostrar cuanto mide el lado del cuandrado
        System.out.println("Cuanto mide el lado del cuadro: ");
        longitud_lado = lector.nextDouble();
        
        //Calculamos area del cuadrado
        areaCuadrado = longitud_lado *  longitud_lado;
        
        
        
        //Mostramos por pantalla
        System.out.println("El area de lado es: " + areaCuadrado);
        
        
        
        
        
    
    
    
    
    
    
    
    }
    
}
