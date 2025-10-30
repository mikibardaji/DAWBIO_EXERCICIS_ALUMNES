/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23.pkg10_exam_last_year;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jfo9565
 */
public class Endevina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();
        
        int opcion,tiradas = 0,numeroUser;
        int numeroMaq = rdm.nextInt(10);
        String mensaje = "";
        
        do {
            
            System.out.println("\nElige una opcion:\n0._Salir\n1._Intrucciones de juego\n2._Tiradas\n3._Jugar");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 0:
                    System.out.println("Hasta la proxima");
                    
                    break;
                
                case 1:
                    System.out.println("\nInstrucciones:");
                    System.out.println("A._Entra al 2 para indicar el numero de tiradas");
                    System.out.println("B._Presiona 3 para empezar a jugar");
                    
                    break;
                
                case 2:
                    System.out.println("\nCuantas tiradas vas a querer hacer?");
                    tiradas = sc.nextInt();
                    
                    break;
                
                case 3:
                    if (tiradas > 0) {
                        do {
                        
                            System.out.print("Adivina el numero:");
                            numeroUser = sc.nextInt();
                            tiradas--;
                        
                            if (numeroUser == numeroMaq) {
                                System.out.println("Has ganado");
                            }else{
                                if (numeroUser != numeroMaq && tiradas > 0){ 
                                    mensaje = "No has acertado.Te quedan " + tiradas + " tiradas";
                            
                                }else{
                                    mensaje = "Lo siento, has perdido.El numero era "  + numeroMaq;
                            
                                }
                                System.out.println(mensaje);
                            }
                        
                        }while (tiradas > 0 && numeroUser != numeroMaq);
                            tiradas = 0;
                            numeroMaq = rdm.nextInt(10);
                    }else{
                        System.out.println("\nNo puedes jugar primero debes elegir el numero de tiradas");
                    }
                   
                    
                    break;
                default:
                    System.out.println("Opcion invalida,vulve a intentarlo.");
            }
        } while (opcion != 0);
        
    }
    
}
