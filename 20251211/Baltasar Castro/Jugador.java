public class Jugador {
    private String nombre;
    private int puntos;
    private int energia;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.energia = 100;
    }

    public void sumarPuntos(int cantidad) {
        puntos += cantidad;
    }

    public void gastarEnergia(int cantidad) {
        energia -= cantidad;
        if (energia < 0) energia = 0;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getEnergia() {
        return energia;
    }

    public String getNombre() {
        return nombre;
    }
}
