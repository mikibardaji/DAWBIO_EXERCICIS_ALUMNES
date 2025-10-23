package Funciones;

import java.util.Scanner;

public class Ex2A2 {
      public static boolean esMajorEdat(int edat) {
        return edat >= 18;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Introdueix la teva edat: ");
        int edat = entrada.nextInt();

        
        if (esMajorEdat(edat)) {
            System.out.println("Ets major d'edat.");
        } else {
            System.out.println("Ets menor d'edat.");
        }

}
}
