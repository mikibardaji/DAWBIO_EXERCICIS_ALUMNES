package objetos;

public class vaso {

     public int capacitat;
    private int diametro;
    private int liquido;
    private String material;

    public vaso() {
        capacitat = 10;
        diametro = 5;
        material = "Vidre";
        liquido = 0;
    }

    public vaso(int capacitat) {
        this.capacitat = capacitat;
        diametro = 5;
        material = "Plastic";
        liquido = 0;
    }

    public void plenar() {
        liquido = capacitat;
    }

    public int verter() {
        int vertido;
        if (liquido <= 0) {
            vertido = 0;
        } else if (liquido < diametro) {
            vertido = liquido;
            liquido = 0;
        } else {
            liquido -= diametro;
            vertido = diametro;
        }
        return vertido;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public int getdiametro() {
        return diametro;
    }

    public int getLiquido() {
        return liquido;
    }

    public String getMaterial() {
        return material;
    }

    public void setCapacitat(int capacitat) {
        if (capacitat > 0) {
            this.capacitat = capacitat;
        } else {
            System.out.println("Capacitat ha de ser positiva: " + capacitat);
        }
    }

    public void setLiquido(int liquido) {
        if (liquido >= 0 && liquido <= capacitat) {
            this.liquido = liquido;
        } else {
            System.out.println("No puc posar aquesta quantitat de líquid: " + liquido);
        }
    }
}

