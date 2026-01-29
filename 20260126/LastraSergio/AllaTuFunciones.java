import java.util.Random;
import java.util.Scanner;

public class AllaTuFunciones {
    public static void main(String[] args) throws Exception {
        
    }

    public static int[] ponerListaPremios() {
        int[] premiosConcurso = {
            1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 
            500, 750
        };
        return premiosConcurso;
    }

    public static int[] sortearCajas(int[] premiosConcurso) {
        Random random = new Random();
        int[] arrayCajas = new int[premiosConcurso.length];
        
        for (int i = 0; i < premiosConcurso.length; i++) {
            int posicion;
            do {
                posicion = random.nextInt(arrayCajas.length);
            } while (arrayCajas[posicion] != 0);
            
            arrayCajas[posicion] = premiosConcurso[i];
        }
        
        return arrayCajas;
    }

    public static void mostrarTodosLosPremiosPrograma(int[] premiosConcurso) {
        System.out.println("\n=== PREMIOS DEL CONCURSO ===");
        for (int i = 0; i < premiosConcurso.length; i++) {
            System.out.println("Premio " + (i + 1) + ": " + premiosConcurso[i] + " €");
        }
        System.out.println("============================\n");
    }

    public static void mostrarPremioCaja(int[] arrayCajas, int posicion) {
        System.out.println("La caja " + (posicion + 1) + " contiene: " + arrayCajas[posicion] + " €");
    }

    public static int mostrarPremioCajaConRetorno(int[] arrayCajas, int posicion) {
        int valorPremioCaja = arrayCajas[posicion];
        System.out.println("La caja " + (posicion + 1) + " contiene: " + valorPremioCaja + " €");
        return valorPremioCaja;
    }

    public static boolean pedirSiTePlantas(Scanner scanner) {
        System.out.print("¿Te plantas? (SI/NO): ");
        String respuesta = scanner.next().trim().toUpperCase();
        
        return respuesta.equals("SI") || respuesta.equals("SÍ") || respuesta.equals("S");
    }
}
