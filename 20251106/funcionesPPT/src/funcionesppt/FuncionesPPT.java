/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesppt;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jde7989
 */
public class FuncionesPPT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        
        int saco=jugada();
         jugada_ordenador();
         imp_jugada("Has sacado", saco);
         
    }

    private static int jugada() {
        Scanner sc = new Scanner(System.in);
        int entero;
        do{
        System.out.println("que sacas? (0 piedra, 1 papel, 2 tijera)");
        entero=sc.nextInt();
        }while(entero<0 || entero>3);
        return entero;
    }

    private static int jugada_ordenador() {
        Random rd = new Random();
        
        int valor=rd.nextInt(0,3);
        
        return valor;
    }
    
    private static void imp_jugada(String quien_juega, int choose){
        String jugada = null;
        switch (choose) {
            case 0:
                jugada = "Piedra";
                break;
            case 1:
                jugada ="Papel";
                break;
            case 2:
                jugada ="Tijera";
                break;
            default:
                jugada ="Que sacas";
        }
        
        System.out.println(quien_juega+" "+jugada);
        
    }
    
    
    
}
