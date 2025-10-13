import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
//Programa que entra un número natural N i mostra els números parells compresos entre 1 i N. Per fer-ho utilitzeu un comptador i suma de 2 en 2.
int n, contador=2;
System.out.println("Introdueix un numero natural: ");
n = sc.nextInt();

for (contador=2; contador<=n; contador++){
    
    if (contador%2==0) 
    {
        System.out.println("Numero parell: " + contador);
    }
sc.close();
}
}
}