/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

import objetos.Punt;

/**
 *
 * @author xabiel
 */
public class PuntMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punt C =  Punt.crearPuntoAleatorio();
        Punt B = Punt.crearPuntoAleatorio();
        Punt A = Punt.crearPuntoAleatorio();
        
        C.mostrar();
        B.mostrar();
        A.mostrar();
    }
    
}
