/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subway;

import java.util.Random;

/**
 *
 * @author MattW
 */
public class Moneda {

    private static final int MIN_VALOR = 1;
    private static final int MAX_VALOR = 100;

    private int valor;

    public Moneda() {
        Random rd = new Random();
        valor = rd.nextInt(MIN_VALOR, MAX_VALOR + 1);
    }

    public int getValor() {
        return valor;
    }

    // Retorna true si el número de monedas es múltiple de 3
    public boolean hasPowerUp(int contadorMonedas) {
        return contadorMonedas % 3 == 0;
    }
}
