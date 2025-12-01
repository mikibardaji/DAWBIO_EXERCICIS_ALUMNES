package objetos;
public class PuntoMain {
    public static void main(String[] args) {
        Punto p1 = new Punto (5,0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);
        System.out.println("Coordenadas:");
        p1.mostrarPunto();
        p2.mostrarPunto();
        p3.mostrarPunto();

        p1.desplazar(3, -2);
        System.out.println("P1 desplaçat:");
        p1.mostrarPunto();

        int dist = p1.distancia(p2);
        System.out.println("Distància (p1 - p2): " + dist);

    }
}
