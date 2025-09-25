import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        nota = sc.nextInt();
        if (nota >= 0 && nota <= 4.99) {
            System.out.println("deficiente mental");
        } else if (nota >= 5 && nota <= 6.99) {
            System.out.println("suficiente");
        }else if (nota >= 7 && nota <= 8.99) {
            System.out.println("notable");
        }else if (nota >= 9 && nota <= 10) {
            System.out.println("sobresaliente");
        }else{
            System.out.println("nota no valida");
        }
        
    }
}

