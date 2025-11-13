/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sieteymedio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class SieteYMedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char seguir;
        int carta_jug, pal_jug, carta_machine, pal_machine;
        double punto_jug=0, punto_machine=0;
        
        do
        {
            carta_jug = numeroCartaAleatori();
            pal_jug = palCartaAleatori();
            imprimirCarta(carta_jug, pal_jug);
            punto_jug = puntsCarta(carta_jug);
            System.out.println("Puntos " + punto_jug);
            if (bancaDemanaCarta(punto_jug, punto_machine))
            {
                System.out.println("La banca pide carta");
                carta_machine = numeroCartaAleatori();
                pal_machine = palCartaAleatori();
                imprimirCarta(carta_machine, pal_machine);
                punto_machine = puntsCarta(carta_machine);
            }
            System.out.println("Tu : " + punto_jug + " maquina: " + punto_machine);
            seguir = plantarse();
        }while(seguir!='s' && bancaDemanaCarta(punto_jug, punto_machine));
        
        if(guanyaJugador(punto_jug, punto_machine))
        {
            System.out.println("Has ganado");
        }
        else
        {
            System.out.println("Has perdido");
        }
        
       
    }
    
    
    /*
    Funció numero_carta_aleatori (0.5 punts)
    Paràmetre d’entrada	Cap paràmetre
    Paràmetre de sortida	La funció ha de generar un valor aleatori entre 1 i 10 (inclosos).

    Si el número obtingut és 8, 9 o 10, aquests valors no són vàlids com a números de carta i s’han de transformar de la manera següent:
    •	8 ? 10
    •	9 ? 11
    •	10 ? 12
    Finalment, la funció ha de retornar el valor obtingut tenint en compte que potser en algun cas el numero l’has d’haver convertit,

    */
    public static int numeroCartaAleatori()
    {
        Random rd = new Random();
        int carta = rd.nextInt(1, 11);
        int valor=0;
        if (carta <= 7)
            valor = carta;
        else //if (carta>7)
        {
            valor = carta+2;
        }
//        else if (valor==9)
//        {
//            valor = 11;
//        }
//        else if (valor==10)
//        {
//            valor = 12;
//        }
        return valor;
    }
            
    public static int palCartaAleatori()
    {
        int pal =0;
        Random rd = new Random();
        pal = rd.nextInt(1, 5);
        return pal;
     
    }
    
    public static void imprimirCarta(int num_carta, int pal_carta)
    {
        String palo="";
        
        /*
        
        switch(pal_carta)
        {
            case 1:
                palo = "Oros";
                System.out.println("Carta "+ num_carta + " de Oros");
                break;
            case 2:
                palo = "Bastos";
                System.out.println("Carta "+ num_carta + " de Bastos");
                break;
            case 3:
                palo = "Espadas";
                System.out.println("Carta "+ num_carta + " de Espadas");
                break;
            case 4:
                palo = "Copas";
                System.out.println("Carta "+ num_carta + " de Copas");
                break;
        }*/
        
        switch(num_carta)
        {
            case 10:
                System.out.println("Sota de " + palo);
                break;
            case 11:
                System.out.println("Caballo de " + palo);
                break;
            case 12:
                System.out.println("Rey de " + palo);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println( num_carta + " de " + palo);
                break;
        }
        
        
    }
    
    public static double  puntsCarta(int num_carta)
    {
        double valor_carta;
        if (num_carta>0 && num_carta <8)
        {
            valor_carta = num_carta;
        }
        else
        {
            valor_carta = 0.5;
        }
        return valor_carta;
    }
    
    public static boolean bancaDemanaCarta(double punts_jug, double punts_banca)
    {
        if ((punts_jug<=7.5) && (punts_banca<punts_jug))
        {
            return true;
        }
        else if (punts_banca<5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean guanyaJugador(double punts_jug, double punts_banca)
    {
        if ((punts_jug<=7.5 && punts_jug>punts_banca)
            || (punts_banca>7.5))
        {
            return true;
        }
        else
        {
            return false;
        }
                    
    }
    
    public static char plantarse()
    {
        Scanner sc = new Scanner(System.in);
        char seguir;
        do
        {
        System.out.println("Quieres mas cartas(s/n)");
        seguir = sc.next().charAt(0);
        }while(seguir!='s' && seguir != 'n');
        return seguir;
    }
    
}
