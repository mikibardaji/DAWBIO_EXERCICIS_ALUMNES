/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author xabiel
 */
public class Rectangulo {
 
    private int x;
    private int y;
    private int ancho;
    private int alto;

    public static final int min = 0;
    public static final int max = 100;

    public Rectangulo(int x, int y, int ancho, int alto) {

        if (!validarPosicion(x, y, ancho, alto)) {
            System.out.println("ERROR: Las coordenadas o las dimensiones están fuera del rango permitido.");
            return;
        }

        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    // -------------------------
    // VALIDACIÓN DE RECTÁNGULO
    // -------------------------

    private static boolean validarPosicion(int x, int y, int ancho, int alto) {

        if (x < min || y < min) return false;
        if (ancho <= 0 || alto <= 0) return false;

        // Que el rectángulo siga dentro de (0,0) → (100,100)
        if (x + ancho > max) return false;
        if (y + alto > max) return false;

        return true;
    }

    // -------------------------
    // SETTERS CON VALIDACIÓN
    // -------------------------

    public void setX(int x) {
        if (validarPosicion(x, this.y, this.ancho, this.alto)) {
            this.x = x;
        } else {
            System.out.println("ERROR: Nueva X inválida.");
        }
    }

    public void setY(int y) {
        if (validarPosicion(this.x, y, this.ancho, this.alto)) {
            this.y = y;
        } else {
            System.out.println("ERROR: Nueva Y inválida.");
        }
    }

    public void setAncho(int ancho) {
        if (validarPosicion(this.x, this.y, ancho, this.alto)) {
            this.ancho = ancho;
        } else {
            System.out.println("ERROR: Nuevo ancho inválido.");
        }
    }

    public void setAlto(int alto) {
        if (validarPosicion(this.x, this.y, this.ancho, alto)) {
            this.alto = alto;
        } else {
            System.out.println("ERROR: Nuevo alto inválido.");
        }
    }

    // -------------------------
    // RECTÁNGULO ALEATORIO
    // -------------------------

    public static Rectangulo crearAleatorio() {
        java.util.Random rnd = new java.util.Random();

        int x = rnd.nextInt(max + 1);
        int y = rnd.nextInt(max + 1);

        // Para que siempre quepa dentro, anchura máxima = max - x
        int ancho = rnd.nextInt(max - x + 1);
        int alto = rnd.nextInt(max - y + 1);

        return new Rectangulo(x, y, ancho, alto);
    }

    public void mostrar() {
        System.out.println("Rectángulo -> x: " + x + ", y: " + y +
                           ", ancho: " + ancho + ", alto: " + alto);
    }
}
