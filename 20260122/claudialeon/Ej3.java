/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;
import java.util.Scanner;
/**
 *
 * @author claud
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        //Crea un programa que pida diez números reales por teclado, los almacene en un array, y
        //luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
    int[]notas;
    notas= new int[20];
    introducirDatos(notas);
    mostrarArray(notas);
    }
    public static void introducirDatos(int[] notas){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<notas.length; i++){
            System.out.println("Pon el valor de la posicion " +i+ ": ");
            notas[i] = sc.nextInt();
        }
    }
    public static void mostrarArray( int[] notas){
        
        int minim = notas[0];
        int maxim = notas[0];
        
       for(int i=0; i<notas.length; i++){
            System.out.println("Posicio-" +i+ ": " + notas[i]);
            if(notas[i]<minim){
                minim=notas[i];
            }
            if(notas[i]>maxim){
                maxim=notas[i];
            }
        } 
       System.out.println("El valor maxim es: " + minim);
       System.out.println("El valor minim es: " + maxim);
    }

}
