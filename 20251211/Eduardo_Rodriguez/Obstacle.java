package Objetos;

public class Obstacle {
    private String tipus;
    private int dificultat;

    public Obstacle(String tipus) {
        this.tipus = tipus;
        if (tipus == "pared") {
            dificultat = (int)(Math.random() * 5) + 1;
        } else {
            dificultat = (int)(Math.random() * 6) + 5;
        }
    }

    public String getTipus() { return tipus; }
    public int getDificultat() { return dificultat; }
}
