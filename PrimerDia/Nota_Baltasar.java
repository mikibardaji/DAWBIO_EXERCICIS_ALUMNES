import java.util.Scanner;

public class Nota {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in); 

double nota;
System.out.println("Que nota tines?");
    nota = sc.nextDouble();

     if (nota >= 0 && nota < 5) {
            System.out.println("Has suspendido");
        } 
        
        else if (nota >= 5 && nota < 6) {
            System.out.println("Has aprobado");
        } 
        
        else if (nota >= 6 && nota < 9) {
            System.out.println("Notable");
        } 
        
        else if (nota >= 9 && nota <= 10) {
            System.out.println("Excelente");
        } 
        
        else {
            System.out.println(" Nota no válida, debe estar entre 0 y 10.");
        }
   
}
}
