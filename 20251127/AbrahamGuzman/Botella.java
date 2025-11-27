/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioobjetos;

/**
 *
 * @author xabiel
 */
public class Botella {
     public int capacitat; // cambiado a public para el main
    private int diametro;
    private boolean tapon;
    private int liquido;
    private String material;

    // Constructor vacío
    public Botella() {
        capacitat = 25;
        diametro = 3;
        tapon = true;
        material = "Plastic";
        liquido = 0;
    }

    // Constructor con parámetros
    public Botella(int n_capacitat, int diametro) {
        capacitat = n_capacitat;
        this.diametro = diametro;
        tapon = true;
        material = "Vidre";
        liquido = 0;
    }

    public void obrir() {
        tapon = false;
    }

    public void tancar() {
        tapon = true;
    }

    public void plenar() {
        liquido = capacitat;
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

    public int getCapacitat() {
        return capacitat;
    }

    public int getdiametro() {
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

    public void setCapacitat(int nova_capacitat) {
        if (nova_capacitat > 0) {
            capacitat = nova_capacitat;
        } else {
            System.out.println("Capacitat ha de ser positiva: " + nova_capacitat);
        }
    }

    public void setLiquido(int nuevo_liquido) {
        if (nuevo_liquido >= 0 && nuevo_liquido <= capacitat) {
            liquido = nuevo_liquido;
        } else {
            System.out.println("No puc posar aquesta quantitat de líquid: " + nuevo_liquido);
        }
    }
}


