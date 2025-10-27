import java.util.Scanner;

public class ex4 {
public static void main(String[] args) {
    //Programa que demana a l’usuari un nombre enter i mostra si és positiu, zero o negatiu. Cal crear el mètode int obteSigne(int x), el qual retorna -1, 0, +1 segons el nombre és negatiu, zero o positiu, respectivament.
    int valor = valor();
    System.out.println("El valor introduït és: " + valor);
}

private static int valor() {
    Scanner sc = new Scanner(System.in);
    int valor;
    System.out.print("Introdueixi un valor: ");
    valor = sc.nextInt();
    if (valor > 0) 
    {
        System.out.println("El nombre és positiu.");
    } 
    else if (valor < 0) 
    {
        System.out.println("El nombre és negatiu.");
    } else 
    {
        System.out.println("El nombre és zero.");
    }
    return valor;
}}
