/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenpractica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author xabiel
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           // TODO code application logic here
         int puntosJugador = 0;
        int puntosMaquina = 0;
       

        Scanner sc = new Scanner(System.in);
        int puntosGanador = PedirPuntosVictoria();
        do {
            int usuario = jugadaUsuario();
            System.out.println(usuario);

            int maquina = jugadaOrdenador();
            System.out.println(maquina);

            imp_jugada("Usuario", usuario);
            imp_jugada("Máquina", maquina);

            int resultado = ganador(usuario, maquina);
            imp_ganador(resultado);

            if (resultado == 1) {
                puntosJugador = aumentar_punto(puntosJugador);
            } else if (resultado == 2) {
                puntosMaquina = aumentar_punto(puntosMaquina);
            }

            marcador(puntosJugador, puntosMaquina);

           

        } while (puntosJugador < puntosGanador && puntosMaquina < puntosGanador);

        System.out.println("Juego terminado. Resultado final:");
        marcador(puntosJugador, puntosMaquina);
    }
    public static int PedirPuntosVictoria(){
        Scanner sc = new Scanner(System.in);
        System.out.println("A cuantos puntos se decide el ganador?");
        return sc.nextInt();
               
    }
 //Made Abraham
    public static int jugadaUsuario() {
        int usuario;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese un valor (0 piedra, 1 papel, 2 tijera)");
            usuario = sc.nextInt();

            if (usuario < 0 || usuario > 2) {
                System.out.println("Número inválido");
            }
        } while (usuario < 0 || usuario > 2);

        return usuario;
    }
//Made abraham
    public static int jugadaOrdenador() {
        Random rd = new Random();
        return rd.nextInt(0, 3);
    }
//Made ricardo 
    public static void imp_jugada(String quien_juega, int escoge) {
        switch (escoge) {
            case 0:
                System.out.println(quien_juega + " ha elegido Piedra");
                break;
            case 1:
                System.out.println(quien_juega + " ha elegido Papel");
                break;
            case 2:
                System.out.println(quien_juega + " ha elegido Tijera");
                break;
        }
    }
//made Ricardo
    public static void imp_ganador(int ganador) {
        if (ganador == 0) {
            System.out.println("Hay empate");
        } else if (ganador == 1) {
            System.out.println("Has ganado");
        } else if (ganador == 2) {
            System.out.println("Ha ganado la máquina");
        }
    }
//made Ricardo
    public static int aumentar_punto(int score) {
        return score + 1;
    }
//made Ricardo
    public static void marcador(int point_player1, int point_player2) {
        System.out.println("Marcador -> Jugador: " + point_player1 + " | Máquina: " + point_player2);
    }
//made ricardo
    public static int ganador(int usuario, int maquina) {
      public static int ganador(int usuario, int maquina) {
      int ganador = 0;
      if((usuario == 0 && maquina == 2)|| 
         (usuario == 1 && maquina == 0) || 
         (usuario == 2 && maquina == 1))
      { ganador = 1; }
      else if (usuario == maquina){
      
      } 
      else { ganador = 2; }
    return ganador;
    
    }   

}





