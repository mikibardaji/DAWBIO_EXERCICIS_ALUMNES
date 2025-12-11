package objectes;

import java.util.Random;   

public class obstacle {

    private static final int MIN_BARRERA = 1;
    private static final int MAX_BARRERA = 5;
    private static final int MIN_TREN = 5;
    private static final int MAX_TREN = 10;


    private String tipus;
    private int dificultat;

    public obstacle (){
    Random rd= new Random();
    //tenim dos opcions d'obstacles treiem un aleatoriament
    int opcio =rd.nextInt(0,2);

        if (opcio==1){
            tipus="tren";
            dificultat=rd.nextInt(MIN_TREN,MAX_TREN+1);
        }
        else {
            tipus="barrera";
            dificultat=rd.nextInt(MIN_BARRERA,MAX_BARRERA+1);
        }
    }

    public String getTipus() {return tipus;}

    public int getDificultat() {return dificultat;}

//no fa falta setter degut a que quan es genera l'obstacle es crea amb unes característiques no modificable

public static obstacle obstacleMaxim() {//crearem un obstacle amb la seva dificultat màxima segons surti tren o barrera
    obstacle max = new obstacle();
    if(max.getTipus()=="tren"){
        max.dificultat=10;
    }
    else {max.dificultat=5;}
    return max;
}
}
