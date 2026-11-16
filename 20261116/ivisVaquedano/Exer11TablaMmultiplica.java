/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer11tablammultiplica;

import java.util.Scanner;

/**
 *11. Programa que escribe la tabla de multiplicación de un número introducido 
 * por teclado. Es necesario implementar un método 
 * que reciba como parámetro un entero e imprima la tabla de multiplicación del entero recibido.
 * @author iva7943
 */
public class Exer11TablaMmultiplica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int dato = introdueixData("Introduce el numero que quieres multiplicar");
         tablaMultiplicar(dato);
    }
    

    public static int introdueixData(String frase)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(frase);
        int dato = sc.nextInt();
        return dato;
    }

public static int tablaMultiplicar (int numero ){
    System.out.println("Tabla de multiplicar del" + numero+ " :");
    for (int i = 1; i <= 10; i++ ){
    System.out.println(numero + "x " + i + "=" + (numero * i));
      
    
}
    return numero;
    
}
}