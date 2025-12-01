package Objetos;

public class Punto {

    private int x;
    private int y;

    public Punto(int xInicial, int yInicial) {
        this.x = xInicial;
        this.y = yInicial;
    }

    public void mostrarPunt() {
        System.out.println("Coordenada X = " + x + " | Coordenada Y = " + y);
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int novaX) { this.x = novaX; }
    public void setY(int novaY) { this.y = novaY; }

    public void setXY(int novaX, int novaY) {
        this.x = novaX;
        this.y = novaY;
    }

    public void desplaza(int incX, int incY) {
        x += incX;
        y += incY;
    }

    public double distancia(Punto altre) {
        int dx = x - altre.x;
        int dy = y - altre.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
