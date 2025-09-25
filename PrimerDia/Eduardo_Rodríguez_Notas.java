import java.util.Scanner;

public class Eduardo_Rodríguez_Notas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double nota = 0;

        System.out.println("");
        System.out.println("Cual es tu nota: ");
        nota = sc.nextDouble();

        if (nota >= 5 && nota <= 5.99)  {
            System.out.println("Aprovado");
        }
        else if (nota >= 6 && nota <= 8.99)  {
            System.out.println("Notable");
        }
        else if (nota >= 9 && nota <= 10)  {
            System.out.println("Excelente");
        }
        else if (nota >= 0 && nota <= 4.99)  {
            System.out.println("Suspendido");
        }
        else {
            System.out.println("Nota no valida");
        }
    
    }
}
