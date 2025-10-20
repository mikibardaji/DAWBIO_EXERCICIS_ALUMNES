/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivina;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * 
 */
public class Adivina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
       
        int max = 100, min = 1;
        int maquina;
        char usuario;
        boolean acerto = false;
        int intentos,conmas = 0, conmenos = 0;
        System.out.println("Piensa en un numero entre 1 y 100, y lo intentare adivinar 😎");
        System.out.println("Cuantos intentos me quieres dar 😊");
        intentos = sc.nextInt();
        do {
            System.out.println("Rango actual: " + min + " - " + max);

            maquina = rd.nextInt(min, max + 1);
          
            System.out.println("¿Tu numero es " + maquina + "? (S/N)");
            usuario = sc.next().charAt(0); 
                
            
            if (usuario == 's' || usuario == 'S') {
                System.out.println("Lo adivine 😁");
                acerto = true;
            } else if (usuario == 'n' || usuario == 'N') {
                System.out.println("¿Tu numero es mayor (+) o menor (-)?");
                usuario = sc.next().charAt(0);

                if (usuario == '+') {
                    min = maquina + 1;
                    conmas++;
                    intentos--;
                } else if (usuario == '-') {
                    max = maquina - 1;
                    conmenos++;
                    intentos--;
                } else {
                    System.out.println("Opcion no valida 😐");
                }

                
                if ((min > max) || (min == max && (usuario == '+' || usuario == '-'))) {
                    System.out.println("¡Estas haciendo trampas! 😡");
                    acerto = true; 
                }
            } else {
                System.out.println("Respuesta no valida, usa S o N.");
            }
            
            
            
             System.out.println("Me quedan "+ intentos);
        } while (!acerto && intentos!=0);
                 if(acerto == true){
                          System.out.println("Te he ganado 😎");
                    
                 }else{
                 System.out.println("Me has ganado 😭");
                 
    }System.out.println("He hecho " + (conmas + conmenos) + " intentos, he dicho " + conmas + " veces un numero mas pequeño y " + conmenos + " veces un numero mas grande.");
    }
    
}



