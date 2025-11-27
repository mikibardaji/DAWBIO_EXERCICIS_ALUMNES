package Objectes;

public class Got_thiago {
    private int capacidad;
    private String material;
    private int diametro;
    private int liquido;

    public Got() {
        capacidad = 5;
        diametro = 10;
        material = "Vidrio";
        liquido = 0;
    }

    public Got(int capacidad) {
        this.capacidad = capacidad;
        diametro = 10;
        material = "Vidrio";
        liquido = 0;
    }

    public void plenar() {
        liquido = capacidad;
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

    public int getCapacidad() {
        return capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public int getDiametro() {
        return diametro;
    }

    public int getLiquido() {
        return liquido;
    }

    public void setCapacidad(int nova_capacidad) {
        if (nova_capacidad > 0) {
            capacidad = nova_capacidad;
        } else {
            System.out.println("No puedo poner esta cantidad de capacidad: " + nova_capacidad);
        }
    }

    public void setLiquido(int liquido) {
        if (liquido >= 0 && liquido <= capacidad) {
            this.liquido = liquido;
        } else {
            System.out.println("No puedo poner esta cantidad de liquido: " + liquido);
        }
    }
}
