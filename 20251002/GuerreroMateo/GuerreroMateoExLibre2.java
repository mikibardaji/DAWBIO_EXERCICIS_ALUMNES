import java.util.Scanner;

public class GuerreroMateoExLibre2 {
    public static void main(String[] args) {

        //Programa que muestra la cantidad de agua diaria recomendada según tu edad:
        // El usuario introduce la edad y después escoge en que unidad ver el resultado.

        int edad;
        double cantidad = 0;
        int unidad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, introduce tu edad:");
        edad = sc.nextInt();

        if (edad<13) {
            cantidad = 1.5;
            
        } else if (edad >=13 && edad <=17) {
            cantidad = 2;
            
        }else if (edad >=18 && edad <=65) {
            cantidad = 2.7;
            
        }else if (edad >65) {
            cantidad = 2.5;
            
        }

        System.out.println("-- Elige una opción para ver tu recomendación de agua: --");
        System.out.println("1 - En litros");
        System.out.println("2 - En mililitros");
        System.out.println("3 - En vasos");

        unidad = sc.nextInt();

        switch (unidad) {
            case 1:
                System.out.println("Necesitas: " + cantidad + " litros al día.");
                
                break;
            
            case 2:
                System.out.println("Necesitas: " + cantidad * 1000 + " mililitros al día.");
            
                break;
            
            case 3:
                System.out.println("Necesitas: " + cantidad * 4 + " vasos al día.");
                
                break;

            default:
                System.out.println("¡Número no válido!");
                break;
        }

        sc.close();

    }
    
}
