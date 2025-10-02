import java.util.Scanner;

public class Ex13_moneda {
    /*Creo 3 variables, la del euro, la transformación y el tipo de moneda
     * Si elije el dolar pongo el factor de conversión y lo muestro
     * Si elije el yen pongo el factor de conversión y lo muestro
     * Si elije el won pongo el factor de conversión y lo muestro
     * Si elije alguna opción que no esté, muestro que esa moneda no es válida
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double euro, conversion;
        char moneda;

        System.out.println("Euros: ");
        euro = sc.nextDouble();

        System.out.println("¿A qué moneda la quieres convertir? Escribe la letra: d (dólar), y (yen), w (won): ");
        moneda = sc.next().charAt(0);

        if (moneda =='d')
        {
            conversion= euro*1.17;
            System.out.println(conversion + " dólares");
        }
        else if (moneda=='y')
        {
            conversion = euro*172.7;
            System.out.println(conversion + " yenes");
        }
        else if (moneda=='w')
        {
            conversion= euro*1649.85;
            System.out.println(conversion + "wones");
        }
        else 
        {
            System.out.println("Moneda no válida");
        }
    }
}