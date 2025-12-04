package Objectes;

import java.util.Random;

public class Rectangle {

    // Límites comunes a todos los rectángulos
    public static final int MIN = 0;
    public static final int MAX = 100;

    // -------------------------
    // Atributos privados
    // -------------------------
    private int x1, y1, x2, y2;

    // -------------------------
    // Constructor con validaciones
    // -------------------------
    public Rectangle(int x1, int y1, int x2, int y2) {

        if (validarCoordenades(x1, y1, x2, y2)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("Coordenadas no válidas.");
        }
    }

    private boolean validarCoordenades(int a1, int b1, int a2, int b2) {
        if( a1 >= MIN && b1 >= MIN && a2 <= MAX && b2 <= MAX && a1 < a2 && b1 < b2)
                {return true;}
        else {return false;}
    }

    public int getX1() { return x1; }
    public int getY1() { return y1; }
    public int getX2() { return x2; }
    public int getY2() { return y2; }

    
    public void setX1(int x1) {
        if (validarCoordenades(x1, this.y1, this.x2, this.y2)) {
            this.x1 = x1;
        } else {
            System.err.println("valor no vàlid.");
        }
    }

    public void setY1(int y1) {
        if (validarCoordenades(this.x1, y1, this.x2, this.y2)) {
            this.y1 = y1;
        } else {
            System.err.println("valor no vàlid.");
        }
    }

    public void setX2(int x2) {
        if (validarCoordenades(this.x1, this.y1, x2, this.y2)) {
            this.x2 = x2;
        } else {
            System.err.println("valor no vàlid.");
        }
    }

    public void setY2(int y2) {
        if (validarCoordenades(this.x1, this.y1, this.x2, y2)) {
            this.y2 = y2;
        } else {
            System.err.println("valor no vàlid.");
        }
    }

    public void setX1Y1(int x1, int y1) {
        if (validarCoordenades(x1, y1, this.x2, this.y2)) {
            this.x1 = x1;
            this.y1 = y1;
        } else {
            System.err.println("coordenades X no vàlides.");
        }
    }

    public void setX2Y2(int x2, int y2) {
        if (validarCoordenades(this.x1, this.y1, x2, y2)) {
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("coordenades Y no vàlides.");
        }
    }

    public void setAll(int x1, int y1, int x2, int y2) {
        if (validarCoordenades(x1, y1, x2, y2)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("les coordenades no són vàlides.");
        }
    }


    public int getAmplada() {
        return x2 - x1;
    }

    public int getAlt() {
        return y2 - y1;
    }

    public int getPerimetre() {
        return 2 * (getAmplada() + getAlt());
    }

    public int getArea() {
        return getAmplada() * getAlt();
    }

    
    public void imprimir() {
        System.out.println("Rectangle:");
        System.out.println("  Coordenades: (" + x1 + "," + y1 + ")  (" + x2 + "," + y2 + ")");
        System.out.println("  Ample: " + getAmplada() + " - Alt: " + getAlt());
        System.out.println("  Perímetre: " + getPerimetre());
        System.out.println("  Àrea: " + getArea());
        System.out.println("-----------------------------------");
    }

    
    public static Rectangle crearAleatori() {
        Random rd = new Random();
        int x1 = rd.nextInt(MIN,MAX);
        int y1 = rd.nextInt(MIN,MAX);
        int x2 = rd.nextInt(x1,MAX);
        int y2 = rd.nextInt(y1,MAX);
        Rectangle r =new Rectangle(x1, y1, x2, y2);
        return r;
    }
}
