package objetos;

public class jugador {
    private String nom;
    private int puntuacio;
    private int distancia_acumulada;
    private int energia;
    private boolean power_up;

    public jugador(String nom) {
        this.nom = nom;
        this.puntuacio = 0;
        this.distancia_acumulada = 0;
        this.energia = 50;
        this.power_up = false;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public int getDistancia_acumulada() {
        return distancia_acumulada;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean isPower_up() {
        return power_up;
    }

    public void setPower_up(boolean power_up) {
        this.power_up = power_up;
    }

    public void correr() {
        if (power_up) {
            distancia_acumulada += 6;
            System.out.println("- - - - - - " + distancia_acumulada + " metres");
        } else {
            distancia_acumulada += 2;
            System.out.println("- - " + distancia_acumulada + " metres");
        }
    }

    public void recollirMoneda(Moneda m) {
        puntuacio += m.getValor();

        power_up = m.PowerUp();

        System.out.println("Moneda recogida: " + m.getValor());
    }

    public void xocar(Obstaculos o) {
        energia -= o.getDificultat();
        power_up = false;
        System.out.println("Choca con " + o.getTipus() + ". Energia actual: " + energia);
    }
}
