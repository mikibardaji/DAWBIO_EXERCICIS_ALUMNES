package objetos;

public class puntprincipal {
    public static void main(String[] args) {

        punt p1 = new punt(5, 0);
        punt p2 = new punt(10, 10);

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