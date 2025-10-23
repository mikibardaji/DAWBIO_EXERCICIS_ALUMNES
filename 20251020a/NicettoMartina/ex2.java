import java.util.Scanner;

public class ex2 {
    // Programa que demana a l’usuari una edat i indica si és major d’edat (edat major o igual a 18 anys).
    // Ha d’implementar un mètode amb el prototip boolean esMajorEdat(int edat).

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu edad: ");
        int edad = sc.nextInt();

        
        if (mayor(edad)) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }


    private static boolean mayor(int edad) 
    {
        return edad >= 18;
    }
}
