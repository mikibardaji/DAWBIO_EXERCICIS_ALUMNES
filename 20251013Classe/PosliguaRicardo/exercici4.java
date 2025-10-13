package class20251013;

import java.util.Scanner;

public class exercici4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);

System.out.println("Introduce un número natural: ");
int N = sc.nextInt();

int contador =1 ;

while (contador <= N) {

        if (contador %2 == 0) {
            System.out.println("El numero par es: "+ contador);
        }
        contador ++ ;
        }

    sc.close();

    }
}
