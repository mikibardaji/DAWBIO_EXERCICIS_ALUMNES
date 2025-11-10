public class App {
    public static void main(String[] args)  {
        imp_ganador(0);
        imp_ganador(1);
        imp_ganador(2);
        imp_ganador(99);

        marcador(3, 5);
    }

    public static void imp_ganador(int ganador) {
        switch (ganador) {
            case 0:
                System.out.println("hay empate");
                break;
            case 1:
                System.out.println("has ganado");
                break;
            case 2:
                System.out.println("ha ganado el ordenador");
                break;
            default:
                System.out.println("valor inválido: " + ganador);
        }
    }

    public static void marcador(int point_player1, int point_player2) {
        System.out.println("Puntuación jugador 1: " + point_player1);
        System.out.println("Puntuación jugador 2: " + point_player2);
    }

}
