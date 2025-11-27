package Objetos;

public class Ampolla {
    private int capacidad, liquido, verter, diametro;
    private double longitud;
    private boolean tapon;
    private String material;


    public Ampolla() {
        capacidad = 25;
        diametro = 3;
        tapon = true;
        material = "Plastico";
        liquido = 0;
    }
    public Ampolla(int n_capacidad, int n_diametro) {
        capacidad = n_capacidad;
        diametro;

    }

    // Quitar el tapon de la botella
    public void abrirse() {
        tapon = false;
    }
    //
    public void tancar() {
        tapon = false;
    }

    public void plenar() {
        liquido = capacidad;
    }

    public int verter() {
        int vertidor=0;
        if (liquido<=0) {
            vertidor = 0;
        }
        else if (tapon==true) {
            vertidor = 0;
        }
        else if (liquido<diametro) {
            vertidor = liquido;
            liquido = 0;
        }
        else {
            liquido -= diametro;
            vertidor = diametro;
        }
        return vertidor;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getDiametro() {
        return diametro;
    }

    public boolean getTapon() {
        return tapon;
    }

    public int getLiquido() {
        return liquido;
    }

    public String getMaterial() {
        return material;
    }

    public void setCapacidad(int nova_capacidad) {
        if (nova_capacidad>0) {
            capacidad = nova_capacidad;
        }
        else {
            System.out.println("La capacidad debe ser mayor que 0");
        }
    }

    public void setLiquido (int nou_liquido){
        if(nou_liquido>=0 && liquido<= capacidad){
            liquido = nou_liquido;
        }
        else{
            System.out.println("No puedo poner esta cantidad de liquido");
        }
    }
}
