/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon;
import Objectes.PokemonVeri;
import Objectes.PokemonElectric;
import Objectes.PokemonAigua;
import Objectes.Pokemon;
import Objectes.LlistaNoms;
import java.util.Scanner;
/**
 *
 * @author claud
 */
public class Pokemonmain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nom Pokemon 1:");
        LlistaNoms nom1 = LlistaNoms.valueOf(sc.next());

        System.out.println("Tipus (aigua/electric/veri):");
        String tipus1 = sc.next();

        Pokemon p1 = crearPokemon(nom1, tipus1);

        System.out.println("Nom Pokemon 2:");
        LlistaNoms nom2 = LlistaNoms.valueOf(sc.next());

        System.out.println("Tipus (aigua/electric/veri):");
        String tipus2 = sc.next();

        Pokemon p2 = crearPokemon(nom2, tipus2);

        while (p1.isViu() && p2.isViu()) {
            p2.recibirImpacto(p1);
            if (p2.isViu()) {
                p1.recibirImpacto(p2);
            }
        }
    }

    private static Pokemon crearPokemon(LlistaNoms nom, String tipus) {
    if (tipus.equals("aigua")) {
        return new PokemonAigua(nom);
    } else if (tipus.equals("electric")) {
        return new PokemonElectric(nom);
    } else {
        return new PokemonVeri(nom);
    }
}
    }

   
