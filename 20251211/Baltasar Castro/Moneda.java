public class Moneda {
    private int valor;

    public Token() {
        this.valor = (int)(Math.random() * 10) + 1;
    }

    public int getValor() {
        return valor;
    }
}

