public class A1Punto {
    public static void main(String[] args) {
        Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);

        System.out.println("Coordenadas Iniciales:");
        p1.mostrarPunt();
        p2.mostrarPunt();
        p3.mostrarPunt();

        p1.desplaza(2,5);
        p2.desplaza(-3,1);
        p3.desplaza(1, 3);

        System.out.println("Cordenadas Modificadas");
        p1.mostrarPunt();
        p2.mostrarPunt();
        p3.mostrarPunt();

        System.out.println("Distncia entre puntos:");
        System.out.println("Distancia p1 - p2: " + p1.distancia(p2));
        System.out.println("Distancia p2 - p3: " + p2.distancia(p3));
        System.out.println("Distancia p1 - p3: " + p1.distancia(p3));
    }
}
