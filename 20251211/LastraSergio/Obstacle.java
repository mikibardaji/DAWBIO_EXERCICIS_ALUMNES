package Classes_principals;

import java.util.Random;

public class Obstacle {

    // Atributs statics/invariables (Finals)
    private static final int BARRERA_MIN = 1;
    private static final int BARRERA_MAX = 5;
    private static final int TREN_MIN = 5;
    private static final int TREN_MAX = 10;

    // Atributs variables
    private String tipus;
    private int dificultat;

    //constructor variable
    public Obstacle() {
        Random rnd = new Random();
        if (rnd.nextBoolean()) {
            tipus = "barrera";
            dificultat = BARRERA_MIN + rnd.nextInt(BARRERA_MAX - BARRERA_MIN + 1);
        } else {
            tipus = "tren";
            dificultat = TREN_MIN + rnd.nextInt(TREN_MAX - TREN_MIN + 1); 
        }
    }

    // Constructor
    public Obstacle(String tipus, int dificultat) {
        this.tipus = tipus;
        this.dificultat = 0;
    }

    //Setter i Getters
    public void setTipus(String tipus){
        this.tipus = tipus;
    }

    public String getTipus(){
        return tipus;
    }

    public void setDificultat(int dificultat){
        this.dificultat = dificultat;
    }

    public int getdificultat(){
        return dificultat;
    }
}
