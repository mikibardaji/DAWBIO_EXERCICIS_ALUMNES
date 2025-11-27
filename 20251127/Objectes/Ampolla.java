package Objectes;

public class Ampolla {
    //Definir atributos Botella
    private int capacidad;
    private String material;
    private int diametro;
    private int liquido;
    private boolean tapon;

    public Ampolla() {
        capacidad = 25;
        diametro = 3;
        tapon = true;
        material = "Plastico";
        liquido = 0;
    }

    public Ampolla(int nova_capacidad, int diametro) {
        capacidad = nova_capacidad;
        this.diametro = diametro;
        tapon = true;
        material = "Vidrio";
        liquido = 0;
    }

    
    public void obrir() {
        tapon = false;
    }

    
    public void tancar() {
        tapon = true;
    }

    
    public void plenar() {
        liquido = capacidad;
    }

    
    public int verter() {
        int vertido;

        if (liquido <= 0) {
            vertido = 0;

        } else if (tapon == true) {
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

    public int getDiametro() {
        return diametro;
    }

    public boolean isTapon() {
        return tapon;
    }

    public int getLiquido() {
        return liquido;
    }

    public String getMaterial() {
        return material;
    }

    public void setCapacidad(int nova_capacidad) {
        if (nova_capacidad > 0) {
            capacidad = nova_capacidad;
        } else {
            System.out.println("Error: La capacidad debe ser mayor que 0");
        }
    }

    public void setLiquido(int nou_liquido) {
        if (nou_liquido >= 0 && nou_liquido <= capacidad) {
            liquido = nou_liquido;
        } else {
            System.out.println("No puedo poner esta cantidad de liquido: " + nou_liquido);
        }
    }
}

