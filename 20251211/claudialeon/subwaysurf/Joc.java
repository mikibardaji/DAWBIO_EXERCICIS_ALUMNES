/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subwaysurf;

/**
 *
 * @author claud
 */
public class Joc {
    private Jugador jugador;
    private String nivell;

    public Joc(String nom, String nivell) {
        jugador = new Jugador(nom);

        switch (nivell.toLowerCase()) {
            case "facil":
                this.nivell = "facil";
                break;
            case "dificil":
                this.nivell = "dificil";
                break;
            default:
                this.nivell = "facil";
        }
    }

    public Jugador getJugador() {
        return jugador;
    }

    public String getNivell() {
        return nivell;
    }

    public void setNivell(String nivell) {
        switch (nivell.toLowerCase()) {
            case "facil":
                this.nivell = "facil";
                break;
            case "dificil":
                this.nivell = "dificil";
                break;
        }
    }

    public void jugar() {
        while (jugador.getEnergia() > 0) {
            jugador.correr();

            if (nivell == "facil") {
                int rd = (int)(Math.random() * 2) + 1;

                if (rd == 1) {
                    Obstacle o = new Obstacle("Barrera");
                    jugador.xocar(o);
                } else {
                    Obstacle o = new Obstacle("Tren");
                    jugador.xocar(o);
                }

                Moneda m = new Moneda();
                jugador.recollirMoneda(m);

            } else {
                int rd = (int)(Math.random() * 100) + 1;

                if (rd <= 30) {
                    Moneda m = new Moneda();
                    jugador.recollirMoneda(m);
                } else {
                    Obstacle o;
                    if ((int)(Math.random() * 2) == 0) {
                        o = new Obstacle("Barrera");
                    } else {
                        o = new Obstacle("Tren");
                    }
                    jugador.xocar(o);
                }
            }
        }
        System.out.println("Metres recorreguts: " + jugador.getDistancia_acumulada());
        System.out.println("Puntuacio final: " + jugador.getPuntuacio());
    }
}
