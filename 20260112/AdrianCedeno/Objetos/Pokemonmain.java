package pokemon;
import java.util.Scanner;
public class Pokemonmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nom Pokemon 1:");
        LlistaNoms nom1 = LlistaNoms.valueOf(sc.next());

        System.out.println("Tipos: (aigua/electric/veri):");
        String tipus1 = sc.next();

        Pokemon p1 = crearPokemon(nom1, tipus1);

        System.out.println("Nom Pokemon 2:");
        LlistaNoms nom2 = LlistaNoms.valueOf(sc.next());

        System.out.println("Tipos (aigua/electric/veri):");
        String tipus2 = sc.next();

        Pokemon p2 = crearPokemon(nom2, tipus2);

        while (p1.isVivo() && p2.isVivo()) {
            p2.recibirImpacto(p1);
            if (p2.isVivo()) {
                p1.recibirImpacto(p2);
            }
        }
    }

    private static Pokemon crearPokemon(LlistaNoms nom, String tipus) {
        switch (tipus) {
            case "aigua":
                return new PokemonAigua(nom);
            case "electric":
                return new PokemonElectric(nom);
            default:
                return new PokemonVeri(nom);
        }
    }
}
   
