/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercisesapp;

import java.util.Random;

/**
 *
 * @author chris
 */
public class ExercisesApp {

    public static void main(String[] args) {
        // imprimir(numero_carta_aleatori(), pal_carta_aleatori());
        // System.out.println(punts_carta(numero_carta_aleatori()));
        
        // Puntos iniciales
        System.out.println("Puntos Iniciales");
        double bancaPoint = punts_carta(numero_carta_aleatori());
        double playerPoint = punts_carta(numero_carta_aleatori());
        
        System.out.println("puntos del jugador: " + playerPoint);
        System.out.println("puntos del banca: " + bancaPoint);
        
        boolean bancaPedir = banca_demana_carta(playerPoint, bancaPoint);
        System.out.println(bancaPedir);
        System.out.println("Comprobar si pedir carta...");
        
        while(bancaPedir){
            bancaPoint = bancaPoint + punts_carta(numero_carta_aleatori());
            
            System.out.println("puntos del jugador: " + playerPoint);
            System.out.println("puntos del banca: " + bancaPoint);
            
            bancaPedir = banca_demana_carta(playerPoint, bancaPoint);
            System.out.println(bancaPedir);
            
        }
        System.out.println("No se pidió carta!!!");
        
        boolean playerWin = guanya_jugador(playerPoint, bancaPoint);
        
        if(playerWin) 
            System.out.println("Has ganado!!!!!");
        else System.out.println("Sorry, has perdido");
        
    }

    public static int numero_carta_aleatori() {
        Random rand = new Random(); // Crear instancia de la clase Random
        int numCart = rand.nextInt(10) + 1; // 0-9 + 1 -> 1+10

        // Comprobar si el numero es válido
        if (numCart == 8) {
            return 10;
        }
        if (numCart == 9) {
            return 11;
        }
        if (numCart == 10) {
            return 12;
        }

        return numCart;
    }

    public static int pal_carta_aleatori() {
        Random rand = new Random(); // Crear instancia de la clase Random

        return rand.nextInt(4) + 1; // 0-4 + 1 -> 1+4
    }

    public static void imprimir(int numCart, int numPal) {
        String pal = "";
        if (numPal == 1) {
            pal = "ORO";
        }
        if (numPal == 2) {
            pal = "BASTO";
        }
        if (numPal == 3) {
            pal = "ESPADAS";
        }
        if (numPal == 4) {
            pal = "COPA";
        }

        System.out.println(numCart + " " + pal);
    }

    public static double punts_carta(int numCart) {
        double point = 0;

        if (numCart >= 1 && numCart <= 7) {
            point = numCart;
            return point;
        }

        return 0.5;
    }

    public static boolean banca_demana_carta(double playerPoint, double bancaPoint) {
        boolean pedirCarta = false;

        if (playerPoint <= 7.5 && bancaPoint < playerPoint || bancaPoint < 5) {
            pedirCarta = true;
        }

        return pedirCarta;
    }
    
    public static boolean guanya_jugador (double playerPoint, double bancaPoint){
        boolean playerWin = false;
        
        if(playerPoint <= 7.5 && playerPoint > bancaPoint || bancaPoint > 7.5)
            playerWin = true;

        return playerWin;
    }
}
