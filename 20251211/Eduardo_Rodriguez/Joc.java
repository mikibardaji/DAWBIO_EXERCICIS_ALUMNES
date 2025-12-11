package Objetos;

public class Joc {
    private Jugador jugador;
    private String nivell;

    public Joc(String nom, String nivell) {
        jugador = new Jugador(nom);

        if (nivell == "dificil") {
            this.nivell = "dificil";
        } else {
            this.nivell = "facil";
        }
    }

    public void jugar() {
        while (jugador.getEnergia() > 0) {
            jugador.correr();

            if (nivell == "facil") {
                if (Math.random() < 0.5) {
                    jugador.xocar(new Obstacle("pared"));
                } else {
                    jugador.xocar(new Obstacle("tren"));
                }
                jugador.recollirMoneda(new Moneda());
            } else {
                if (Math.random() < 0.3) {
                    jugador.recollirMoneda(new Moneda());
                } else {
                    if (Math.random() < 0.5) {
                        jugador.xocar(new Obstacle("pared"));
                    } else {
                        jugador.xocar(new Obstacle("tren"));
                    }
                }
            }
        }

        System.out.println("Metres recorreguts: " + jugador.getDistanciaAcumulada());
        System.out.println("Puntuació final: " + jugador.getPuntuacio());
    }
}
