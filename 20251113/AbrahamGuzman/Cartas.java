/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartas;

import java.util.Random;

/**
 *
 * @author agu3018
 */
public class Cartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Random rd = new Random();
         
         int carta = numeroCartaAleatori(rd);
         System.out.println(carta);
         int paloCarto = palCartaAletori(rd);
         
         imprimirCarta(carta, paloCarto);
        
    }
    public static int numeroCartaAleatori(Random rd){
       
        int carta = rd.nextInt(1, 11);
        if(carta > 7){
        carta += 2;
}
        
        return carta;
    }
    public static int palCartaAletori(Random rd){
       int palo = rd.nextInt(1, 5);
       return palo;
    }
    public static void imprimirCarta(int numeroCarta, int paloCarta){
        String palo = "";

        switch (paloCarta) {
            case 1:
             palo = "Oros";
            break;
            case 2:
             palo = "Bastos";
            break;
            case 3:
             palo = "Espadas";
            break;
            case 4:
             palo = "Copas";
            break;

    }

    switch (numeroCarta) {
        case 10:
            System.out.println("Sota de " + palo);
            break;
        case 11:
            System.out.println("Caballo de " + palo);
            break;
        case 12:
            System.out.println("Rey de " + palo);
            break;
        default:
            System.out.println(numeroCarta + " de " + palo);
            break;
    }
        
    }
    public static double puntsCarta(int numeroCarta){
     if(numeroCarta < 8){
      return numeroCarta; 
    } else {
       return 0.5;
     }
    }
    public static boolean bancoDemanaCarta(int puntosJugador, int puntosBanca){
    if((puntosJugador <= 7.5 && puntosBanca < puntosJugador) ){
      return true;
    } else {
      return false;
    }
    }
    public static boolean guanyaJugador(int puntosJugador, int puntosBanca){
    if((puntosJugador <= 7.5 && puntosBanca < puntosJugador)|| (puntosJugador > 7.5) ){
      return true;
    } else {
      return false;
    }
    }
}
