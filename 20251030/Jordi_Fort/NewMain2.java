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
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1;
        
        num1 = pedirNumero();
        
        mostrarResultado(comparador(num1));
        
       
    }
    
    public static int pedirNumero()
    {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.print("Dime un numero:");
        numero = sc.nextInt();
        
        return numero;
    }
    
    public static String comparador(int x)
    {
        String resultado;
        if (x > 0) {
            resultado = "+1";
        }else if(x < 0){
            resultado = "-1";
        }else{
            resultado = "0";
        }
        return resultado;
    }
    
    public static void mostrarResultado(String x)
    {
        System.out.println("El numero es: " + x);
    }
    
}
