1.	Programa que pregunti el nom a l’usuari i doni el  “bon dia” indicant el nom.

import java.util.Scanner;

public class Secuencial1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;

        System.out.println("¿Cómo te llamas?");
        nombre = sc.nextLine();

        System.out.println("Bon dia, " + nombre);

        sc.close();
    }
}



2.	Programa que calcula l'àrea d'un quadrat el costat del qual s'introdueix per teclat.

import java.util.Scanner;

public class Secuencial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lado;
        double area;

        System.out.println("Introduce el lado del cuadrado:");
        lado = sc.nextDouble();

        area = lado * lado;

        System.out.println("El área del cuadrado es: " + area);

        sc.close();
    }
}


3.	Programa que llegeixi dos números, calcula i mostra el valor de la suma, la resta, el producte i la divisió.
  

import java.util.Scanner;

public class Secuencial3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        double suma;
        double resta;
        double producto;
        double division;

        System.out.println("Introduce el primer número:");
        num1 = sc.nextDouble();

        System.out.println("Introduce el segundo número (distinto de cero):");
        num2 = sc.nextDouble();

        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        division = num1 / num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("División: " + division);

        sc.close();
    }
}

4.	Programa que pren com a dada d'entrada un número que correspon a la longitud d'un radi i ens escriu la longitud de la circumferència, l'àrea del cercle.

import java.util.Scanner;

public class Secuencial4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radio;
        double longitud;
        double area;

        System.out.println("Introduce el radio:");
        radio = sc.nextDouble();

        longitud = 2 * Math.PI * radio;
        area = Math.PI * radio * radio;

        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Área del círculo: " + area);

        sc.close();
    }
}



5.	Programa que, atès el preu nominal d'un article i el preu de venda real, ens mostri el percentatge de descompte realitzat.

  
import java.util.Scanner;

public class Secuencial5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precioOriginal;
        double precioFinal;
        double porcentajeDescuento;

        System.out.println("Introduce el precio original:");
        precioOriginal = sc.nextDouble();

        System.out.println("Introduce el precio final de venta:");
        precioFinal = sc.nextDouble();

        porcentajeDescuento =
                (precioOriginal - precioFinal) / precioOriginal * 100;

        System.out.println("El descuento es del "
                + porcentajeDescuento + " %");

        sc.close();
    }
}


6.	Programa que llegeixi un valor corresponent a una temperatura en graus Kelvin i escriviu la temperatura en graus Celsius.  Despres que passi el Celsius a Farenheit (busqueu les formules a Google)


import java.util.Scanner;

public class Secuencial6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kelvin;
        double celsius;
        double fahrenheit;

        System.out.println("Introduce la temperatura en Kelvin:");
        kelvin = sc.nextDouble();

        celsius = kelvin - 273.15;
        fahrenheit = celsius * 9.0 / 5.0 + 32;

        System.out.println("Temperatura en Celsius: " + celsius);
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);

        sc.close();
    }
}


7.	Programa que transforma las milles nàutiques a metres.

import java.util.Scanner;

public class Secuencial7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double millas;
        double metros;

        System.out.println("Introduce las millas náuticas:");
        millas = sc.nextDouble();

        metros = millas * 1852;

        System.out.println("Equivalen a " + metros + " metros");

        sc.close();
    }
}


