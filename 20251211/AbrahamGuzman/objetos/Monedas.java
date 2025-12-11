/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author xabiel
 */
public class Monedas {
     
    private final int valor; 
    public static final int VALOR_MAX = 100;
    public static final int VALOR_MIN = 1;

    
    public Moneda() {
        Random rand = new Random();
       
        this.valor = rand.nextInt(VALOR_MAX - VALOR_MIN + 1) + VALOR_MIN; 
        System.out.println("-> Constructor Moneda: Creada moneda con valor " + this.valor);
    }

    
    public boolean hasPowerUp(int monedasRecogidas) {
        System.out.print("-> Método Moneda.hasPowerUp(): Monedas recogidas: " + monedasRecogidas);
        if (monedasRecogidas % 3 == 0) {
            System.out.println(". ¡Es múltiplo de 3!");
            return true;
        } else {
            System.out.println(". No es múltiplo de 3.");
            return false;
        }
    }

    
    public int getValor() {
        return valor; 
    }
}

