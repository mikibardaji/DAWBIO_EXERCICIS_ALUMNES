/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author agu3018
 */
public class Punto {
    private int x; 
    private int y; 

    public Punto(int x, int y) {
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
     /*
    
    Cre un objeto con sus coordenadas x y y de manera aleatoria
    */
    
    public static Punto crearPuntoAleatorio(){
      //static es un metodo que se puede crear solo sin variable aasociada 
        Random rd = new Random();
        int x = rd.nextInt(0, 101);
        int y = rd.nextInt(0, 101);
        Punto p = new Punto(x, y);
        return p;
    
    }
}

