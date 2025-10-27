import java.util.Scanner;

public class ex1 {
public static void main(String[] args){
    //Programa que demana a l’usuari dos números reals i mostra el seu producte. 
    double producte = producte();
    System.out.println("El producte dels dos números és: " + producte);
}

private static double producte(){

    Scanner sc = new Scanner(System.in);
    System.out.println("Introdueixi el primer valor: ");
    double valor1 = sc.nextDouble();
    System.out.println("Introdueixi el segon valor: ");
    double valor2 = sc.nextDouble();

    double producte = valor1 * valor2;
    return producte;
    }
}
