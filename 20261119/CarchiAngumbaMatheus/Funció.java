package com.mycompany.jocpedrapaper;

import java.util.Random;

public class Joc {

    // Funció fusionada: genera jugada de l'ordinador, imprimeix el guanyador i retorna la puntuació + 1
    public static int gestionarTirada(int ganador, int score) {
        Random rand = new Random();
        int jugadaOrdenador = rand.nextInt(3); // Genera 0, 1 o 2 (inclosos)
        System.out.println("Jugada de l'ordinador: " + jugadaOrdenador);

        if (ganador == 0) {
            System.out.println("hay empate");
        } else if (ganador == 1) {
            System.out.println("has ganado");
        } else if (ganador == 2) {
            System.out.println("ha ganado el ordenador");
        }

        return score + 1;
    }

    public static void main(String[] args) {
        int puntuacio = 0;

        // Exemple d'ús passant un guanyador (0, 1 o 2) i la puntuació actual
        puntuacio = gestionarTirada(1, puntuacio);
        System.out.println("Nova puntuació: " + puntuacio);
    }
}