package Objetos;

public class Moneda {
    private int valor;

    public Moneda() {
        valor = (int)(Math.random() * 100) + 1;
    }

    public int getValor() { return valor; }

    public boolean hasPowerUp() {
        if (valor % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}