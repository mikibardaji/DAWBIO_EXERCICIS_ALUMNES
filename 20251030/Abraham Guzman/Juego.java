/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diseñomodular;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author agu3018
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int usuario = jugadaUsuario();
        int maquina = jugadaOrdenador();
        System.out.println(maquina);
        
    }
    public static int jugadaUsuario(){
        int usuario;
        Scanner sc = new Scanner(System.in);
        
        do{
        System.out.println("Ingrese un valor (0 piedra, 1 papel, 2 tijera)");
        usuario = sc.nextInt();
        if(usuario < 0 || usuario > 2){
            System.out.println("Numero invalida");
        }
        }while(usuario < 0 || usuario > 2);
        return usuario;
    }
    
    public static int jugadaOrdenador(){
    Random rd = new Random();
    return rd.nextInt(0, 3);
    }
    
    
}
