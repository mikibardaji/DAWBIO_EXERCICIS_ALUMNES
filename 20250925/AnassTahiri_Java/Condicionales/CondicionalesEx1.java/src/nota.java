import java.util.Scanner;

public class nota {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

    double nota;
    System.out.println("Introduce la nota (0-10):");
    nota = sc.nextDouble();

        if (nota <= 4.99) {
            System.out.println("Suspenso");
        } 
        else if (nota >= 5 && nota < 6) {
            System.out.println("Aprobado");
        } 
        else if (nota >= 6 && nota < 9) {
            System.out.println("Notable");
        } 
        else if (nota >= 9 && nota <= 10) {
            System.out.println("Excelente");
        } 
        else {
            System.out.println("Nota inválida");
        }
      
    }
}