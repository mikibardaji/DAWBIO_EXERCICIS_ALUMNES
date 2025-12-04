package Objectes;

import java.util.Random;

public class Rectangle {

    public static final int MIN = 0;
    public static final int MAX = 100;

    private int x1, y1, x2, y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        if (!coordenadesCorrectes(x1, y1, x2, y2)) {
            System.err.println("Coordenades no vàlides. No s'ha pogut crear el rectangle.");
            return;
        }
        assignar(x1, y1, x2, y2);
    }

    private boolean coordenadesCorrectes(int a1, int b1, int a2, int b2) {
        return a1 >= MIN && b1 >= MIN &&
               a2 <= MAX && b2 <= MAX &&
               a1 < a2 && b1 < b2;
    }

    private void assignar(int a1, int b1, int a2, int b2) {
        this.x1 = a1;
        this.y1 = b1;
        this.x2 = a2;
        this.y2 = b2;
    }

    public int getX1() { return x1; }
    public int getY1() { return y1; }
    public int getX2() { return x2; }
    public int getY2() { return y2; }


    private void modificar(int a1, int b1, int a2, int b2) {
        if (coordenadesCorrectes(a1, b1, a2, b2)) {
            assignar(a1, b1, a2, b2);
        } else {
            System.err.println("No es poden aplicar les noves coordenades.");
        }
    }

    public void setX1(int nou) { modificar(nou, y1, x2, y2); }
    public void setY1(int nou) { modificar(x1, nou, x2, y2); }
    public void setX2(int nou) { modificar(x1, y1, nou, y2); }
    public void setY2(int nou) { modificar(x1, y1, x2, nou); }

    public void setX1Y1(int nouX1, int nouY1) {
        modificar(nouX1, nouY1, x2, y2);
    }

    public void setX2Y2(int nouX2, int nouY2) {
        modificar(x1, y1, nouX2, nouY2);
    }

    public void setAll(int a1, int b1, int a2, int b2) {
        modificar(a1, b1, a2, b2);
    }

    public int getAmplada() { return x2 - x1; }
    public int getAlt() { return y2 - y1; }
    public int getPerimetre() { return 2 * (getAmplada() + getAlt()); }
    public int getArea() { return getAmplada() * getAlt(); }

    public void imprimir() {
        System.out.println("Rectangle:");
        System.out.println("  (" + x1 + "," + y1 + ") fins a (" + x2 + "," + y2 + ")");
        System.out.println("  Amplada: " + getAmplada() + "  Altura: " + getAlt());
        System.out.println("  Perímetre: " + getPerimetre());
        System.out.println("  Àrea: " + getArea());
        System.out.println("---------------------------------------");
    }

    public static Rectangle crearAleatori() {
        Random r = new Random();
        int x1 = r.nextInt(MAX - MIN) + MIN;
        int y1 = r.nextInt(MAX - MIN) + MIN;

        int x2 = x1 + r.nextInt(MAX - x1) + 1;
        int y2 = y1 + r.nextInt(MAX - y1) + 1;

        return new Rectangle(x1, y1, x2, y2);
    }
}
