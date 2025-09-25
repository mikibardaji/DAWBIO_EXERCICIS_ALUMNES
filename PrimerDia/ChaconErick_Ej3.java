import java.util.Scanner;

public class LectorNumeros {

    public static void main(String[] args) {
    /* programa que lee dos numeros e indica el mas grande:
     * solicitar el primer numero
     * insertar numero
     * solicitar el segundo numero
     * insertar numero
     * calcular los numeros y compararlos
     * indicar al usuario cual es el numero mayor
     */
        double numeroA, numeroB;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("introduce numero");
        numeroA = lector.nextDouble();

        System.out.println("Introduce el siguiente numero");
        numeroB = lector.nextDouble();

        if (numeroA > numeroB) 
            {
        System.out.println("El numero mas grande es:"+numeroA);
        
            }
        else if(numeroB > numeroA)
            {
            System.out.println("El numero mas grande es:"+numeroB);
            }
        else
            { 
            System.out.println("Los numeros introducidos son iguales");    
            }    
    }

}
