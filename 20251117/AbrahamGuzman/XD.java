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
public class XD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // TODO code application logic here
         Random rd = new Random();
         Scanner sc = new Scanner(System.in);
             char seguir = ' ';
        int carta_jug, pal_jug, carta_machine, pal_machine;
        double punto_jug=0, punto_machine=0;
        
        do
        {
            carta_jug = numeroCartaAleatori(rd);
            pal_jug = palCartaAletori(rd);
            imprimirCarta(carta_jug, pal_jug);
            //Acumula los puntos del jugador 
            punto_jug += puntsCarta(carta_jug);
            if(seguir =='n'){
            punto_jug -= puntsCarta(carta_jug);
            }
            System.out.println("Puntos " + punto_jug);
            if(bancoDemanaCarta(punto_jug, punto_machine))
           {    
                System.out.println("La banca pide carta");
                carta_machine = numeroCartaAleatori(rd);
                pal_machine = palCartaAletori(rd);
                imprimirCarta(carta_machine, pal_machine);
                //Acumula los puntos de la maquina 
                punto_machine += puntsCarta(carta_machine);
            }
            System.out.println(bancoDemanaCarta(punto_jug, punto_machine));
            System.out.println("Tu : " + punto_jug + " maquina: " + punto_machine);
            seguir = plantarse();
          //Arregle el fallo de logica que habia tanto en el seguir como el &&
        }while(seguir!='n' || bancoDemanaCarta(punto_jug, punto_machine));
        
       
        if(guanyaJugador(punto_jug, punto_machine))
        {
            System.out.println("Has ganado");
        }
        else
        {
            System.out.println("Has perdido");
        }
        
       
    } 
    public static char plantarse()
    {
        Scanner sc = new Scanner(System.in);
        char seguir;
        do
        {
        System.out.println("Quieres mas cartas(s/n)");
        seguir = sc.next().toLowerCase().charAt(0);
        }while(seguir!='s' && seguir != 'n');
        return seguir;
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
    public static void imprimirCarta( int numeroCarta, int paloCarta){
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
    public static boolean bancoDemanaCarta(double puntosJugador, double puntosBanca){
    if((puntosJugador <= 7.5 && puntosBanca < puntosJugador) || (puntosBanca < 5) ){
      return true;
    } else {
      return false;
    }
    }
    public static boolean guanyaJugador(double puntosJugador, double puntosBanca){
    if((puntosJugador <= 7.5 && puntosBanca < puntosJugador)|| (puntosJugador > 7.5) ){
      return true;
    } else {
      return false;
    }
    }
}
