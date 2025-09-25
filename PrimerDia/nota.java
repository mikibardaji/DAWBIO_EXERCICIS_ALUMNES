import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
    double nota;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);    
    System.out.println("introduzca la nota");
    nota = sc.nextDouble();


    if (nota < 5 && nota >= 0){

        System.out.println("Reprobado");
    } else if (nota < 6 && nota >= 5){
        System.out.println("aprobado");
    } else if (nota < 9 && nota >= 6){
        System.out.println("notable");
    } else if (nota <= 10 && nota >= 9){
        System.out.println("excelente");
    } else {
        System.out.println("nota no valida");
    }
    
    }
} 
