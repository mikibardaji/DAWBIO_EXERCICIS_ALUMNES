/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicis;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    private static int AfegirPunts(int saldo){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quants punts vols afegir al saldo?: ");
        int punts = sc.nextInt();
        
        int puntsTotal = punts + saldo;
        
        return puntsTotal;
        
    }
    
    private static int apostaPunts(int puntsTotal, int puntsAposta){
        
        if(puntsTotal >= puntsAposta){
            return puntsAposta;
        }
        else{
            return -1;
        }
        
    }
    
    private static int bola(){
        
        Random rd = new Random();
        
        int bola = rd.nextInt(0, 37);
        
        return bola;
        
    }
    
    private static void pintaAsterisc(int numero){
        int vegades = 0;
        for(numero = numero ; numero > 0; numero -= 1){
            System.out.print('*');
            vegades += 1;
        }
        System.out.println(" " + vegades);
    }
    
    private static int QuantitatAposta(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quants vols apostar?: ");
        
        int puntsAposta = sc.nextInt();
        
        while(puntsAposta < 0){
            System.out.print("No pots apostar negatiu, torna a posar una aposta: ");
            puntsAposta = sc.nextInt();
        }
        
        return puntsAposta;
        
    }
    
    private static int resultatJugada(int tipusAposta, int saldo, int puntsAposta, int bola){
        switch(tipusAposta){
            case -2:
                if(bola % 2 == 0){
                    saldo += puntsAposta * 2;
                }
                else{
                    saldo -= puntsAposta;
                }
                break;
                
            case -1:
                if(bola % 2 != 0){
                    saldo += puntsAposta * 2;
                }
                else{
                    saldo -= puntsAposta;
                }
                break;
            
            case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36:   
                if(bola == tipusAposta){
                    saldo += puntsAposta * 36;
                }
                else{
                    saldo -= puntsAposta;
                }
                break;
                
            default:
                System.out.println("ERROR!");
                break;      
        }
        return saldo;
        
    }
    
    private static int tipusAposta(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quin tipus d'aposta vols fer? (-2 Parell; -1 Senar; 1-36 Numero): ");
        int tipusAposta = sc.nextInt();
        
        while(tipusAposta < -2 || tipusAposta > 36){
            System.out.print("Tipus d'aposta incorrecte, torna a posar un numero? (-2 Parell; -1 Senar; 0-36 Numero): ");
            tipusAposta = sc.nextInt();
        }
        
        return tipusAposta;
    }
}
