import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        // Ejercicio de practica para el examen.
        double sueldo = 0;
        double suma = 0;
        double max_sueldo = Double.MIN_VALUE;
        double min_sueldo = Double.MAX_VALUE;
        int posicion_max = 0;
        int posicion_min = 0;
        int contador = 0;
        int contador2mil = 0;
        double media;

        Scanner sc = new Scanner(System.in);
        while (sueldo != -1) {
            System.out.println("Introduce sueldo ('-1' para terminar):");
            sueldo = sc.nextDouble();

            if (sueldo != -1) {
                ++contador;
                suma = suma + sueldo;

                if (sueldo > max_sueldo) {
                    max_sueldo = sueldo;
                    posicion_max = contador;
                }

                if (sueldo < min_sueldo) {
                    min_sueldo = sueldo;
                    posicion_min = contador;

                }

                if (sueldo > 2000) {
                    ++contador2mil;

                }
            }

        }
        sc.close();
        media = suma / contador;
        System.out.println("Media: " + media);
        System.out.println("Sueldo mas alto: " + max_sueldo + " |Introducido en posición: " + posicion_max);
        System.out.println("Sueldo mas bajo: " + min_sueldo + " |Introducido en posición: " + posicion_min);
        System.out.println("Empleados que cobran mas de dosmil: " + contador2mil);

    }
}
