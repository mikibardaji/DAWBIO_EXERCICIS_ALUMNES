package Surfers;

public class Obstacle {
    private String tipus;
    private int dificultat;

    public Obstacle(String tipus) {
        this.tipus = tipus;
        if (tipus == "barrera") {
            this.dificultat = (int)(Math.random() * 5) + 1;
        } else {
            this.dificultat = (int)(Math.random() * 6) + 5;
        }
    }

    public String getTipus() {
        return tipus;
    }

    public int getDificultat() {
        return dificultat;
    }

    public static Obstacle obstacleMaxim() {
        Obstacle o = new Obstacle("tren");
        o.dificultat = 10;
        return o;
    }
}
