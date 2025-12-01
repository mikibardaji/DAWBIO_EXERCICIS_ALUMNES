package Objectes.Punt;

public class PuntMain {
    public static void main(String[] args) {

        Punt p1 = new Punt(5, 0);
        Punt p2 = new Punt(10, 10);

        System.out.println("--------");
        p1.mostrarPunt();
        p2.mostrarPunt();

        p1.desplaza(3, -2);
        System.out.println("p1:");
        p1.mostrarPunt();

        System.out.println("Distancia:");
        System.out.println(p1.distancia(p2));
    }
}