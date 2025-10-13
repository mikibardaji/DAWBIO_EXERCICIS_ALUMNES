import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
//Programa que entra un número natural N i mostra els números parells compresos entre 1 i N. Per fer-ho utilitzeu un comptador sumant d'1 en 1.
int n, contador=1;
System.out.println("Introdueix un numero natural: ");
n = sc.nextInt();

for (contador=1; contador<=n; contador = contador + 1){

    if (contador%2==0)
    {
        System.out.println("Numero parell: "+ contador);
    }
    else {
        System.out.println("Numero no parell: " + contador);

}
sc.close();
}
}
}
