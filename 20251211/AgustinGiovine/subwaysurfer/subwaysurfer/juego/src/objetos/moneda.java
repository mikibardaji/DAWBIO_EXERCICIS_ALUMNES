package objetos;
import java.util.Random;

public class moneda {
    private static final int VALOR_MIN = 1;
    private static final int VALOR_MAX = 100;

    private int valor;
    private Random rd = new Random();
    
    
    //constructor
    public moneda(){
        
        this.valor = rd.nextInt(VALOR_MIN, (VALOR_MAX + 1));
    }
    //getter setters
    public int getValor(){ 

        return this.valor = rd.nextInt(VALOR_MIN, (VALOR_MAX + 1));
    }

    public boolean hasPowerUp(){
                System.out.println("el valor de la moneda agarrada " + this.valor);
        if (this.valor%3 == 0) {
            return true ;
        } else {
            return false;
        }
    }
    
}
