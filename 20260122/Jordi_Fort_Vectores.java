/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author jfo9565
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        ejercicio7();
        
        
    }
    
    public static void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        int notas[] = new int[5];
        
        System.out.println("Vamos a introducir 5 numeros en un array");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Dime un numero: ");
            notas[i] = sc.nextInt();
        }
        
        System.out.println("ahora vamos a mostrar todos los numeros que introdujiste.");
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("numero en indice " + i + ": " + notas[i]);
        }
    }
    
    public static void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        int notas[] = new int[5];
        int n = 0;
        
        System.out.println("Vamos a introducir 5 numeros en un array");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Dime un numero: ");
            notas[i] = sc.nextInt();
        }
        
        System.out.println("ahora vamos a mostrar todos los numeros que introdujiste sumados.");
        
        for (int i = 0; i < notas.length; i++) {
            n += notas[i];
        }
        System.out.println("La suma de los numero que introdujiste es " + n);
    }
    
    public static void ejercicio3(){
        Scanner sc = new Scanner(System.in);
        int notas[] = new int[5];
        int n = 0,m;
        
        System.out.println("Vamos a introducir 5 numeros en un array");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Dime un numero: ");
            notas[i] = sc.nextInt();
        }
        
        System.out.println("ahora vamos a mostrar el numero mas alto y el mas bajo.");
        
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > n) {
                n = notas[i];
            }
        }
        
        m = notas[0];
        
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < m) {
                m = notas[i];
            }
        }
        System.out.println("El mas alto: " + n + "\nEl mas bajo: " + m);
    }
    
    public static void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        int notas[] = new int[10];
        int p = 0,n = 0;
        
        System.out.println("Vamos a introducir 10 numeros en un array");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Dime un numero: ");
            notas[i] = sc.nextInt();
        }
        
        System.out.println("ahora vamos a mostrar todos los numeros que introdujiste sumados.");
        
        for (int i = 0; i < notas.length; i++) {
            
            if (notas[i] < 0) {
                n += notas[i];
            }else{
                 p += notas[i];
            }
            
        }
        System.out.println("La suma de los numero positvos que introdujiste es " + p +
                            "\nLa suma de los numero negativos que introdujiste es " + n);
    }
    
    public static void ejercicio5(){
        Scanner sc = new Scanner(System.in);
        int notas[] = new int[10];
        int acumulador = 0, promedio;
        
        System.out.println("Vamos a introducir 10 numeros en un array");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Dime un numero: ");
            notas[i] = sc.nextInt();
        }
        
        System.out.println("ahora vamos a mostrar el promedio de los numeros que introdujiste.");
        
        for (int i = 0; i < notas.length; i++) {
            acumulador += notas[i];
        }
        
        promedio = acumulador / (notas.length);
        System.out.println("El promedio de los numeros que introdujiste es: " + promedio);
    }
    
    public static void ejercicio6(){
        Scanner sc = new Scanner(System.in);
        int n, m;
        
        System.out.print("Dime un numero:");
        n = sc.nextInt();
        System.out.print("Dime otro numero:");
        m = sc.nextInt();
        
        int numeros[] = new int[n];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = m;
        }
        
        System.out.println("He creado un array con " + n  + " posiciones y en cada posicion "
                + "he puesto " + m + ". Te lo muestro.");
        
        for (int i = 0; i < n; i++) {
            System.out.println("numero en indice " + i + ": " + numeros[i]);
        }
    }
    
    public static void ejercicio7(){
        Scanner sc = new Scanner(System.in);
        int n, m, x = 0, v = 0, b = 0, c = 0;
        
        System.out.print("Dime un numero:");
        n = sc.nextInt();
        System.out.print("Dime otro numero:");
        m = sc.nextInt();
        if (n > m) {
            x = n - m + 1;
            v = n;
            b = m;
        }else if(m > n){
            x = m - n + 1;
            v = m;
            b = n;
        }else{
            System.out.println("Los dos numeros son iguales :(");
            v = m;
            b = m;
        }
        
        int numeros[] = new int[x];
        
        for (int i = b; i <= v; i++) {
            numeros[c] = i;
            c++;
        }
        
        System.out.println("He creado un array con los numeros entre " + b + " y " + v);
        
        for (int i = 0; i < x; i++) {
            System.out.println("numero en indice " + i + ": " + numeros[i]);
        }
    }
    
}
