package objetos;

public class Obstaculos {
    private String tipus;
    private int dificultat;

    public Obstaculos(String tipus) {
        this.tipus = tipus;

        switch (tipus) {
            case "barrera":
                this.dificultat = (int)(Math.random() * 5) + 1;
                break;
            default:
                this.dificultat = (int)(Math.random() * 6) + 5;
        }
    }

    public String getTipus() {
        return tipus;
    }

    public int getDificultat() {
        return dificultat;
    }

    public static Obstaculos obstacleMaxim() {
        Obstaculos o = new Obstaculos("tren");
        o.dificultat = 10;
        return o;
    }
}
