package Classes_principals;

import java.util.Random;

public class Moneda {

    //Atributs
    private int valor;

    // Constructor
    public Moneda() {
        Random rnd = new Random();
        this.valor = rnd.nextInt(100) + 1;
    }

    //Setter i Getters
    public int getValor(){
        return valor;
    }

    // Retorna true si els milisegons actuals són múltiples de 3
    public boolean hasPowerUp() {
        long mls = System.currentTimeMillis();
        return (mls % 3 == 0);
    }

}
