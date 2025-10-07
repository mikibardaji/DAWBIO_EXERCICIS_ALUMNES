import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        double euros = 1;
        double pArgentino = 1674;
        double dolar = 1,17;
        double libra = 0,87;
        double tuCambio;

        System.out.println("Menu cambia tus euros a: ");
        System.out.println("1) dolar");
        System.out.println("2) peso Argentino")
        System.out.println("3) libra esterlina");
        tuCambio = sc.nextDouble();
        System.out.println("Cuantos euros quiere cambiar?");
        euros = sc.nextDouble();


        if (tuCambio == 1) {
            System.out.println("tu cambio en dolar es de " + euros * dolar);
        } else if (tuCambio == 2) {
            System.out.println("tu cambio en pesos argentinos es de " + euros * pArgentino);
        } else if (tuCambio == 3) {
            System.out.println("tu cambio en libras esterlinas es de " + euros * libra);
        }

        System.out.println("gracias por su compra");






        sc.close();
    }
}
