package objetos;

public class Juego {
    private jugador jugador;
    private String nivell;

    public Juego(String nom, String nivell) {
        jugador = new jugador(nom);

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

    public jugador getJugador() {
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
            switch (nivell) {
                case "facil":
                    int rd = (int)(Math.random() * 2) + 1;

                    Obstaculos o1 = (rd == 1)
                            ? new Obstaculos("barrera")
                            : new Obstaculos("tren");

                    jugador.xocar(o1);

                    Moneda m1 = new Moneda();
                    jugador.recollirMoneda(m1);
                    break;

                default:
                    int r2 = (int)(Math.random() * 100) + 1;

                    if (r2 <= 30) {
                        Moneda m2 = new Moneda();
                        jugador.recollirMoneda(m2);
                    } else {
                        Obstaculos o2 = (Math.random() < 0.5)
                                ? new Obstaculos("barrera")
                                : new Obstaculos("tren");

                        jugador.xocar(o2);
                    }
            }
        }

        System.out.println("Metres recorreguts: " + jugador.getDistancia_acumulada());
        System.out.println("Puntuació final: " + jugador.getPuntuacio());
    }
}
