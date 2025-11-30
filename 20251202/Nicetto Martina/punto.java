package objectos;

public class punto {

    private int x;
    private int y;

    public Punto (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void resultado() {
        System.out.println("Las coordenadas son: (" + x + ", " + y + ")");
    }
}
