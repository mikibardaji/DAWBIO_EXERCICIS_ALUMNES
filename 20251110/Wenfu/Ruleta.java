/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruleta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public static int QuantitatAposta()
    {
        Scanner sc = new Scanner(System.in);
        int apuesta;
        do {
            System.out.println("Introduce cuanto quieres apostar: ");
            apuesta = sc.nextInt();
        } while(apuesta < 0);
        return apuesta;
    }
    
    public static int AfegirPunts(int saldo)
    {
        Scanner sc = new Scanner(System.in);
        int puntos;
        do {
            System.out.println("Introduce cuanto puntos quieres añadir: ");
            puntos = sc.nextInt();
        } while(puntos < 0);
        return saldo + puntos;
    }
    
    public static void pintaAsterisc(int numero) 
    {
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
        System.out.println(numero);
    }
    
    public static int bola() 
    {
        Random rd = new Random();
        int numero_aleatorio;
        numero_aleatorio = rd.nextInt(0, 37);
        return  numero_aleatorio;
    }
    
    public static int tipusAposta() 
    {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        if (valor == -2) {
            valor = -2;
            return valor;
        } else if (valor == -1) {
            valor = -1;
            return valor;
        }
        else if (valor >= 1 && valor <= 36) {
            return valor;
        }
        else 
        {
            return valor;
        }
    }
    
    public static int apostaPunts(int puntsTotal,int puntsAposta)
    {
        if (puntsAposta > puntsTotal || puntsAposta < 0) {
            return -1;
        }
        else
        {
            return puntsAposta;
        }
    }
    
    public static int resultatJugada(int tipusAposta,int saldo,int puntsAposta,int bola)
    {
        int ganancia;
        if (tipusAposta == bola) {
            ganancia = 36 * puntsAposta;
            return ganancia + saldo;
        }
        else if (tipusAposta == -2) {
        if (bola % 2 == 0 && bola != 0) {
            ganancia = 2 * puntsAposta;
            return ganancia + saldo;
        }
        } 
        else if (tipusAposta == -1) {
        if (bola % 2 != 0) {
            ganancia = 2 * puntsAposta;
            return ganancia + saldo;
        }
        }
        else
        {
            return saldo;
        }
        return saldo;
    }
}
