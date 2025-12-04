/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Random;

/**
 *
 * @author xabiel
 */
public class Punt {
        private int x; 
    private int y; 

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void mostrar(){
        System.out.println("Esta es x " + x);
        System.out.println("Esta es y " + y);
    }
    public void desplaza(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    public double distancia(Punt p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
     /*
    
    Cre un objeto con sus coordenadas x y y de manera aleatoria
    */
    
    public static Punt crearPuntoAleatorio(){
      //static es un metodo que se puede crear solo sin variable aasociada 
        Random rd = new Random();
        int x = rd.nextInt(-100, 101);
        int y = rd.nextInt(-100, 101);
        Punt p = new Punt(x, y);
        return p;
    
    }
}
