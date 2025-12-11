public class Game {
    private Player jugador;

    public Game(Player jugador) {
        this.jugador = jugador;
    }

    public void jugarRonda() {
        Token token = new Token();
        jugador.sumarPuntos(token.getValor());
        jugador.gastarEnergia(10);
    }

    public void mostrarEstado() {
        System.out.println("Jugador: " + jugador.getNombre());
        System.out.println("Puntos: " + jugador.getPuntos());
        System.out.println("Energía: " + jugador.getEnergia());
    }
}
