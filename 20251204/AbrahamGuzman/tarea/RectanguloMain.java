/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

import objetos.Rectangulo;

/**
 *
 * @author xabiel
 */
public class RectanguloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Rectángulo valido");
        Rectangulo r1 = new Rectangulo(10, 20, 30, 40);
        r1.mostrar();

        System.out.println("Rectangulo invalido");
        Rectangulo r2 = new Rectangulo(90, 90, 20, 20); 

        System.out.println("Rectangulo aleatorio");
        Rectangulo r3 = Rectangulo.crearAleatorio();
        r3.mostrar();

        System.out.println("Probando setters");
        r1.setX(95); 
        r1.setAncho(5); 
        r1.mostrar();
    }
    }
    

