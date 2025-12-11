package objetos;

public class Moneda {
    private int valor;

    public Moneda() {
        valor = (int)(Math.random() * 100) + 1;
    }

    public int getValor() {
        return valor;
    }

    public boolean PowerUp() {
        return valor % 3 == 0;
    }
}
