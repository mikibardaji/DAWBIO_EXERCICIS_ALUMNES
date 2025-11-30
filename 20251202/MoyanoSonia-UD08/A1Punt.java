import Objectes.Punt;

public class A1Punt {
    public static void main(String[] args) {
        Punt p1 = new Punt(5, 0);
        Punt p2 = new Punt(10, 10);
        Punt p3 = new Punt(-3, 7);

        // Mostrem coordenades inicials
        System.out.println("Coordenades inicials:");
        p1.mostrarPunt();
        p2.mostrarPunt();
        p3.mostrarPunt();

        // Modifiquem les coordenades usan distints operadors
        p1.desplaza(2,5);
        p2.desplaza(-3,1);
        p3.desplaza(1, 3);

        // Mostrem coordenades modificades
        System.out.println("\nCoordenadas modificades:");
        p1.mostrarPunt();
        p2.mostrarPunt();
        p3.mostrarPunt();

        //distancia
        System.out.println("\nDistància entre els punts:");
        System.out.println("Distancia p1 - p2: " + p1.distancia(p2));
        System.out.println("Distancia p2 - p3: " + p2.distancia(p3));
        System.out.println("Distancia p1 - p3: " + p1.distancia(p3));

    }
}
