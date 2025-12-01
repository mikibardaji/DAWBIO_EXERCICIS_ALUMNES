/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;
import objetos.Punto;
/**
 *
 * @author agu3018
 */
public class PuntoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto pt = new Punto(5,0);
        
        pt.mostrar();
        
        pt.setX(10);
        pt.setY(8);
        
        pt.mostrar();
        // de esta manera se puede crear un punto aleatorio 
        Punto c = Punto.crearPuntoAleatorio();
        
        c.mostrar();
    }
    
}

