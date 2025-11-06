/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Wenfu_Jordi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jfo9565
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int jugador, ordenador, ganador, ptJugador1 = 0, ptJugador2 = 0;
        
        jugador = jugada();
        ordenador = jugada_ordenador();
        
        imp_jugada("Jugador 1", jugador);
        imp_jugada("ordenador", ordenador);
        
        ganador = ganador(jugador, ordenador);
        
        imp_ganador(ganador);
        
        aumentarPunto(ganador);
        
        marcador(ptJugador1, ptJugador2);
        
    }
    
    public static void marcador(int point_player1, int point_player2)
    {
        System.out.println("Puntos jugador1: " + point_player1);
        System.out.println("Puntos jugador2: " + point_player2);
    }
    
    public static int aumentarPunto(int score)
    {
        score++;
        return score;
    }
    
    public static int ganador(int choose_player1, int choose_player2)
    {
        int resultado;
        
        switch (choose_player1) {
            case 0:
                if (choose_player2 == 0) {
                    resultado = 0;
                }else if (choose_player2 == 1) {
                    resultado = 2;
                }else{
                    resultado = 1;
                }   break;
            case 1:
                if (choose_player2 == 0) {
                    resultado = 1;
                }else if (choose_player2 == 1) {
                    resultado = 0;
                }else{
                    resultado = 2;
                }   break;
            case 2:
                if (choose_player2 == 0) {
                    resultado = 2;
                }else if (choose_player2 == 1) {
                    resultado = 1;
                }else{
                    resultado = 0;
                }   break;
                
            default:
                resultado = -1;
        }
        
        
        return resultado;
    }
    
    public static int jugada()
    {
        Scanner sc = new Scanner(System.in);
        int eleccion;
        
        do
        {
            System.out.println("que sacas? (0 piedra, 1 papel, 2 tijera)");
            eleccion = sc.nextInt();
        } while(eleccion > 2 || eleccion < 0);
            return eleccion;
}

    public static int jugada_ordenador()
    {
        Random rd = new Random();
        int eleccion_maquina;

        eleccion_maquina = rd.nextInt(0, 3);
        
        return eleccion_maquina;
    }

    public static void imp_jugada(String quien_juega, int choose)
    {
        String eleccion;
        
        if (choose == 0) {
        eleccion = "piedra";
        }
        else if (choose == 1) {
        eleccion = "papel";
        }
        else if (choose == 2) {
        eleccion = "tijera";
        }
        else
        {
        eleccion = "error";
        }

        System.out.println(quien_juega + ": " + eleccion);
    }

    public static void imp_ganador(int ganador)
    {
        if (ganador == 0) {
            System.out.println("Hay empate");
        }
        else if (ganador == 1) {
            System.out.println("Has ganado");
        }
        else if (ganador == 2) {
            System.out.println("Ha ganado la maquina");
        }
        else
        {
            System.out.println("Error");
        }
    }
    
}
