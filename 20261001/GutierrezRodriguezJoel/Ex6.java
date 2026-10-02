


import java.util.Scanner;

public class Ex6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Llegir la temperatura en Kelvin
        System.out.print("Entra la temperatura en graus Kelvin: ");
        double kelvin = lector.nextDouble();
        
        // Convertir de Kelvin a Celsius
        double celsius = kelvin - 273.15;
        System.out.println("Temperatura en Celsius: " + celsius);
        
        // Convertir de Celsius a Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
    }
}
