package main;

import java.util.Scanner;
import models.Agua;
import models.Electrico;
import models.ListaNoms;
import models.Pokemon;
import models.Veneno;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pokemon p1 = crearPokemon(sc, 1);
        Pokemon p2 = crearPokemon(sc, 2);

        System.out.println("== Comienza el combate ==");

        while (p1.isVivo() && p2.isVivo()) {
            p2.recibirImpacto(p1);

            if (p1.isVivo() && p2.isVivo()) {
                p1.recibirImpacto(p2);
            }
        }

        System.out.println("== Fin del combate ==");

    }

    public static Pokemon crearPokemon(Scanner sc, int num) {
        System.out.println("Teclea el nombre del pokemon " + num + ": ");
        ListaNoms nombre = ListaNoms.valueOf(sc.nextLine());
        System.out.println("Selecciona un tipo de pokemon (agua, electrico, veneno): ");
        String tipo = sc.nextLine();

        switch (tipo.toLowerCase()) {
            case "agua":
                return new Agua(nombre);
            case "electrico":
                return new Electrico(nombre);
            case "veneno":
                return new Veneno(nombre);
            default:
                throw new IllegalArgumentException("Tipo no valido");
        }
    }

}
