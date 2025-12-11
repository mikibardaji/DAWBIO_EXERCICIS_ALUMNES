package objectes;

import java.util.Random;

public class moneda {

private int valor;

public moneda (){
    Random rd =new Random();
    this.valor= rd.nextInt(1,101);
}

public int getValor(){ return valor;}

//no fa falta setter pel valor de la moneda degut a que quan es genera una moneda es crea amb un valor no modificable

public boolean hasPowerUp(){

    if (valor%3==0){
        return true;
    }
    else {return false;}
}

}
