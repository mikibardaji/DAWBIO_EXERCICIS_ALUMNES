package objetos;

public class Punto {
    private int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public void mostrarPunto() {
        System.out.println("x: " + x + "  | y: " + y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int yyy) {
        this.y = yyy;
    }

    public void setXY(int xx, int yy) {
        x = xx;
        y = yy;
    }

    public void desplazar(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public int distancia(Punto p) {
        int dx = x - p.x;
        int dy = y - p.y;
        return dx * dx + dy * dy;
    }

}
