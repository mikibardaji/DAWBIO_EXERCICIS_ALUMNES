import java.util.Scanner;

public class ex3 {
public static void main(String[] args) {
    //Programa que demana a l’usuari dos números enters i mostra quin és el menor. Cal implementar i usar el mètode int menor(int x, int y), el qual retorna el menor dels dos passats com a paràmetres.
    int ValorMenor = ValorMenor();
    System.out.println("El valor més petit és: " + ValorMenor);
}

private static int ValorMenor() {

    Scanner sc = new Scanner(System.in);
    int valor1, valor2;
    System.out.print("Introdueixi el primer valor: ");
    valor1 = sc.nextInt();
    System.out.print("Introdueixi el segon valor: ");
    valor2 = sc.nextInt();
    if (valor1 < valor2) 
    {
        return valor1;
    } else {
        return valor2;
    }
}}
