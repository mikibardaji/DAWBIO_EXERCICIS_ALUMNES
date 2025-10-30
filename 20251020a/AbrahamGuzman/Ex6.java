/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diseñomodular;

import java.util.Scanner;

/**
 *
 * @author agu3018
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             int x =numero(1) ;
             int y = numero(2);
        
        int compara = compara(x, y);
        
        mostrar(compara, x, y);
 
        
    }
    public static int numero(int x){
          Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        return  sc.nextInt();
    }
    public static int compara(int x, int y){
       int compara = 0;
        if(x > y){
         compara =-1; 
        }else if(y > x){
        compara = 1;
        }
        
        return compara;
    }
    public static void mostrar(int compara, int x, int y){
     switch (compara) {
            case -1:
                System.out.println("El primer numero "+x+ " es mayor que el segundo "+y);
                break;
            case 0:
                 System.out.println("Los numeros son iguales " +y);
                break;
            case 1:
                 System.out.println("El primer numero "+x+ " es menor que el segundo "+y);
                break;
        }
    }
}
