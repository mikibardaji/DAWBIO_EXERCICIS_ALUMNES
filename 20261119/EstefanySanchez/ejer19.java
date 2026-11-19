import java.util.Scanner;

/**
 *
 * @author Estefany.SS
 * 
 * 
 * 1. Programa con un menú de tres opciones:
0. Salir.
1. Cálculos con rectángulos
2. Cálculos con círculos

El programa presentará iterativamente el menú al usuario para que elija 
* una de las opciones hasta que elija salir.
Es necesario crear un método void muestraMenu() para mostrar el menú.
Para cada figura se calculará el perímetro y el área. Es necesario preguntar 
* al usuario las dimensiones de la figura e invocar métodos específicos para cada cálculo.
 * 
 * 
 * 
 * 
 * 
 */
public class ejer19 {
    
    // Metodo que muestra el menu
    public static void mostraMenu() {

        System.out.println("\n===== MENU PRINCIPAL =====");
        System.out.println("0. Salir");
        System.out.println("1. Calculos con rectangulos");
        System.out.println("2. Calculos con circulos");
        System.out.print("Elige una opcion: ");
    }

    // Metodo que calcula el area del rectangulo
    public static double areaRectangulo(double base, double altura) {

        return base * altura;
    }

    // Metodo que calcula el perimetro del rectangulo
    public static double perimetroRectangulo(double base, double altura) {

        return 2 * (base + altura);
    }

    // Metodo que calcula el area del circulo
    public static double areaCirculo(double radio) {

        return Math.PI * radio * radio;
    }

    // Metodo que calcula el perimetro del circulo
    public static double perimetroCirculo(double radio) {

        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {

        // Creamos el Scanner para leer los datos
        Scanner lector = new Scanner(System.in);

        // Variable para guardar la opcion elegida
        int opcion;

        // El menu se repite mientras la opcion no sea 0
        do {

            // Mostramos el menu
            mostraMenu();

            // Leemos la opcion del usuario
            opcion = lector.nextInt();

            // Comprobamos la opcion elegida
            switch (opcion) {

                case 0:

                    // Si elige 0, salimos del programa
                    System.out.println("Has salido del programa.");
                    break;

                case 1:

                    // Pedimos los datos del rectangulo
                    System.out.print("Introduce la base: ");
                    double base = lector.nextDouble();

                    System.out.print("Introduce la altura: ");
                    double altura = lector.nextDouble();

                    // Comprobamos que las medidas sean positivas
                    if (base > 0 && altura > 0) {

                        // Llamamos a los metodos del rectangulo
                        double area = areaRectangulo(base, altura);
                        double perimetro = perimetroRectangulo(base, altura);

                        // Mostramos los resultados
                        System.out.println("Area del rectangulo: " + area);
                        System.out.println("Perimetro del rectangulo: " + perimetro);

                    } else {
                        System.out.println("Las medidas deben ser mayores que 0.");
                    }

                    break;

                case 2:

                    // Pedimos el radio del circulo
                    System.out.print("Introduce el radio: ");
                    double radio = lector.nextDouble();

                    // Comprobamos que el radio sea positivo
                    if (radio > 0) {

                        // Llamamos a los metodos del circulo
                        double area = areaCirculo(radio);
                        double perimetro = perimetroCirculo(radio);

                        // Mostramos los resultados
                        System.out.println("Area del circulo: " + area);
                        System.out.println("Perimetro del circulo: " + perimetro);

                    } else {
                        System.out.println("El radio debe ser mayor que 0.");
                    }

                    break;

                default:

                    // Si introduce una opcion diferente
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 0);

       
    }
}
    
    
    
 
