/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

import objetos.Articulo;

/**
 *
 * @author xabiel
 */
public class ArticuloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Articulo a1 = new Articulo("Libro", 20, Articulo.IVA_SUPER_REDUCIDO);
        a1.mostrarArticulo();

        Articulo a2 = new Articulo("Hamburguesa", 8.50, Articulo.IVA_REDUCIDO);
        a2.mostrarArticulo();

        System.out.println("\nIntento de IVA incorrecto:");
        Articulo a3 = new Articulo("Móvil", 300, 0.50); // ERROR
    }
}
   
