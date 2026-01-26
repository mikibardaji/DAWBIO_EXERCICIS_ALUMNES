/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author agu3018
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int [] numero = new int [10];
        char opcion = ' ';
        
        do{
        
            System.out.println("Introduce a para mostrar que numeros hay en el array ");
            System.out.println("Introduce b para introducir numeros en el array ");
            System.out.println("introduce c para salir");
            opcion = sc.next().toLowerCase().charAt(0);
            
            switch (opcion) {
                case 'a':
                    mostrarValores(numero);
                    break;
                case 'b':
                    
                    break;
                case 'c':
                    
                    break;
                default:
                    System.out.println("Valor no valido ingrese un valor valido");
            }
            
            
        }while(opcion != 'c');
        
        
    }
    
    public static void mostrarValores(int [] numeros){
    
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] +"  ");
            
        }
    
    }
   
    public int [] ingresarUnvalor(int [] numeros){
        Scanner sc = new Scanner(System.in);
        int posicion = 0;
        int valor = 0;
      
        System.out.println("Ingrese la posicion donde desea guardar el numero ");
        posicion = sc.nextInt();
       while(posicion > 10){
           System.out.println("La posicion ingresada es mayor al array por favor ingrese otra");
            posicion = sc.nextInt();
       }
      
          if(numeros[posicion] != 0){
              System.out.println("Ya hay un valor en esta posicion quieres cambiarlo s/n");
              char respuesta = sc.next().toLowerCase().charAt(0);
              
              while(respuesta != 's' && respuesta !='n'){
                System.out.println("Ya hay un valor en esta posicion quieres cambiarlo s/n");
               respuesta = sc.next().toLowerCase().charAt(0);
              }
              
              if(respuesta == 's'){
                   
       System.out.println("Ingrese la posicion donde desea guardar el numero ");
        valor = sc.nextInt();
                  while(valor == 0){
           System.out.println("el valor agregado no es valido");
            valor= sc.nextInt();
              }
             numeros[posicion] = valor;
         }
       
       
       }
       
     return numeros; 
    }
}
