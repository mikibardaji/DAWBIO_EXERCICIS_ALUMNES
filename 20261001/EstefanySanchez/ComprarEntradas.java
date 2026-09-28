/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comprarentradas;

import java.util.Scanner;


/**
 *
 * @author esa7092
 */
public class ComprarEntradas {

    /**
     * @param args the command line arguments
     * 
     * Mostar cuanto dinero tienes
     * Esperar dineroCartera 
     * Mostrar cuantas entradas has comprado?
     * Esperar numEntradas
     * Mostrar cuanto vale una entrada?
     * Esperar precioEntrada
     * Calcular precioDeEntradasTotal = precioEntrada * numEntradas
     * Calcular dineroRestante dineroCartera precioEntradasTotal
     * Mostra "Te queda " + dineroRestante
     * 
     */
    public static void main(String[] args) {
        //declaramos variables
        double dineroCartera;
        int numEntradas;
        double precioEntradas;
        double precioDeEntradasTotal;
        double dineroRestante;
        Scanner lector = new Scanner(System.in);
        
        //Mostrar cuanto dinero tienes
        System.out.println("Cuanto dinero tienes: ");
        dineroCartera = lector.nextDouble();
        
        
        //Mostrar cuantas entradas tienes
        System.out.println("Mostrar cuantas entradas has comprado: ");
        numEntradas = lector.nextInt();
        
        
        //Mostrar cuanto vale una entrada
        System.out.println("Çuanto vale una entrada: ");
        precioEntradas = lector.nextDouble();
        
        //hacemos calculo
        precioDeEntradasTotal = precioEntradas * numEntradas;
        
        //calculamos dinero restante
        dineroRestante = dineroCartera - precioDeEntradasTotal;
        
        System.out.println("Te queda: " + dineroRestante);
        
        
        
        
        
        
        
        
        //
        
        
        
        
        
        
        
    }
    
}
