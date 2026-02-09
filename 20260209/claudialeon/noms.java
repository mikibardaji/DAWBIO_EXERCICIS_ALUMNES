/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author claud
 */
public class noms {

    private String valor;

    public noms() {
        this.valor = null;
    }

    public noms (String valor) {
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

    @Override
    public String toString() {
        return valor.toUpperCase() + " - " + valor.length() + " lletres";
    }
}

