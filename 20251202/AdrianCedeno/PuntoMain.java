

import Objetos.Punto;

public class PuntoMain {
    public static void main(String[] args) {

        Punto puntA = new Punto(5, 0);
        Punto puntB = new Punto(10, 10);
        Punto puntC = new Punto(-3, 7);

        System.out.println("Coordenades inicials:");
        puntA.mostrarPunt();
        puntB.mostrarPunt();
        puntC.mostrarPunt();

        puntA.desplaza(2, 5);
        puntB.desplaza(-3, 1);
        puntC.desplaza(1, 3);

        System.out.println("Coordenades modificades:");
        puntA.mostrarPunt();
        puntB.mostrarPunt();
        puntC.mostrarPunt();

        System.out.println("Distancias entre punts:");
        System.out.println("Entre puntA i puntB: " + puntA.distancia(puntB));
        System.out.println("Entre puntB i puntC: " + puntB.distancia(puntC));
        System.out.println("Entre puntA i puntC: " + puntA.distancia(puntC));
     }   
}
  