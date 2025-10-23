import java.util.Scanner;

public class ex1 {
    public static double producte(double x, double y) {
        return x * y;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Intoduce el primer numero real: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Intoduce el segun numero real:");
        double num2 = sc.nextDouble();
        
        
        double resultat = producte(num1, num2);
        
       
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + resultat);

        
    }
}