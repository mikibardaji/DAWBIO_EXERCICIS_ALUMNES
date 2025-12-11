package objetos;

public class Main {
    public static void main(String[] args) {

        subway jugador1 = new subway("Carlos", 0, 0, 50, false);

        System.out.println("\n--- Datos Iniciales ---");
        System.out.println("Nombre: " + jugador1.getname());
        System.out.println("Score: " + jugador1.getscore());
        System.out.println("Distancia: " + jugador1.getdistance());
        System.out.println("Energía: " + jugador1.getenergy());
        System.out.println("Power-Up: " + jugador1.getpower());

        System.out.println("\n--- El jugador empieza a correr ---");
        jugador1.run();
        jugador1.run();

        System.out.println("\nPower-Up activado!");
        jugador1.setpower(true);
        jugador1.run();

        System.out.println("\n--- Datos Finales ---");
        System.out.println("Distancia total recorrida: " + jugador1.getdistance());
    }
}
