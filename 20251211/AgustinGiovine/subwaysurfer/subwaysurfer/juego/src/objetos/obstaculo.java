package objetos;
import java.util.Random;

public class obstaculo {
    private static final int MIN_BARRERA = 1;
    private static final int MAX_BARRERA = 5;
    private static final int MIN_TREN = 5;
    private static final int MAX_TREN = 10;

    private String tipo;
    private int dificultad;



    //constructor
public obstaculo(){
    Random rd = new Random();

    this.dificultad = rd.nextInt(MIN_BARRERA, (MAX_BARRERA + 1));

}

  //getters y setters
public String getTipo(){
    return tipo;
}
public int getDificultad(){
    return dificultad;
}

public void setTipo(String tipo){
    this.tipo = tipo;
}
public void setDificultad(int dificultad){
    this.dificultad = dificultad;
}

public int obstaculoMaximo(String tipo){
    int energiaRestada = 0;
    if (tipo == "barrera") {
        energiaRestada = energiaRestada + this.dificultad;
    } else if (tipo == "tren"){
        energiaRestada = energiaRestada + (this.dificultad + 5);
    }
    return -energiaRestada;
}


}


