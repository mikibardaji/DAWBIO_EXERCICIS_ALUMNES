package objetos;

public class Noms {

    private String valor;

    public Noms() {
        this.valor = null;
    }

    public Noms(String valor) {
        this.valor = valor;
    }

    public boolean estaBuit() {
        return valor == null || valor.isEmpty();
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void esborrar() {
        this.valor = null;
    }

    public int getNumLletres() {
        if (estaBuit()) {
            return 0;
        }
        return valor.length();
    }

    @Override
    public String toString() {
        if (estaBuit()) {
            return "";
        }
        return valor.toUpperCase() + " (" + getNumLletres() + " lletres)";
    }
}
