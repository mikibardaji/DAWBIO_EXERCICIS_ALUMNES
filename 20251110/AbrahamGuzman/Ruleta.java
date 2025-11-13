/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruleta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author agu3018
 */
public class Ruleta {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        // TODO code application logic here
         int saldo = AgregarPuntos(sc, 0); // Pide al jugador añadir saldo inicial
            boolean seguirJugando = true;

    while (seguirJugando && saldo > 0) {
        System.out.println("Tu saldo actual es: " + saldo + " puntos.");
        int apuesta = CantidadApostar(sc);

   
        while (validarApuesta(saldo, apuesta) == -1) {
            apuesta = CantidadApostar(sc);
        }

      
        int tipoApuesta = TipusApuesta(sc);

       
        int bolaResultado = bola();
        System.out.println("La bola ha caido en: " + bolaResultado);
        pintaAsterisc(bolaResultado);

     
        int saldoAntes = saldo;
        saldo = resultatJugada(tipoApuesta, saldo, apuesta, bolaResultado);

        
        if (saldo > saldoAntes) {
            System.out.println("¡Has ganado esta ronda!");
        } else {
            System.out.println("Has perdido esta ronda.");
        }

        System.out.println("Tu saldo actual es: " + saldo);

    
        if (saldo > 0) {
            System.out.println("¿Quieres seguir jugando? (s/n)");
            char opcion = sc.next().toLowerCase().charAt(0);

            if (opcion == 's') {
                System.out.println("¿Quieres añadir mas puntos antes de seguir? (s/n)");
                char recargar = sc.next().toLowerCase().charAt(0);
                if (recargar == 's') {
                    saldo = AgregarPuntos(sc, saldo);
                }
            } else {
                seguirJugando = false;
            }
        } else {
            System.out.println(" Te has quedado sin saldo. Fin del juego.");
        }
    }

    System.out.println(" Gracias por jugar a la Ruleta ");
        
        
        
    }
    public static int CantidadApostar(Scanner sc){
        int apuesta;       
        do{
         System.out.println("Cuanto dinero quiere apostar");
         apuesta = sc.nextInt();
        }while(apuesta < 0);
        
        return apuesta;
    }
    public static int AgregarPuntos(Scanner sc , int saldo){
        int puntos;
        do{
       
        System.out.println("Cuantos puntos quiere añadir");
        puntos = sc.nextInt();
        }while(puntos < 0);
        saldo +=puntos;
       return saldo;
    } 
    public static void pintaAsterisc (int numero){
        for (int i = 0; i <= numero; i++) {
            System.out.print("*");
        }
    }
    public static int bola(){
        Random rd = new Random();
        int bola = rd.nextInt(0, 37);
        return bola;
    }
    public static int TipusApuesta(Scanner sc){
        System.out.println("Que tipo de apuesta quiere realizar");
        System.out.println("1. -2 para pares");
        System.out.println("2. -1 para impar");
        System.out.println("3. cualquier otro para apostar hasta el 36");
        int eleccion = sc.nextInt();
        
      while(eleccion>36 || eleccion<-2){
        System.out.println("Has de triar una opció d'aposta vàlida");    
        eleccion = sc.nextInt();
        }

        return eleccion; 
        
    }
   public static int validarApuesta (int puntsTotal, int puntsAposta){
     if (puntsAposta>puntsTotal){
          System.out.println("La Apuesta supera su saldo vuelva a intentarlo"); 
         return -1;
        }
        else { 
         return puntsAposta;
     }
    }
    public static int resultatJugada(int tipusAposta,int saldo,int puntsAposta, int bola){
        
       if((tipusAposta == -2 && bola%2==0 && bola !=0) || (tipusAposta == -1 && bola%2!=0)){
         saldo += puntsAposta * 2;
      } else if (tipusAposta == bola){
           saldo += puntsAposta * 36;
      } else {
         saldo -=puntsAposta;
      }
      return saldo;
    } 
}






