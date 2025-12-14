/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subwaysurf;

/**
 *
 * @author claud
 */
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
