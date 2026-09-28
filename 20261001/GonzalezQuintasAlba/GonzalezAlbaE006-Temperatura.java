/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;
import java.util.Scanner;
/**
 *
 * @author albagonzalezquintas1985
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temp_kelvin,temp_celsius, temp_farenheit =0.0;
        final double KELVINTOCELSIUS=273.15;
        final double CELSIUSTOFARENHEIT1=1.8;
        final double CELSIUSTOFARENHEIT2=32;
        System.out.println("Introduzca temperatura en grados Kelvin");
        Scanner lector=new Scanner(System.in);
        temp_kelvin=lector.nextDouble();
        temp_celsius=temp_kelvin-KELVINTOCELSIUS;
        System.out.println("La temperatura "+temp_kelvin+"kelvins equivale a "+temp_celsius+" ºC");
        temp_farenheit=(temp_celsius*CELSIUSTOFARENHEIT1)+CELSIUSTOFARENHEIT2;
        
        System.out.println("La temperatura "+temp_celsius+"ºC equivale a "+temp_farenheit+ " ºF");

        
    }
    
}
