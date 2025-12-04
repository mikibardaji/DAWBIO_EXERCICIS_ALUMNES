package coodenadasPunto;

import coodenadasPunto.punto;
import java.util.Scanner;

public class coordenadasPunto 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        punto P1= new punto(5,0);
        P1.imprime();

        punto P2=new punto(10,10);
        P2.imprime();

        punto P3=new punto (-3, 7);
        P3.imprime();

        System.out.println("Distancia desplazada(nuevas coordenadas):");
        P1.desplaza(4, -7);
        P2.desplaza(2, 10);
        P3.desplaza(5, 15); 

        P1.imprime();
        P2.imprime();
        P3.imprime();

        System.out.println("Punto aleatorio:");
        punto random = punto.crearPuntoAleatorio();
        random.imprime();
    }
}