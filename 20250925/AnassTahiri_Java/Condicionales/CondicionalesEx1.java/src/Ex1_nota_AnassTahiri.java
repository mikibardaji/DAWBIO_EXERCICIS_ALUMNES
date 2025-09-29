import java.util.Scanner;

public class nota {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        double nota;
        nota = sc.nextDouble();

        if (nota <= 4.99) {
            System.out.println("Suspenso");
        } 
        else if (nota >= 5 && nota < 5.99) {
            System.out.println("Aprovado");
        } 
        else if (nota >= 6 && nota < 8.99) {
            System.out.println("Notable");
        } 
        else if (nota >= 9 && nota <= 10) {
            System.out.println("Excelente");
        } 
        else {
            System.out.println("Nota invlida");
        }
      
    }
}