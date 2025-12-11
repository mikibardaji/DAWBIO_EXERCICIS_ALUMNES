package Objetos;

public class Jugador {
    private String nom;
    private int puntuacio;
    private int distanciaAcumulada;
    private int energia;
    private boolean powerUp;

    public Jugador(String nom) {
        this.nom = nom;
        puntuacio = 0;
        distanciaAcumulada = 0;
        energia = 50;
        powerUp = false;
    }

    public String getNom() { return nom; }
    public int getPuntuacio() { return puntuacio; }
    public int getDistanciaAcumulada() { return distanciaAcumulada; }
    public int getEnergia() { return energia; }
    public boolean isPowerUp() { return powerUp; }

    public void correr() {
        int metros;
        if (powerUp) {
            metros = 6;
        } else {
            metros = 2;
        }
        distanciaAcumulada += metros;

        String linea = "";
        for (int i = 0; i < metros; i++) {
            linea += "- ";
        }
        linea += distanciaAcumulada + " metres";
        System.out.println(linea);
    }

    public void recollirMoneda(Moneda m) {
        puntuacio += m.getValor();

        if (m.hasPowerUp()) {
            powerUp = true;
        } else {
            powerUp = false;
        }

        System.out.println("Moneda recogida: " + m.getValor());
    }

    public void xocar(Obstacle o) {
        energia -= o.getDificultat();
        if (energia < 0) energia = 0;
        powerUp = false;
        System.out.println("Choca con " + o.getTipus() + ". Energia actual: " + energia);
    }
}