/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package allatu;
import java.util.Random;
import java.util.Scanner;
import objecte.Caja;
/**
 *
 * @author claud
 */
public class Allatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] todosPremiosPrograma = ponerListaPremios();
        mostrarTodosLosPremios(todosPremiosPrograma);

        Caja[] cajas = sortearCajas(todosPremiosPrograma);
        mostrarEstadoCaja(cajas);

        Scanner sc = new Scanner(System.in);
        System.out.println("Que caja quieres maximo - " + cajas.length);
        final int caja_elegida = sc.nextInt() - 1;

        int cajasAbiertas = 0;
        int descarte=0;
        int oferta = 0;
        boolean plantarte = false;

        do {
            mostrarTodosLosPremios(todosPremiosPrograma);
            mostrarEstadoCaja(cajas);

            descarte=elegirCaja(cajas.length);
            mostrarPremioCaja(cajas, descarte);
            cajasAbiertas++;

            if (cajasAbiertas % 3 == 0) {
                oferta = ofertaBanca(cajas);
                System.out.println("Banquero te ofrece " + oferta + " € ");
                plantarte = pedirSiTePlantas();
            }

        } while (!plantarte && cajasAbrir(cajas));

        if (plantarte) {
            System.out.println("Has ganado " + oferta + " euros!");
        } else {
            System.out.println("Tu caja tenia " + mostrarPremioCaja(cajas, caja_elegida-1) + " euros!");
        }
    }

    public static int[] ponerListaPremios() {
        int[] todosPremiosPrograma = {10, 20, 30, 50, 100, 500, 1000, 2000};
        return todosPremiosPrograma;
    }

    public static Caja[] sortearCajas(int[] premiosOrdenados) {
        Caja[] cajas = new Caja[premiosOrdenados.length];
        Random rd = new Random();

        for (int i = 0; i < premiosOrdenados.length; i++) {
            int posicion;
            do {
                posicion = rd.nextInt(premiosOrdenados.length);
            } while (cajas[posicion] != null);

            cajas[posicion] = new Caja(premiosOrdenados[i]);
        }
        System.out.println("Cajas ya sorteadas");
        return cajas;
    }

    public static void mostrarTodosLosPremios(int[] premiosOrdenados) {
        System.out.println("Premios aun por abrir");
        for (int i = 0; i < premiosOrdenados.length; i++) {
            if(premiosOrdenados[i]!=0)
            {
                System.out.print(premiosOrdenados[i]+"-");
            }
        }
        System.out.println("");
    }

    public static int mostrarPremioCaja(Caja[] cajas, int cajaDescartada) {
        System.out.println("Has descartado " + cajas[cajaDescartada].getPremio() + " euros!");
        int premio = cajas[cajaDescartada].getPremio();
        cajas[cajaDescartada].abrir();
        return premio;
    }

    public static int elegirCaja(int length) {
        Scanner sc = new Scanner(System.in);
        int posicion;
        do {
            System.out.println("Caja a descartar 1-" + length);
            posicion = sc.nextInt();
        } while (posicion < 1 || posicion > length);
        return posicion;
    }

    public static int ofertaBanca(Caja[] cajas) {
        int acumPremiosDescubrir = 0;
        int cajasAbrir=0;

        for (Caja c : cajas) {
            if (!c.isAbierta()) {
                acumPremiosDescubrir += c.getPremio();
                cajasAbrir++;
            }
        }
        return acumPremiosDescubrir / cajasAbrir;
    }

    public static void mostrarEstadoCaja(Caja[] cajas) {
        System.out.println("Cajas por abrir:");
        for (int i = 0; i < cajas.length; i++) {
            if (!cajas[i].isAbierta()) {
                System.out.print((i + 1) + "-");
            }
        }
        System.out.println("");
    }

    public static boolean pedirSiTePlantas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres plantarte? (Si/No)");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("SI"))
            return true;
        else
            return false;
    }

    private static boolean cajasAbrir(Caja[] cajas) {
        int abrir = 0;
        for (int i = 0; i < cajas.length; i++) {
        if (!cajas[i].isAbierta()) {
            abrir++;
        }
        if (abrir > 1) {
            return true;
        }
       }
        return false;
    }
}
