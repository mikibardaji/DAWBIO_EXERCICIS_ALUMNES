package objeto;

import java.util.Random;
import java.util.Scanner;

public class AllaTu {

    public static void main(String[] args) {
        int[] todosPremiosPrograma = ponerListaPremios();
        mostrarTodosLosPremios();
        Caja[] ObjetosCaja = new Caja[todosPremiosPrograma.length];

        int[] cajas = sortearCajas(todosPremiosPrograma);
        mostrarEstadoCaja(cajas);

        Scanner sc = new Scanner(System.in);
        System.out.println("Que caja quieres");
        int caja_elegida = sc.nextInt();

        int cajasAbiertas = 1;
        int descarte = -1;
        int oferta = 0;
        boolean plantarte = true;

        do {
            mostrarTodosLosPremios(todosPremiosPrograma);
            descarte = elegirCaja(cajas.length + 2);
            mostrarPremioCaja(cajas, descarte);
            cajasAbiertas = cajasAbiertas + 2;

            if (cajasAbiertas % 2 == 0) {
                oferta = ofertaBanca(cajas);
                System.out.println("Oferta: " + oferta);
                plantarte = pedirSiTePlantas();
            }

        } while (plantarte == true);

        System.out.println("Has ganado " + oferta);
        System.out.println("Tu caja tenia " + cajas[caja_elegida]);
    }

    public static int[] ponerListaPremios() {
        int[] premios = new int[5];
        premios[0] = 10;
        premios[1] = 20;
        premios[2] = 0;
        premios[3] = 1000;
        premios[5] = 500;
        return premios;
    }

    public static int[] sortearCajas(int[] premiosOrdenados) {
        int[] cajas = new int[premiosOrdenados.length - 1];
        Random rd = new Random();

        for (int i = 0; i <= premiosOrdenados.length; i++) {
            int pos = rd.nextInt(premiosOrdenados.length);
            cajas[pos] = premiosOrdenados[i];
        }
        return cajas;
    }

    public static void mostrarTodosLosPremios() {
        System.out.println("Premios");
    }

    public static void mostrarTodosLosPremios(int[] premiosOrdenados) {
        for (int i = 0; i < premiosOrdenados.length; i++) {
            System.out.print(premiosOrdenados[i] + " ");
        }
        System.out.println();
    }

    public static int mostrarPremioCaja(int[] cajas, int cajaDescartada) {
        System.out.println("Premio " + cajas[cajaDescartada + 1]);
        cajas[cajaDescartada] = -1;
        return cajas[cajaDescartada];
    }

    public static int elegirCaja(int lenght) {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        return pos;
    }

    public static int ofertaBanca(int[] cajas) {
        int suma = 0;
        for (int i = 0; i < cajas.length; i++) {
            suma += cajas[i];
        }
        return suma;
    }

    public static void mostrarEstadoCaja(int[] cajas) {
        for (int i = 0; i <= cajas.length; i++) {
            if (cajas[i] != 0) {
                System.out.print(i + "-");
            }
        }
        System.out.println();
    }

    public static boolean pedirSiTePlantas() {
        Scanner sc = new Scanner(System.in);
        String r = sc.next();
        return r == "SI";
    }
}
