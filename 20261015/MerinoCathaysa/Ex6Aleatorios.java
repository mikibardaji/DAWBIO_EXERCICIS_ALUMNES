/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeroaleatorio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cathy
 */
public class Ex6Aleatorios {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        
        System.out.println("Elige: (0) Piedra, (1) Papel o (2) Tijeras:");
        int eleccionUsuario = sc.nextInt();

        int eleccioAleatoriaPC = rd.nextInt(0, 3);
        
        String manoUsuario = "";
        String manoPC;
        
        if (eleccionUsuario == 0) {
            manoUsuario = "Piedra";
        } else if (eleccionUsuario == 1) {
            manoUsuario = "Papel";
        } else if (eleccionUsuario == 2) {
            manoUsuario = "Tijeras";
        } 
        
        if (eleccioAleatoriaPC == 0) {
            manoPC = "Piedra";
        } else if (eleccioAleatoriaPC == 1) {
            manoPC = "Papel";
        } else {
            manoPC = "Tijeras";
        }
        
        System.out.println("El usuario ha elegido: " + manoUsuario);
        System.out.println("El ordenador ha sacado: " + manoPC);
        
        if (eleccionUsuario > 2 || eleccionUsuario < 0) {
            System.out.println("Opción no válida");
        } else if (eleccionUsuario == 0 && eleccioAleatoriaPC == 2 
                || eleccionUsuario == 1 && eleccioAleatoriaPC == 0
                || eleccionUsuario == 2 && eleccioAleatoriaPC == 1) {
            System.out.println("Gana el usuario."); 
        } else if (eleccionUsuario == eleccioAleatoriaPC) {
            System.out.println("Empate");
        } else {
            System.out.println("Gana el ordenador.");
        }
    }
}
