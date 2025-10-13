package class20251013;

import java.util.Scanner;

public class exercici3 {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner (System.in);
    
System.out.print("Introduce un número: ");
int N = sc.nextInt();

int contador= 2;

while (contador <= N) {
    System.out.println(contador);
    contador += 2;
}
sc.close();

    }
}